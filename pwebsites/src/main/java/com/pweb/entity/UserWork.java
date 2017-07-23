package com.pweb.entity;

import java.util.UUID;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
public class UserWork {

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMyDuty() {
        return myDuty;
    }

    public void setMyDuty(String myDuty) {
        this.myDuty = myDuty;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    private String id = UUID.randomUUID().toString();
    private String username;
    private String name;
    private String date;
    private String myDuty;
    private String content;
    private String remark;
    private String createDate;
    private String updateDate;
}
