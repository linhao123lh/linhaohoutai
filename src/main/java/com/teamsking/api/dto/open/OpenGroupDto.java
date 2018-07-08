package com.teamsking.api.dto.open;

import com.teamsking.api.dto.Dto;
import java.util.Date;
import lombok.Data;

@Data
public class OpenGroupDto extends Dto {


    private Integer id;
    private String groupName;
    private Integer openId;
    private Integer userCount;
    private Integer leaderId;
    private Integer createId;
    private Date createTime;
    private Integer updateId;
    private Date updateTime;
    private Integer deleteStatus;


}
