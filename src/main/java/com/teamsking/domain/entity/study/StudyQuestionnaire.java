package com.teamsking.domain.entity.study;

import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "`study_questionnaire`")
public class StudyQuestionnaire {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_questionnaire.id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    @Id
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_questionnaire.open_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    private Integer openId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_questionnaire.questionnaire_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    private Integer questionnaireId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_questionnaire.subject_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    private Integer subjectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_questionnaire.user_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    private Integer userStudentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_questionnaire.answer
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    private String answer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_questionnaire.create_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    private Integer createId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_questionnaire.create_time
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_questionnaire.update_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    private Integer updateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_questionnaire.update_time
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study_questionnaire.delete_status
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    private Integer deleteStatus;

    private Integer optionId;

    public Integer getUserStudentId() {
        return userStudentId;
    }

    public void setUserStudentId(Integer userStudentId) {
        this.userStudentId = userStudentId;
    }

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_questionnaire.id
     *
     * @return the value of study_questionnaire.id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_questionnaire.id
     *
     * @param id the value for study_questionnaire.id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_questionnaire.open_id
     *
     * @return the value of study_questionnaire.open_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public Integer getOpenId() {
        return openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_questionnaire.open_id
     *
     * @param openId the value for study_questionnaire.open_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public void setOpenId(Integer openId) {
        this.openId = openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_questionnaire.questionnaire_id
     *
     * @return the value of study_questionnaire.questionnaire_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public Integer getQuestionnaireId() {
        return questionnaireId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_questionnaire.questionnaire_id
     *
     * @param questionnaireId the value for study_questionnaire.questionnaire_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public void setQuestionnaireId(Integer questionnaireId) {
        this.questionnaireId = questionnaireId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_questionnaire.subject_id
     *
     * @return the value of study_questionnaire.subject_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public Integer getSubjectId() {
        return subjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_questionnaire.subject_id
     *
     * @param subjectId the value for study_questionnaire.subject_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_questionnaire.answer
     *
     * @return the value of study_questionnaire.answer
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_questionnaire.answer
     *
     * @param answer the value for study_questionnaire.answer
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_questionnaire.create_id
     *
     * @return the value of study_questionnaire.create_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public Integer getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_questionnaire.create_id
     *
     * @param createId the value for study_questionnaire.create_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_questionnaire.create_time
     *
     * @return the value of study_questionnaire.create_time
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_questionnaire.create_time
     *
     * @param createTime the value for study_questionnaire.create_time
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_questionnaire.update_id
     *
     * @return the value of study_questionnaire.update_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public Integer getUpdateId() {
        return updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_questionnaire.update_id
     *
     * @param updateId the value for study_questionnaire.update_id
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_questionnaire.update_time
     *
     * @return the value of study_questionnaire.update_time
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_questionnaire.update_time
     *
     * @param updateTime the value for study_questionnaire.update_time
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study_questionnaire.delete_status
     *
     * @return the value of study_questionnaire.delete_status
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study_questionnaire.delete_status
     *
     * @param deleteStatus the value for study_questionnaire.delete_status
     *
     * @mbg.generated Thu Jul 05 21:18:43 CST 2018
     */
    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }
}
