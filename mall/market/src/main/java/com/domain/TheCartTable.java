package com.domain;

import java.util.Date;

/**
 * @author xinting
 * @date 2021/2/27
 */
public class TheCartTable {
    private Integer cartitemid;

    public TheCartTable(Integer cartitemid, String userid, Integer goodsid, Integer goodscount, Integer isdeleted, Date createtime, Date updatetime) {
        this.cartitemid = cartitemid;
        this.userid = userid;
        this.goodsid = goodsid;
        this.goodscount = goodscount;
        this.isdeleted = isdeleted;
        this.createtime = createtime;
        this.updatetime = updatetime;
    }

    private String userid;

    private Integer goodsid;

    private Integer goodscount;

    private Integer isdeleted;

    private Date createtime;

    private Date updatetime;

    public Integer getCartitemid() {
        return cartitemid;
    }

    public void setCartitemid(Integer cartitemid) {
        this.cartitemid = cartitemid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getGoodscount() {
        return goodscount;
    }

    public void setGoodscount(Integer goodscount) {
        this.goodscount = goodscount;
    }

    public Integer getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}