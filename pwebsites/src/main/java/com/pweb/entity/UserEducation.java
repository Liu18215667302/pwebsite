package com.pweb.entity;

import java.util.UUID;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
public class UserEducation {

    private String id = UUID.randomUUID().toString();
    private String username;
    private String education;
    private String graducatedSchool;
    private String duty;
    private String date;
    private String remark;
    private String createDate;
    private String updateDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getGraducatedSchool() {
        return graducatedSchool;
    }

    public void setGraducatedSchool(String graducatedSchool) {
        this.graducatedSchool = graducatedSchool;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
}
