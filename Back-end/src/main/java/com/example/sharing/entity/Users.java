package com.example.sharing.entity;

import java.util.Date;

public class Users {
    private Integer userNo;
    private String username;
    private String phone;
    private String password;
    private String userImg;
    private String QQNum;
    private String WeChatNum;
    private Byte sex;
    private int attentionNum;
    private int fansNum;
    private Date createTime;

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getUserNa() {
        return username;
    }

    public void setUserNa(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQQNum() {
        return QQNum;
    }

    public void setQQNum(String QQNum) {
        this.QQNum = QQNum;
    }

    public String getWeChatNum() {
        return WeChatNum;
    }

    public void setWeChatNum(String weChatNum) {
        WeChatNum = weChatNum;
    }

    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }

    public int getAttentionNum() {
        return attentionNum;
    }

    public void setAttentionNum(int attentionNum) {
        this.attentionNum = attentionNum;
    }

    public int getFansNum() {
        return fansNum;
    }

    public void setFansNum(int fansNum) {
        this.fansNum = fansNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
