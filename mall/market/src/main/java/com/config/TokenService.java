package com.config;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.domain.UsersTable;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author xinting
 * @date 2021/2/27
 */
@Service("TokenService")
public class TokenService {

    public String getToken(UsersTable user) {
        Date start = new Date();
        Date end = new Date(start.getTime()+(long)30 *24 * 60* 60 * 1000);//30天有效时间
        String token = "";
        //这里使用用户密码做加密签名
        token = JWT.create().withAudience(user.getUserid()).withIssuedAt(start).withExpiresAt(end)
                .sign(Algorithm.HMAC256(user.getLoginpassword()));
        return token;
    }
}
