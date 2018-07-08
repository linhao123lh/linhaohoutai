package com.teamsking.api.dto.open;

import com.teamsking.api.dto.Dto;
import java.util.Date;
import lombok.Data;

@Data
public class OpenQuestionOptionDto extends Dto {

    private Integer id;
    private Integer courseId;
    private Integer openId;
    private Integer questionId;
    private String option;
    private Integer createId;
    private Date createTime;
    private Integer updateId;
    private Date updateTime;
    private Integer deleteStatus;

}
