package com.teamsking.domain.service.course;


import com.teamsking.domain.entity.course.CourseWare;
import com.teamsking.domain.repository.CourseWareMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CourseWareService {

    @Autowired
    CourseWareMapper courseWareMapper;

    /**
     * 获取课程-课件管理列表
     *
     * @return
     */
    public List<CourseWare> list(){

        return courseWareMapper.selectAll();

    }

    /**
     * 添加课程-课件管理
     * @param courseWare
     * @return
     */
    public int save(CourseWare courseWare){

        return courseWareMapper.insert(courseWare);

    }

    /**
     * 删除课程-课件管理
     * @param id
     * @return
     */
    public int remove(Integer id){
        return courseWareMapper.deleteByPrimaryKey(id);
    }


    /**
     * 修改课程-课件管理
     * @param courseWare
     * @return
     */
    public int modify(CourseWare courseWare){

        return courseWareMapper.updateByPrimaryKeySelective(courseWare);

    }
}
