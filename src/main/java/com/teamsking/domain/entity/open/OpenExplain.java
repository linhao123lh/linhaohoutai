package com.teamsking.domain.entity.open;

import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "`open_explain`")
public class OpenExplain {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_explain.id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    @Id
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_explain.course_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer courseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_explain.open_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer openId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_explain.create_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer createId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_explain.create_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_explain.update_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer updateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_explain.update_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_explain.delete_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer deleteStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_explain.course_introduction
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private String courseIntroduction;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_explain.teach_plan
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private String teachPlan;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_explain.evaluation_mode
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private String evaluationMode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_explain.study_target
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private String studyTarget;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_explain.study_requirement
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private String studyRequirement;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_explain.teaching_material
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private String teachingMaterial;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_explain.id
     *
     * @return the value of open_explain.id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_explain.id
     *
     * @param id the value for open_explain.id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_explain.course_id
     *
     * @return the value of open_explain.course_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_explain.course_id
     *
     * @param courseId the value for open_explain.course_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_explain.open_id
     *
     * @return the value of open_explain.open_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getOpenId() {
        return openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_explain.open_id
     *
     * @param openId the value for open_explain.open_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setOpenId(Integer openId) {
        this.openId = openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_explain.create_id
     *
     * @return the value of open_explain.create_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_explain.create_id
     *
     * @param createId the value for open_explain.create_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_explain.create_time
     *
     * @return the value of open_explain.create_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_explain.create_time
     *
     * @param createTime the value for open_explain.create_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_explain.update_id
     *
     * @return the value of open_explain.update_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getUpdateId() {
        return updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_explain.update_id
     *
     * @param updateId the value for open_explain.update_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_explain.update_time
     *
     * @return the value of open_explain.update_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_explain.update_time
     *
     * @param updateTime the value for open_explain.update_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_explain.delete_status
     *
     * @return the value of open_explain.delete_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_explain.delete_status
     *
     * @param deleteStatus the value for open_explain.delete_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_explain.course_introduction
     *
     * @return the value of open_explain.course_introduction
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public String getCourseIntroduction() {
        return courseIntroduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_explain.course_introduction
     *
     * @param courseIntroduction the value for open_explain.course_introduction
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setCourseIntroduction(String courseIntroduction) {
        this.courseIntroduction = courseIntroduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_explain.teach_plan
     *
     * @return the value of open_explain.teach_plan
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public String getTeachPlan() {
        return teachPlan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_explain.teach_plan
     *
     * @param teachPlan the value for open_explain.teach_plan
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setTeachPlan(String teachPlan) {
        this.teachPlan = teachPlan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_explain.evaluation_mode
     *
     * @return the value of open_explain.evaluation_mode
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public String getEvaluationMode() {
        return evaluationMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_explain.evaluation_mode
     *
     * @param evaluationMode the value for open_explain.evaluation_mode
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setEvaluationMode(String evaluationMode) {
        this.evaluationMode = evaluationMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_explain.study_target
     *
     * @return the value of open_explain.study_target
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public String getStudyTarget() {
        return studyTarget;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_explain.study_target
     *
     * @param studyTarget the value for open_explain.study_target
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setStudyTarget(String studyTarget) {
        this.studyTarget = studyTarget;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_explain.study_requirement
     *
     * @return the value of open_explain.study_requirement
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public String getStudyRequirement() {
        return studyRequirement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_explain.study_requirement
     *
     * @param studyRequirement the value for open_explain.study_requirement
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setStudyRequirement(String studyRequirement) {
        this.studyRequirement = studyRequirement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_explain.teaching_material
     *
     * @return the value of open_explain.teaching_material
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public String getTeachingMaterial() {
        return teachingMaterial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_explain.teaching_material
     *
     * @param teachingMaterial the value for open_explain.teaching_material
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setTeachingMaterial(String teachingMaterial) {
        this.teachingMaterial = teachingMaterial;
    }
}
