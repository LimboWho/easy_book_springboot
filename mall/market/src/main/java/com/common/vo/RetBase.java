package com.common.vo;

import com.domain.UsersTable;

/**
 * @author xinting
 * @date 2021/2/27
 */
public class RetBase {
    private Boolean success;
    private String code;
    private String msg;
    private String token;
    private UsersTable data;


    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


    public UsersTable getData() {
        return data;
    }

    public void setData(UsersTable data) {
        this.data = data;
    }
}
