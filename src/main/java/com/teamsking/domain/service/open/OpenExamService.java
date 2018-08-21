package com.teamsking.domain.service.open;

import com.github.pagehelper.PageHelper;
import com.google.common.collect.Lists;
import com.teamsking.api.dto.open.OpenExamDto;
import com.teamsking.api.dto.open.OpenExamDtoMapper;
import com.teamsking.api.dto.open.OpenExamNameDto;
import com.teamsking.domain.entity.open.OpenExam;
import com.teamsking.domain.entity.open.OpenUserTeacher;
import com.teamsking.domain.entity.sys.UserTeacher;
import com.teamsking.domain.repository.OpenExamMapper;
import com.teamsking.domain.repository.OpenUserTeacherMapper;
import com.teamsking.domain.service.BaseService;
import com.teamsking.domain.service.sys.UserTeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.Page;

import java.util.List;

@Service
@Slf4j
public class OpenExamService extends BaseService {

    @Autowired
    OpenExamMapper openExamMapper;
    @Autowired
    OpenUserTeacherMapper openUserTeacherMapper;
    @Autowired
    UserTeacherService userTeacherService;


    /**
     * 根据班课id创建考试
     * @param openExamDto
     * @return
     */
    public int saveOpenExam(OpenExamDto openExamDto){

        OpenExam openExamEntity = OpenExamDtoMapper.INSTANCE.dtoToEntity(openExamDto);
        openExamEntity.setDeleteStatus(2);

        return openExamMapper.insert(openExamEntity);
    }


    /**
     * 根据班课id查询考试列表
     * @param openId
     * @param pageSize
     * @param pageNo
     * @return
     */
    public Page openExamList(int openId,int pageSize,int pageNo){

        PageHelper.startPage(pageNo, pageSize);
        //获取考试信息
        OpenExam openExam = new OpenExam();
        openExam.setDeleteStatus(2);
        openExam.setOpenId(openId);
        List<OpenExam> openExamList = openExamMapper.select(openExam);

        if(0 != openExamList.size()){

            //获取该班课下的教学老师
            //1.获取与该班课有关的教学老师Id
            OpenUserTeacher openUserTeacher = new OpenUserTeacher();
            openUserTeacher.setOpenId(openId);
            List<OpenUserTeacher> openUserTeacherList = openUserTeacherMapper.select(openUserTeacher);

            List<Integer> userTeacherIdList = Lists.newArrayList();
            for (OpenUserTeacher openTeacher : openUserTeacherList) {
                userTeacherIdList.add(openTeacher.getUserTeacherId());
            }

            //2.获取教学老师信息
            List<UserTeacher> userTeacherList = userTeacherService.getUserTeacherListByIds(userTeacherIdList);
            List<String> userTeacherNames = Lists.newArrayList();
            for (UserTeacher userTeacher:userTeacherList) {

                userTeacherNames.add(userTeacher.getUserName());

            }

            //数据转换
            List<OpenExamNameDto> openExamNameDtoList = OpenExamDtoMapper.INSTANCE.entityListNameDto(openExamList);

            for (OpenExamNameDto openExamNameDto: openExamNameDtoList) {

                openExamNameDto.setTeacherNames(userTeacherNames);

            }

            return convertPage((Page)openExamList,openExamNameDtoList);

        }else {
            Page page =null;
            return page;
        }



    }

}
