package com.teamsking.api.dto.course;

import lombok.Data;

import java.util.Date;

/**
*@author linhao
*/
@Data
public class CourseTestQuizDto {

    private Integer id;

    private Integer courseId;

    private Integer testId;

    private Integer sectionId;

    private Integer schoolId;

    private String title;

    private Integer quizId;

    private Integer createId;

    private Date createTime;

    private Integer updateId;

    private Date updateTime;

    private Integer deleteStatus;

}