package com.teamsking.api.dto.open;

import com.teamsking.api.dto.Dto;
import java.util.Date;
import lombok.Data;

@Data
public class OpenActivityDto extends Dto {

    private Integer id;
    private Integer openId;
    private Integer courseId;
    private String title;
    private String location;
    private Date startTime;
    private Date endTime;
    private Integer createId;
    private Date createTime;
    private Integer updateId;
    private Date updateTime;
    private Integer deleteStatus;
    private String content;

}
