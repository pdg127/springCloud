package com.pdg.common.entity;

import java.util.Date;

public class Reply {
    private Integer rid;

    private Integer rpeopleid;

    private Date rdate;

    private Integer questionid;

    private Integer praise;

    private String content;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getRpeopleid() {
        return rpeopleid;
    }

    public void setRpeopleid(Integer rpeopleid) {
        this.rpeopleid = rpeopleid;
    }

    public Date getRdate() {
        return rdate;
    }

    public void setRdate(Date rdate) {
        this.rdate = rdate;
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public Integer getPraise() {
        return praise;
    }

    public void setPraise(Integer praise) {
        this.praise = praise;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}