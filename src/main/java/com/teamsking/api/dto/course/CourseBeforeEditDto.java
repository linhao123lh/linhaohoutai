package com.teamsking.api.dto.course;

import com.teamsking.api.dto.Dto;
import com.teamsking.api.dto.sys.UserDto;
import lombok.Data;

import java.util.List;

/**
*@author linhao
*/
@Data
public class CourseBeforeEditDto extends Dto {

    private Integer id;

    private String courseName;

    private String courseCover;

    private String keyWord;

    private Integer courseFree;

    private String courseIntroduction;

    private Integer categoryId;

    private Integer firstCategoryId;

    private List<CourseTeacherNameDto> courseTeacherList;

    private Integer teacherId;

    private Integer userId;

    private List<UserDto> userDtoListById;
}
