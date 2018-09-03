package com.teamsking.domain.entity.node;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "`node`")
public class Node {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.school_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer schoolId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.node_type
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer nodeType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.folder_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer folderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.course_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer courseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.open_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer openId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.title
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.cover_path
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private String coverPath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.srt_path
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private String srtPath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.file_path
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private String filePath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.seconds
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer seconds;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.file_size
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer fileSize;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.page_num
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer pageNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.srt_size
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer srtSize;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.quiz_num
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer quizNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.display_order
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer displayOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.md5_code
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private String md5Code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.node_uuid
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private String nodeUuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.trans_progress
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Byte transProgress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.create_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer createId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.create_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.update_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer updateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.update_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column node.delete_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    private Integer deleteStatus;

    private Integer watchProgress;

    private String suffixName;

    private Integer chapterId;

    private Integer sectionId;

    private String content;

    public String getSuffixName() {
        return suffixName;
    }

    public void setSuffixName(String suffixName) {
        this.suffixName = suffixName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.id
     *
     * @return the value of node.id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.id
     *
     * @param id the value for node.id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.school_id
     *
     * @return the value of node.school_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getSchoolId() {
        return schoolId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.school_id
     *
     * @param schoolId the value for node.school_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.node_type
     *
     * @return the value of node.node_type
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getNodeType() {
        return nodeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.node_type
     *
     * @param nodeType the value for node.node_type
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.folder_id
     *
     * @return the value of node.folder_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getFolderId() {
        return folderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.folder_id
     *
     * @param folderId the value for node.folder_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setFolderId(Integer folderId) {
        this.folderId = folderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.course_id
     *
     * @return the value of node.course_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.course_id
     *
     * @param courseId the value for node.course_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.open_id
     *
     * @return the value of node.open_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getOpenId() {
        return openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.open_id
     *
     * @param openId the value for node.open_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setOpenId(Integer openId) {
        this.openId = openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.title
     *
     * @return the value of node.title
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.title
     *
     * @param title the value for node.title
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.cover_path
     *
     * @return the value of node.cover_path
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public String getCoverPath() {
        return coverPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.cover_path
     *
     * @param coverPath the value for node.cover_path
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setCoverPath(String coverPath) {
        this.coverPath = coverPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.srt_path
     *
     * @return the value of node.srt_path
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public String getSrtPath() {
        return srtPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.srt_path
     *
     * @param srtPath the value for node.srt_path
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setSrtPath(String srtPath) {
        this.srtPath = srtPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.file_path
     *
     * @return the value of node.file_path
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.file_path
     *
     * @param filePath the value for node.file_path
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.seconds
     *
     * @return the value of node.seconds
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getSeconds() {
        return seconds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.seconds
     *
     * @param seconds the value for node.seconds
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.file_size
     *
     * @return the value of node.file_size
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getFileSize() {
        return fileSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.file_size
     *
     * @param fileSize the value for node.file_size
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.page_num
     *
     * @return the value of node.page_num
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getPageNum() {
        return pageNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.page_num
     *
     * @param pageNum the value for node.page_num
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.srt_size
     *
     * @return the value of node.srt_size
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getSrtSize() {
        return srtSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.srt_size
     *
     * @param srtSize the value for node.srt_size
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setSrtSize(Integer srtSize) {
        this.srtSize = srtSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.quiz_num
     *
     * @return the value of node.quiz_num
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getQuizNum() {
        return quizNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.quiz_num
     *
     * @param quizNum the value for node.quiz_num
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setQuizNum(Integer quizNum) {
        this.quizNum = quizNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.display_order
     *
     * @return the value of node.display_order
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.display_order
     *
     * @param displayOrder the value for node.display_order
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.md5_code
     *
     * @return the value of node.md5_code
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public String getMd5Code() {
        return md5Code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.md5_code
     *
     * @param md5Code the value for node.md5_code
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setMd5Code(String md5Code) {
        this.md5Code = md5Code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.node_uuid
     *
     * @return the value of node.node_uuid
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public String getNodeUuid() {
        return nodeUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.node_uuid
     *
     * @param nodeUuid the value for node.node_uuid
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setNodeUuid(String nodeUuid) {
        this.nodeUuid = nodeUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.trans_progress
     *
     * @return the value of node.trans_progress
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Byte getTransProgress() {
        return transProgress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.trans_progress
     *
     * @param transProgress the value for node.trans_progress
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setTransProgress(Byte transProgress) {
        this.transProgress = transProgress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.create_id
     *
     * @return the value of node.create_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.create_id
     *
     * @param createId the value for node.create_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.create_time
     *
     * @return the value of node.create_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.create_time
     *
     * @param createTime the value for node.create_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.update_id
     *
     * @return the value of node.update_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getUpdateId() {
        return updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.update_id
     *
     * @param updateId the value for node.update_id
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.update_time
     *
     * @return the value of node.update_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.update_time
     *
     * @param updateTime the value for node.update_time
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column node.delete_status
     *
     * @return the value of node.delete_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column node.delete_status
     *
     * @param deleteStatus the value for node.delete_status
     *
     * @mbg.generated Tue Jun 26 17:08:40 CST 2018
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Integer getWatchProgress() {
        return watchProgress;
    }

    public void setWatchProgress(Integer watchProgress) {
        this.watchProgress = watchProgress;
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
