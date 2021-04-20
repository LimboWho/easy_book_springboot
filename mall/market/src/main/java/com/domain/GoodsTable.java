package com.domain;

import java.util.Date;

/**
 * @author xinting
 * @date 2021/2/27
 */
public class GoodsTable {
    private Integer goodsid;

    private Integer merchantsid;

    private String goodsname;

    private String goodsintro;

    private Integer goodscategoryid;

    private String goodscoverimg1;

    private String goodscoverimg2;

    private String goodscoverimg3;

    private String goodscarousel;

    private Integer originalprice;

    private Integer sellingprice;

    private Integer stocknum;

    private String tag;

    private Integer goodssellstatus;

    private String createuser;

    private Date createtime;

    private String updateuser;

    private Date updatetime;

    public String getGoodscoverimg1() {
        return goodscoverimg1;
    }

    public void setGoodscoverimg1(String goodscoverimg1) {
        this.goodscoverimg1 = goodscoverimg1;
    }

    public String getGoodscoverimg2() {
        return goodscoverimg2;
    }

    public void setGoodscoverimg2(String goodscoverimg2) {
        this.goodscoverimg2 = goodscoverimg2;
    }

    public String getGoodscoverimg3() {
        return goodscoverimg3;
    }

    public void setGoodscoverimg3(String goodscoverimg3) {
        this.goodscoverimg3 = goodscoverimg3;
    }

    private String goodsdetailcontent;

    public Integer getGoodsid() {
        return goodsid;
    }

    public GoodsTable(Integer goodsid, Integer merchantsid, String goodsname, String goodsintro, Integer goodscategoryid, String goodscoverimg1, String goodscoverimg2, String goodscoverimg3, String goodscarousel, Integer originalprice, Integer sellingprice, Integer stocknum, String tag, Integer goodssellstatus, String createuser, Date createtime, String updateuser, Date updatetime, String goodsdetailcontent) {
        this.goodsid = goodsid;
        this.merchantsid = merchantsid;
        this.goodsname = goodsname;
        this.goodsintro = goodsintro;
        this.goodscategoryid = goodscategoryid;
        this.goodscoverimg1 = goodscoverimg1;
        this.goodscoverimg2 = goodscoverimg2;
        this.goodscoverimg3 = goodscoverimg3;
        this.goodscarousel = goodscarousel;
        this.originalprice = originalprice;
        this.sellingprice = sellingprice;
        this.stocknum = stocknum;
        this.tag = tag;
        this.goodssellstatus = goodssellstatus;
        this.createuser = createuser;
        this.createtime = createtime;
        this.updateuser = updateuser;
        this.updatetime = updatetime;
        this.goodsdetailcontent = goodsdetailcontent;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getMerchantsid() {
        return merchantsid;
    }

    public void setMerchantsid(Integer merchantsid) {
        this.merchantsid = merchantsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getGoodsintro() {
        return goodsintro;
    }

    public void setGoodsintro(String goodsintro) {
        this.goodsintro = goodsintro;
    }

    public Integer getGoodscategoryid() {
        return goodscategoryid;
    }

    public void setGoodscategoryid(Integer goodscategoryid) {
        this.goodscategoryid = goodscategoryid;
    }


    public String getGoodscarousel() {
        return goodscarousel;
    }

    public void setGoodscarousel(String goodscarousel) {
        this.goodscarousel = goodscarousel;
    }

    public Integer getOriginalprice() {
        return originalprice;
    }

    public void setOriginalprice(Integer originalprice) {
        this.originalprice = originalprice;
    }

    public Integer getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(Integer sellingprice) {
        this.sellingprice = sellingprice;
    }

    public Integer getStocknum() {
        return stocknum;
    }

    public void setStocknum(Integer stocknum) {
        this.stocknum = stocknum;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getGoodssellstatus() {
        return goodssellstatus;
    }

    public void setGoodssellstatus(Integer goodssellstatus) {
        this.goodssellstatus = goodssellstatus;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getGoodsdetailcontent() {
        return goodsdetailcontent;
    }

    public void setGoodsdetailcontent(String goodsdetailcontent) {
        this.goodsdetailcontent = goodsdetailcontent;
    }
}