package com.teamsking.domain.entity.open;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`open_exam`")
public class OpenExam {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_exam.id
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    @Id
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_exam.open_id
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    private Integer openId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_exam.exam_type
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    private Integer examType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_exam.title
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_exam.start_time
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_exam.end_time
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_exam.paper_time
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    private Integer paperTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_exam.repair_condition
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    private Integer repairCondition;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_exam.repair_name
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    private String repairName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_exam.exam_limit
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    private Integer examLimit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_exam.exam_type_weight_guest
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    private Double examTypeWeightGuest;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_exam.exam_type_weight_main
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    private Double examTypeWeightMain;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_exam.score_day
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    private Integer scoreDay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_exam.cheat
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    private Integer cheat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_exam.join_condition
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    private Double joinCondition;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_exam.quiz_order
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    private Integer quizOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_exam.option_order
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    private Integer optionOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_exam.delete_status
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    private Integer deleteStatus;

    private String state;

    private String status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_exam.id
     *
     * @return the value of open_exam.id
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_exam.id
     *
     * @param id the value for open_exam.id
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_exam.open_id
     *
     * @return the value of open_exam.open_id
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public Integer getOpenId() {
        return openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_exam.open_id
     *
     * @param openId the value for open_exam.open_id
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public void setOpenId(Integer openId) {
        this.openId = openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_exam.exam_type
     *
     * @return the value of open_exam.exam_type
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public Integer getExamType() {
        return examType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_exam.exam_type
     *
     * @param examType the value for open_exam.exam_type
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public void setExamType(Integer examType) {
        this.examType = examType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_exam.title
     *
     * @return the value of open_exam.title
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_exam.title
     *
     * @param title the value for open_exam.title
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_exam.start_time
     *
     * @return the value of open_exam.start_time
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_exam.start_time
     *
     * @param startTime the value for open_exam.start_time
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_exam.end_time
     *
     * @return the value of open_exam.end_time
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_exam.end_time
     *
     * @param endTime the value for open_exam.end_time
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_exam.paper_time
     *
     * @return the value of open_exam.paper_time
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public Integer getPaperTime() {
        return paperTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_exam.paper_time
     *
     * @param paperTime the value for open_exam.paper_time
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public void setPaperTime(Integer paperTime) {
        this.paperTime = paperTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_exam.repair_condition
     *
     * @return the value of open_exam.repair_condition
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public Integer getRepairCondition() {
        return repairCondition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_exam.repair_condition
     *
     * @param repairCondition the value for open_exam.repair_condition
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public void setRepairCondition(Integer repairCondition) {
        this.repairCondition = repairCondition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_exam.repair_name
     *
     * @return the value of open_exam.repair_name
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public String getRepairName() {
        return repairName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_exam.repair_name
     *
     * @param repairName the value for open_exam.repair_name
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public void setRepairName(String repairName) {
        this.repairName = repairName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_exam.exam_limit
     *
     * @return the value of open_exam.exam_limit
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public Integer getExamLimit() {
        return examLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_exam.exam_limit
     *
     * @param examLimit the value for open_exam.exam_limit
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public void setExamLimit(Integer examLimit) {
        this.examLimit = examLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_exam.exam_type_weight_guest
     *
     * @return the value of open_exam.exam_type_weight_guest
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public Double getExamTypeWeightGuest() {
        return examTypeWeightGuest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_exam.exam_type_weight_guest
     *
     * @param examTypeWeightGuest the value for open_exam.exam_type_weight_guest
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public void setExamTypeWeightGuest(Double examTypeWeightGuest) {
        this.examTypeWeightGuest = examTypeWeightGuest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_exam.exam_type_weight_main
     *
     * @return the value of open_exam.exam_type_weight_main
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public Double getExamTypeWeightMain() {
        return examTypeWeightMain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_exam.exam_type_weight_main
     *
     * @param examTypeWeightMain the value for open_exam.exam_type_weight_main
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public void setExamTypeWeightMain(Double examTypeWeightMain) {
        this.examTypeWeightMain = examTypeWeightMain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_exam.score_day
     *
     * @return the value of open_exam.score_day
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public Integer getScoreDay() {
        return scoreDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_exam.score_day
     *
     * @param scoreDay the value for open_exam.score_day
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public void setScoreDay(Integer scoreDay) {
        this.scoreDay = scoreDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_exam.cheat
     *
     * @return the value of open_exam.cheat
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public Integer getCheat() {
        return cheat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_exam.cheat
     *
     * @param cheat the value for open_exam.cheat
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public void setCheat(Integer cheat) {
        this.cheat = cheat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_exam.join_condition
     *
     * @return the value of open_exam.join_condition
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public Double getJoinCondition() {
        return joinCondition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_exam.join_condition
     *
     * @param joinCondition the value for open_exam.join_condition
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public void setJoinCondition(Double joinCondition) {
        this.joinCondition = joinCondition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_exam.quiz_order
     *
     * @return the value of open_exam.quiz_order
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public Integer getQuizOrder() {
        return quizOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_exam.quiz_order
     *
     * @param quizOrder the value for open_exam.quiz_order
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public void setQuizOrder(Integer quizOrder) {
        this.quizOrder = quizOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_exam.option_order
     *
     * @return the value of open_exam.option_order
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public Integer getOptionOrder() {
        return optionOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_exam.option_order
     *
     * @param optionOrder the value for open_exam.option_order
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public void setOptionOrder(Integer optionOrder) {
        this.optionOrder = optionOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_exam.delete_status
     *
     * @return the value of open_exam.delete_status
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_exam.delete_status
     *
     * @param deleteStatus the value for open_exam.delete_status
     *
     * @mbg.generated Mon Aug 20 13:53:45 CST 2018
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}