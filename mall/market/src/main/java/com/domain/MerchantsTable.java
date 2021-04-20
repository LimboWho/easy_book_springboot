package com.domain;

/**
 * @author xinting
 * @date 2021/2/27
 */
public class MerchantsTable {
    private Integer merchantsid;

    private String nickname;

    private String loginname;

    private String passwordmd5;

    private String introducesign;

    private String address;

    private Integer isdeleted;

    private Integer lockedflag;

    public Integer getMerchantsid() {
        return merchantsid;
    }

    public void setMerchantsid(Integer merchantsid) {
        this.merchantsid = merchantsid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPasswordmd5() {
        return passwordmd5;
    }

    public void setPasswordmd5(String passwordmd5) {
        this.passwordmd5 = passwordmd5;
    }

    public String getIntroducesign() {
        return introducesign;
    }

    public void setIntroducesign(String introducesign) {
        this.introducesign = introducesign;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
    }

    public Integer getLockedflag() {
        return lockedflag;
    }

    public void setLockedflag(Integer lockedflag) {
        this.lockedflag = lockedflag;
    }
}