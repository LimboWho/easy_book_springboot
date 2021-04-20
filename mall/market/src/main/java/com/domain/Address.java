package com.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 *  @author xinting
 *  @date 2021/2/27
 */
public class Address {

    private Integer addressid;


    private String userid;

    public Address(Integer addressid, String userid, String receiver, String phone, String addressinfo) {
        this.addressid = addressid;
        this.userid = userid;
        this.receiver = receiver;
        this.phone = phone;
        this.addressinfo = addressinfo;
    }

    private String receiver;

    private String phone;

    private String addressinfo;

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }


    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddressinfo() {
        return addressinfo;
    }

    public void setAddressinfo(String addressinfo) {
        this.addressinfo = addressinfo;
    }
}