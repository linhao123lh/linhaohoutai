package com.teamsking.api.dto.course;

import lombok.Data;

/**
*@author linhao
*/
@Data
public class CourseInsertDto {

    private String courseName;

    private String courseCover;

    private String KeyWord;

    private Integer courseFree;

    private Integer visibleRange;

    private String courseIntroduction;

    private Integer categoryId;

    private Integer[] teacherId;
}
