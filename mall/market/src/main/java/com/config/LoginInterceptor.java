package com.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.common.vo.RetBase;
import com.domain.UsersTable;
import com.service.UsersTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;

/**
 * @author xinting
 * @date 2021/2/27
 */

public class LoginInterceptor implements HandlerInterceptor {

    @Autowired
    private UsersTableService userService;
    private String[] deviceArray = new String[]{"android","mac os","windows phone"};
    //进入controller之前进入这个方法
    @Override
    //这个方法是在访问接口之前执行的，我们只需要在这里写验证登陆状态的业务逻辑，就可以在用户调用指定接口之前验证登陆状态了
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse response, Object object) throws Exception {
        String token = httpServletRequest.getHeader("token");// 从 http 请求头中取出 token
        // 如果不是映射到方法直接通过
        if(!(object instanceof HandlerMethod)){
            return true;
        }
        HandlerMethod handlerMethod=(HandlerMethod)object;
        Method method=handlerMethod.getMethod();
        String userAgent=httpServletRequest.getHeader("USER-AGENT").toLowerCase();

        Boolean isMoileDevice=false;
        for(int i=0;i<deviceArray.length;i++){
            if(userAgent.indexOf(deviceArray[i])>0){
                isMoileDevice= true;
            }
        }
        //判断是pc端还是移动端请求，因为pc端涉及到一个过期返回登录页面的问题，移动端无法控制
        if(isMoileDevice){
            //检查是否有passtoken注释，有则跳过认证
            if (method.isAnnotationPresent(PassToken.class)) {
                PassToken passToken = method.getAnnotation(PassToken.class);
                if (passToken.required()) {
                    return true;
                }
            }
            //检查有没有需要用户权限的注解
            if (method.isAnnotationPresent(UserLoginToken.class)) {
                UserLoginToken userLoginToken = method.getAnnotation(UserLoginToken.class);
                if (userLoginToken.required()) {
                    // 执行认证
                    if (token == null) {
                        returnJson(response,"无token，请重新登录");
                        return false;
                        //throw new RuntimeException("无token，请重新登录");
                    }
                    // 获取 token 中的 user id
                    String userId;
                    try {
                        userId = JWT.decode(token).getAudience().get(0);
                    } catch (JWTDecodeException j) {
                        //throw new RuntimeException("401");
                        returnJson(response,"获取用户认证发生错误");
                        return false;
                    }
                    UsersTable user = userService.selectByPrimaryKey(userId);
                    if (user == null) {
                        returnJson(response,"用户不存在，请重新登录");
                        return false;
                        //throw new RuntimeException("用户不存在，请重新登录");
                    }
                    // 验证 token，因为我生成signature的时候加密的是用户密码，所以这里也需要用用户密码验证
                    JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(user.getLoginpassword())).build();
                    try {
                        jwtVerifier.verify(token);
                    } catch (JWTVerificationException e) {
                        e.printStackTrace();
                        returnJson(response,"认证失败，请重新登录");
                        return false;
                        //throw new RuntimeException("401");
                    }
                    return true;
                }
            }
        }else {
            HttpSession session = httpServletRequest.getSession();
            //这里的User是登陆时放入session的
            UsersTable user = (UsersTable) session.getAttribute("USER");
            //如果session中没有user，表示没登陆
            if (user == null){
                //这个方法返回false表示忽略当前请求，如果一个用户调用了需要登陆才能使用的接口，如果他没有登陆这里会直接忽略掉
                //当然你可以利用response给用户返回一些提示信息，告诉他没登陆
                response.sendRedirect(httpServletRequest.getContextPath()+ "/login/loginPage");
                return false;
            }else {
                return true;    //如果session里有user，表示该用户已经登陆，放行，用户即可继续调用自己需要的接口
            }
        }


        return true;
    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
    private void returnJson(HttpServletResponse response,String message){
        PrintWriter writer = null;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        try {
            writer = response.getWriter();
            RetBase ret=new RetBase();
            ret.setSuccess(false);
            ret.setCode("-100");
            ret.setMsg(message);
            writer.print(JSON.toJSONString(ret, SerializerFeature.WriteMapNullValue));
        } catch (IOException e){
            //LoggerUtil.logError(ECInterceptor.class, "拦截器输出流异常"+e);
        } finally {
            if(writer != null){
                writer.close();
            }
        }
    }
}
