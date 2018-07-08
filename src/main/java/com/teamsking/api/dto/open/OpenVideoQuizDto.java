package com.teamsking.api.dto.open;

import com.teamsking.api.dto.Dto;
import java.util.Date;
import lombok.Data;


@Data
public class OpenVideoQuizDto extends Dto {

    private Integer id;
    private Integer openId;
    private Integer schoolId;
    private Integer videoId;
    private Integer timeNode;
    private Integer quizId;
    private Integer createId;
    private Date createTime;
    private Integer updateId;
    private Date updateTime;
    private Integer deleteStatus;


}
