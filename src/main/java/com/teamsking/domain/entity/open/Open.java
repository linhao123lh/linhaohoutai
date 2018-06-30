package com.teamsking.domain.entity.open;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`open`")
public class Open {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open.id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    @Id
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open.school_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer schoolId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open.course_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer courseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open.open_name
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private String openName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open.open_mode
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer openMode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open.study_mode
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer studyMode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open.course_introduction
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private String courseIntroduction;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open.course_credit
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private BigDecimal courseCredit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open.study_hour
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer studyHour;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open.score_day
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer scoreDay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open.preview_video
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer previewVideo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open.drop_course
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer dropCourse;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open.begin_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Date beginTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open.end_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open.course_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer courseStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open.publish_flag
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer publishFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open.publish_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Date publishTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open.publish_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer publishId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open.create_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer createId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open.create_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open.update_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer updateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open.update_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open.delete_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer deleteStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open.difficulty_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer difficultyStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open.course_type
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer courseType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open.id
     *
     * @return the value of open.id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open.id
     *
     * @param id the value for open.id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open.school_id
     *
     * @return the value of open.school_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getSchoolId() {
        return schoolId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open.school_id
     *
     * @param schoolId the value for open.school_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open.course_id
     *
     * @return the value of open.course_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open.course_id
     *
     * @param courseId the value for open.course_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open.open_name
     *
     * @return the value of open.open_name
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public String getOpenName() {
        return openName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open.open_name
     *
     * @param openName the value for open.open_name
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setOpenName(String openName) {
        this.openName = openName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open.open_mode
     *
     * @return the value of open.open_mode
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getOpenMode() {
        return openMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open.open_mode
     *
     * @param openMode the value for open.open_mode
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setOpenMode(Integer openMode) {
        this.openMode = openMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open.study_mode
     *
     * @return the value of open.study_mode
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getStudyMode() {
        return studyMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open.study_mode
     *
     * @param studyMode the value for open.study_mode
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setStudyMode(Integer studyMode) {
        this.studyMode = studyMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open.course_introduction
     *
     * @return the value of open.course_introduction
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public String getCourseIntroduction() {
        return courseIntroduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open.course_introduction
     *
     * @param courseIntroduction the value for open.course_introduction
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setCourseIntroduction(String courseIntroduction) {
        this.courseIntroduction = courseIntroduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open.course_credit
     *
     * @return the value of open.course_credit
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public BigDecimal getCourseCredit() {
        return courseCredit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open.course_credit
     *
     * @param courseCredit the value for open.course_credit
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setCourseCredit(BigDecimal courseCredit) {
        this.courseCredit = courseCredit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open.study_hour
     *
     * @return the value of open.study_hour
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getStudyHour() {
        return studyHour;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open.study_hour
     *
     * @param studyHour the value for open.study_hour
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setStudyHour(Integer studyHour) {
        this.studyHour = studyHour;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open.score_day
     *
     * @return the value of open.score_day
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getScoreDay() {
        return scoreDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open.score_day
     *
     * @param scoreDay the value for open.score_day
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setScoreDay(Integer scoreDay) {
        this.scoreDay = scoreDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open.preview_video
     *
     * @return the value of open.preview_video
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getPreviewVideo() {
        return previewVideo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open.preview_video
     *
     * @param previewVideo the value for open.preview_video
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setPreviewVideo(Integer previewVideo) {
        this.previewVideo = previewVideo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open.drop_course
     *
     * @return the value of open.drop_course
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getDropCourse() {
        return dropCourse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open.drop_course
     *
     * @param dropCourse the value for open.drop_course
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setDropCourse(Integer dropCourse) {
        this.dropCourse = dropCourse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open.begin_time
     *
     * @return the value of open.begin_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open.begin_time
     *
     * @param beginTime the value for open.begin_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open.end_time
     *
     * @return the value of open.end_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open.end_time
     *
     * @param endTime the value for open.end_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open.course_status
     *
     * @return the value of open.course_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getCourseStatus() {
        return courseStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open.course_status
     *
     * @param courseStatus the value for open.course_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setCourseStatus(Integer courseStatus) {
        this.courseStatus = courseStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open.publish_flag
     *
     * @return the value of open.publish_flag
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getPublishFlag() {
        return publishFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open.publish_flag
     *
     * @param publishFlag the value for open.publish_flag
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setPublishFlag(Integer publishFlag) {
        this.publishFlag = publishFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open.publish_time
     *
     * @return the value of open.publish_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Date getPublishTime() {
        return publishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open.publish_time
     *
     * @param publishTime the value for open.publish_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open.publish_id
     *
     * @return the value of open.publish_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getPublishId() {
        return publishId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open.publish_id
     *
     * @param publishId the value for open.publish_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setPublishId(Integer publishId) {
        this.publishId = publishId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open.create_id
     *
     * @return the value of open.create_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open.create_id
     *
     * @param createId the value for open.create_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open.create_time
     *
     * @return the value of open.create_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open.create_time
     *
     * @param createTime the value for open.create_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open.update_id
     *
     * @return the value of open.update_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getUpdateId() {
        return updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open.update_id
     *
     * @param updateId the value for open.update_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open.update_time
     *
     * @return the value of open.update_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open.update_time
     *
     * @param updateTime the value for open.update_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open.delete_status
     *
     * @return the value of open.delete_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open.delete_status
     *
     * @param deleteStatus the value for open.delete_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open.difficulty_status
     *
     * @return the value of open.difficulty_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getDifficultyStatus() {
        return difficultyStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open.difficulty_status
     *
     * @param difficultyStatus the value for open.difficulty_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setDifficultyStatus(Integer difficultyStatus) {
        this.difficultyStatus = difficultyStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open.course_type
     *
     * @return the value of open.course_type
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getCourseType() {
        return courseType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open.course_type
     *
     * @param courseType the value for open.course_type
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setCourseType(Integer courseType) {
        this.courseType = courseType;
    }
}