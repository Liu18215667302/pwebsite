package com.pweb.entity;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by Administrator on 2017/7/15 0015.
 */
public class MediaInfoType implements Serializable {

    private String id = UUID.randomUUID().toString();
    private String username;
    private String title;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
