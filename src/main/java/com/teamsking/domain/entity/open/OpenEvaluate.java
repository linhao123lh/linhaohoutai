package com.teamsking.domain.entity.open;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`open_evaluate`")
public class OpenEvaluate {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_evaluate.id
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    @Id
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_evaluate.user_id
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_evaluate.open_id
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    private Integer openId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_evaluate.evaluate
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    private Double evaluate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_evaluate.is_show
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    private Boolean isShow;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_evaluate.create_id
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    private Integer createId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_evaluate.create_time
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_evaluate.update_id
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    private Integer updateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_evaluate.update_time
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_evaluate.delete_status
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    private Integer deleteStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_evaluate.category_id
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    private Integer firstCategoryId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_evaluate.id
     *
     * @return the value of course_evaluate.id
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */

    private String evaluateContent;

    public String getEvaluateContent() {
        return evaluateContent;
    }

    public void setEvaluateContent(String evaluateContent) {
        this.evaluateContent = evaluateContent;
    }

    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_evaluate.id
     *
     * @param id the value for course_evaluate.id
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_evaluate.user_id
     *
     * @return the value of course_evaluate.user_id
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_evaluate.user_id
     *
     * @param userId the value for course_evaluate.user_id
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_evaluate.course_id
     *
     * @return the value of course_evaluate.course_id
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    public Integer getOpenId() {
        return openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_evaluate.course_id
     *
     * @param openId the value for course_evaluate.course_id
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    public void setOpenId(Integer openId) {
        this.openId = openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_evaluate.evaluate
     *
     * @return the value of course_evaluate.evaluate
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    public Double getEvaluate() {
        return evaluate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_evaluate.evaluate
     *
     * @param evaluate the value for course_evaluate.evaluate
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    public void setEvaluate(Double evaluate) {
        this.evaluate = evaluate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_evaluate.is_show
     *
     * @return the value of course_evaluate.is_show
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_evaluate.is_show
     *
     * @param isShow the value for course_evaluate.is_show
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_evaluate.create_id
     *
     * @return the value of course_evaluate.create_id
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    public Integer getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_evaluate.create_id
     *
     * @param createId the value for course_evaluate.create_id
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_evaluate.create_time
     *
     * @return the value of course_evaluate.create_time
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_evaluate.create_time
     *
     * @param createTime the value for course_evaluate.create_time
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_evaluate.update_id
     *
     * @return the value of course_evaluate.update_id
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    public Integer getUpdateId() {
        return updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_evaluate.update_id
     *
     * @param updateId the value for course_evaluate.update_id
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_evaluate.update_time
     *
     * @return the value of course_evaluate.update_time
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_evaluate.update_time
     *
     * @param updateTime the value for course_evaluate.update_time
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_evaluate.delete_status
     *
     * @return the value of course_evaluate.delete_status
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_evaluate.delete_status
     *
     * @param deleteStatus the value for course_evaluate.delete_status
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_evaluate.category_id
     *
     * @return the value of course_evaluate.category_id
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    public Integer getFirstCategoryId() {
        return firstCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_evaluate.category_id
     *
     * @param firstCategoryId the value for course_evaluate.category_id
     *
     * @mbg.generated Fri Jul 20 11:13:21 CST 2018
     */
    public void setFirstCategoryId(Integer firstCategoryId) {
        this.firstCategoryId = firstCategoryId;
    }
}