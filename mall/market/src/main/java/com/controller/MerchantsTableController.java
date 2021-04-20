package com.controller;

import com.common.ResultObj;
import com.domain.MerchantsTable;
import com.domain.UsersTable;
import com.service.MerchantsTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author xinting
 * @date 2021/2/25
 * 商家表
 */
@RestController
@RequestMapping("api/merchants")
public class MerchantsTableController {
    @Autowired
    private MerchantsTableService merchantsTableService;
    @RequestMapping("login")
    public ResultObj login(String loginname, String pwd, String code, HttpSession session) {
        Object codeSession = session.getAttribute("code");
        if(code!=null) {
            MerchantsTable user = merchantsTableService.check(loginname,pwd);
            if(null!=user && code.equals(codeSession)) {
                session.setAttribute("user", user);
                return new ResultObj(200, "登陆成功");
            }else {
                return new ResultObj(-1, "用户名或密码不正确");
            }
        }else {
            return new ResultObj(-1, "验证码错误");
        }

    }

}
