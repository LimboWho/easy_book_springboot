package com.domain;

/**
 *  @author xinting
 *  @date 2021/2/27
 */
public class Evaluation {
    private Integer evaluationid;

    private Integer userid;

    private Integer goodsid;

    private Integer level;

    private String evaluationinfo;

    public Integer getEvaluationid() {
        return evaluationid;
    }

    public void setEvaluationid(Integer evaluationid) {
        this.evaluationid = evaluationid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getEvaluationinfo() {
        return evaluationinfo;
    }

    public void setEvaluationinfo(String evaluationinfo) {
        this.evaluationinfo = evaluationinfo;
    }
}