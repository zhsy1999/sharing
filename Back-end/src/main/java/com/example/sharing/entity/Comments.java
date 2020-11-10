package com.example.sharing.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Comments {
    private Integer cmtId;
    private Integer vdoId;
    private Integer userNo;
    private String username;
    private String userImg;
    private String content;
    private Date createTime;

    public Integer getCmtId() {
        return cmtId;
    }

    @JsonProperty(value = "cmtId")
    public void setCmtId(Integer cmtId) {
        this.cmtId = cmtId;
    }

    public Integer getVdoId() {
        return vdoId;
    }

    @JsonProperty(value = "vdoId")
    public void setVdoId(Integer vdoId) {
        this.vdoId = vdoId;
    }

    public Integer getUserNo() {
        return userNo;
    }

    @JsonProperty(value = "userNo")
    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    public String getUserNa() {
        return username;
    }

    @JsonProperty(value = "username")
    public void setUserNa(String username) {
        this.username = username;
    }

    public String getUserImg() {
        return userImg;
    }

    @JsonProperty(value = "userImg")
    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getContent() {
        return content;
    }

    @JsonProperty(value = "content")
    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    @JsonProperty(value = "createTime")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}


/*public class Comments {

    private int cmtId;
    private int vdoId;
    private int userNo;
    private String userNa;
    private String userImg;
    private String content;
    private Date createTime;

    public int getCmtId() {
        return cmtId;
    }

    public void setCmtId(int cmtId) {
        this.cmtId = cmtId;
    }

    public int getVdoId() {
        return vdoId;
    }

    public void setVdoId(int vdoId) {
        this.vdoId = vdoId;
    }

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getUserNa() {
        return userNa;
    }

    public void setUserNa(String userNa) {
        this.userNa = userNa;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
*/
