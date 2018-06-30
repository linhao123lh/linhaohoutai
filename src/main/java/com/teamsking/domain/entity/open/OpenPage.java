package com.teamsking.domain.entity.open;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`open_page`")
public class OpenPage {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_page.id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_page.open_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer openId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_page.course_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer courseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_page.title
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_page.page_type
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer pageType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_page.page_url
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private String pageUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_page.create_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer createId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_page.create_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_page.update_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer updateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_page.update_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_page.delete_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer deleteStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column open_page.page_content
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private String pageContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_page.id
     *
     * @return the value of open_page.id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_page.id
     *
     * @param id the value for open_page.id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_page.open_id
     *
     * @return the value of open_page.open_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getOpenId() {
        return openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_page.open_id
     *
     * @param openId the value for open_page.open_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setOpenId(Integer openId) {
        this.openId = openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_page.course_id
     *
     * @return the value of open_page.course_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_page.course_id
     *
     * @param courseId the value for open_page.course_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_page.title
     *
     * @return the value of open_page.title
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_page.title
     *
     * @param title the value for open_page.title
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_page.page_type
     *
     * @return the value of open_page.page_type
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getPageType() {
        return pageType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_page.page_type
     *
     * @param pageType the value for open_page.page_type
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setPageType(Integer pageType) {
        this.pageType = pageType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_page.page_url
     *
     * @return the value of open_page.page_url
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public String getPageUrl() {
        return pageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_page.page_url
     *
     * @param pageUrl the value for open_page.page_url
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_page.create_id
     *
     * @return the value of open_page.create_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_page.create_id
     *
     * @param createId the value for open_page.create_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_page.create_time
     *
     * @return the value of open_page.create_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_page.create_time
     *
     * @param createTime the value for open_page.create_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_page.update_id
     *
     * @return the value of open_page.update_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getUpdateId() {
        return updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_page.update_id
     *
     * @param updateId the value for open_page.update_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_page.update_time
     *
     * @return the value of open_page.update_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_page.update_time
     *
     * @param updateTime the value for open_page.update_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_page.delete_status
     *
     * @return the value of open_page.delete_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_page.delete_status
     *
     * @param deleteStatus the value for open_page.delete_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column open_page.page_content
     *
     * @return the value of open_page.page_content
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public String getPageContent() {
        return pageContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column open_page.page_content
     *
     * @param pageContent the value for open_page.page_content
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setPageContent(String pageContent) {
        this.pageContent = pageContent;
    }
}