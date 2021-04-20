package com.domain;

import java.util.Date;
import java.util.List;

/**
 * @author xinting
 * @date 2021/2/27
 */
public class OrdersForChildTable_2 {
    private Integer orderitemid;

    private Integer orderid;

    private Integer goodsid;

    private String goodsname;

    private String goodscoverimg;

    private Integer sellingprice;

    private Integer goodscount;

    private Date createtime;

    private GoodsTable goodList;

    public GoodsTable getGoods() {
        return goodList;
    }

    public void setGoods(GoodsTable goodList) {
        this.goodList = goodList;
    }


    public Integer getOrderitemid() {
        return orderitemid;
    }

    public void setOrderitemid(Integer orderitemid) {
        this.orderitemid = orderitemid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getGoodscoverimg() {
        return goodscoverimg;
    }

    public void setGoodscoverimg(String goodscoverimg) {
        this.goodscoverimg = goodscoverimg;
    }

    public Integer getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(Integer sellingprice) {
        this.sellingprice = sellingprice;
    }

    public Integer getGoodscount() {
        return goodscount;
    }

    public void setGoodscount(Integer goodscount) {
        this.goodscount = goodscount;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}