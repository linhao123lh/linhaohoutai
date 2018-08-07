package com.teamsking.domain.entity.course;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "`course_teacher`")
public class CourseTeacher {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_teacher.id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_teacher.teacher_name
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private String teacherName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_teacher.display_order
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer displayOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_teacher.open_course
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer openCourse;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_teacher.create_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer createId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_teacher.create_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_teacher.update_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer updateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_teacher.update_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_teacher.delete_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer deleteStatus;

    private String weChat;

    private String micoBlog;

    private String teacherType;

    private String teacherAvatar;

    private String teacherInfo;

    private String teacherOrganization;

    public String getTeacherType() {
        return teacherType;
    }

    public void setTeacherType(String teacherType) {
        this.teacherType = teacherType;
    }

    public String getTeacherAvatar() {
        return teacherAvatar;
    }

    public void setTeacherAvatar(String teacherAvatar) {
        this.teacherAvatar = teacherAvatar;
    }

    public String getTeacherInfo() {
        return teacherInfo;
    }

    public void setTeacherInfo(String teacherInfo) {
        this.teacherInfo = teacherInfo;
    }

    public String getTeacherOrganization() {
        return teacherOrganization;
    }

    public void setTeacherOrganization(String teacherOrganization) {
        this.teacherOrganization = teacherOrganization;
    }

    public String getWeChat() {
        return weChat;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    public String getMicoBlog() {
        return micoBlog;
    }

    public void setMicoBlog(String micoBlog) {
        this.micoBlog = micoBlog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_teacher.id
     *
     * @return the value of course_teacher.id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_teacher.id
     *
     * @param id the value for course_teacher.id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_teacher.teacher_name
     *
     * @return the value of course_teacher.teacher_name
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_teacher.teacher_name
     *
     * @param teacherName the value for course_teacher.teacher_name
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_teacher.display_order
     *
     * @return the value of course_teacher.display_order
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_teacher.display_order
     *
     * @param displayOrder the value for course_teacher.display_order
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_teacher.open_course
     *
     * @return the value of course_teacher.open_course
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getOpenCourse() {
        return openCourse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_teacher.open_course
     *
     * @param openCourse the value for course_teacher.open_course
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setOpenCourse(Integer openCourse) {
        this.openCourse = openCourse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_teacher.create_id
     *
     * @return the value of course_teacher.create_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_teacher.create_id
     *
     * @param createId the value for course_teacher.create_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_teacher.create_time
     *
     * @return the value of course_teacher.create_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_teacher.create_time
     *
     * @param createTime the value for course_teacher.create_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_teacher.update_id
     *
     * @return the value of course_teacher.update_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getUpdateId() {
        return updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_teacher.update_id
     *
     * @param updateId the value for course_teacher.update_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_teacher.update_time
     *
     * @return the value of course_teacher.update_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_teacher.update_time
     *
     * @param updateTime the value for course_teacher.update_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_teacher.delete_status
     *
     * @return the value of course_teacher.delete_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_teacher.delete_status
     *
     * @param deleteStatus the value for course_teacher.delete_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }
}
