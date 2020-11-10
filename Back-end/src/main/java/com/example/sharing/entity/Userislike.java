package com.example.sharing.entity;

import java.util.Date;

public class Userislike {

    private int id;
    private int vdoId;
    private int userNo;
    private Byte isLike;
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Byte getIsLike() {
        return isLike;
    }

    public void setIsLike(Byte isLike) {
        this.isLike = isLike;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
