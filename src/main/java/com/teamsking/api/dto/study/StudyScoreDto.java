package com.teamsking.api.dto.study;

import com.teamsking.api.dto.Dto;
import java.math.BigDecimal;
import lombok.Data;


@Data
public class StudyScoreDto extends Dto {

    private Integer id;
    private Integer userId;
    private Integer openId;
    private BigDecimal totalScore;
    private BigDecimal videoScore;
    private BigDecimal testTotal;
    private BigDecimal assgnmentScore;
    private BigDecimal topicScore;
    private BigDecimal examingScore;
    private BigDecimal offlineScore;
    private String groupName;

}
