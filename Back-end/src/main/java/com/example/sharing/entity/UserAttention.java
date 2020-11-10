package com.example.sharing.entity;

import java.util.Date;

public class UserAttention {
    private Integer Attentionid;
    private Integer fanNo;
    private Integer starNo;
    private Date createTime;

    public Integer getId() { return Attentionid; }
    public void setId(Integer Attentionid) { this.Attentionid = Attentionid; }

    public Integer getFanNo() { return fanNo; }
    public void setFanNo(Integer fanNo) { this.fanNo = fanNo; }

    public Integer getStarNo() { return starNo; }
    public void setStarNo(Integer starNo) { this.starNo = starNo; }

    public Date getCreateTime() { return createTime; }
    public void setCreateTime(Date createTime) { this.createTime = createTime; }
}
