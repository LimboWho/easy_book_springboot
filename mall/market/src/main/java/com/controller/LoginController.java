package com.controller;

import com.common.vo.RetBase;
import com.config.TokenService;
import com.config.UserLoginToken;
import com.domain.Address;
import com.domain.UsersTable;
import com.service.UsersTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * @author xinting
 * @date 2021/2/25
 * 登录
 */
@RestController
@RequestMapping("api/tologin")
public class LoginController {

    @Autowired
    private UsersTableService usersService;
    @Autowired
    private TokenService tokenService;



    /**
     * 密码登录，登录成功状态码为200，失败状态码0或负数，错误原因具体看msg内容
     * loginusername
     * loginpassword
     */
    @RequestMapping("login")
    @UserLoginToken
    public Object login(ServletRequest req, HttpSession session, @RequestParam Map<String, Object> params){
        RetBase ret = new RetBase();
        List<UsersTable> list = new ArrayList<>();
        System.out.println(params);
        try {
            //params.put("loginPwd", DigestUtils.md5DigestAsHex(params.get("loginPwd").toString().getBytes()));
            List<UsersTable> list1=usersService.getUserList(params);
            if(list1!=null && list1.size()>0){
                Boolean login = usersService.login(params, list1.get(0));
                if (login) list.add(list1.get(0));

            }else{
                //this.register1(params);
                //list=loginService.login(params);
                ret.setCode("-1");
                ret.setMsg("用户名不存在");
                ret.setSuccess(false);
            }
            if(list!=null && list.size()>0){
                UsersTable USER=list.get(0);
                String token = tokenService.getToken(USER);
                USER.setToken(token);
                //我这里是直接把token放进USER对象里面去了
                ret.setData(USER);
                ret.setCode("200");
                ret.setMsg("登录成功");
                ret.setSuccess(true);
                session.setAttribute("USER",USER);
            }else{
                ret.setCode("-1");
                ret.setMsg("登录名或密码错误");
                ret.setSuccess(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ret.setCode("-10");
            ret.setMsg("登录失败"+e.getMessage());
            ret.setSuccess(false);
        }
        return ret;
    }

    /**
     * 传loginusername和loginpassword进行注册
     * @param params
     * @return
     */
    @RequestMapping("register")
    @ResponseBody
    public Map<String,String> register(@RequestParam Map<String, Object> params){
        Map<String, String> res = new HashMap<>();
        if (params.containsKey("loginusername") && params.containsKey("loginpassword")){
            UsersTable user = new UsersTable();
            user.setUserid(UUID.randomUUID().toString().replace("-", "").toUpperCase());
            user.setLoginusername((String) params.get("loginusername"));
            user.setLoginpassword((String) params.get("loginpassword"));

            try {
                usersService.insert(user);
                res.put("code","200");
                res.put("msg","注册成功");
            } catch (Exception e) {
                res.put("code","0");
                res.put("msg","用户名已存在");
                e.printStackTrace();
            }


        }
        else {
            res.put("code","0");
            res.put("msg","数据错误");
        }

        return res;
    }




//    @RequestMapping("/getCode")
//    public void getCode(HttpServletResponse resp, HttpSession session) throws IOException {
//        CircleCaptcha captcha = CaptchaUtil.createCircleCaptcha(116, 36, 4, 5);
//        //得到code
//        String code = captcha.getCode();
//        System.out.println(code);
//        //放到session
//        session.setAttribute("code", code);
//        ServletOutputStream outputStream = resp.getOutputStream();
//        captcha.write(outputStream);
//        outputStream.close();
//    }

}
