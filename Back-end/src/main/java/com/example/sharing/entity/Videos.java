package com.example.sharing.entity;

import java.util.Date;

public class Videos {
    private int vdoId;
    private String vdoNa;
    private int userNo;
    private String vdoPath;
    private String vdoImg;
    private String Remark;
    private int likeNum;
    private int commentNum;
    private int watchNum;

    public int getWatchNum() {
        return watchNum;
    }

    public void setWatchNum(int watchNum) {
        this.watchNum = watchNum;
    }

    private Date createTime;
    private byte isPublic;

    public int getVdoId() {
        return vdoId;
    }

    public void setVdoId(int vdoId) {
        this.vdoId = vdoId;
    }

    public String getVdoNa() {
        return vdoNa;
    }

    public void setVdoNa(String vdoNa) {
        this.vdoNa = vdoNa;
    }

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getVdoPath() {
        return vdoPath;
    }

    public void setVdoPath(String vdoPath) {
        this.vdoPath = vdoPath;
    }

    public String getVdoImg() {
        return vdoImg;
    }

    public void setVdoImg(String vdoImg) {
        this.vdoImg = vdoImg;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public int getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(int likeNum) {
        this.likeNum = likeNum;
    }

    public int getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(int commentNum) {
        this.commentNum = commentNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public byte getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(byte isPublic) {
        this.isPublic = isPublic;
    }
}
