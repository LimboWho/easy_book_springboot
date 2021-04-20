package com.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author xinting
 * @date 2021/2/27
 */

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Value("${server.servlet.context-path}")
    private String contextPath;

    @Value("${base-path: /** }")
    private String basePath;

    //不注册这个在过滤器中 service将报空
    @Bean
    public LoginInterceptor loginInterceptor(){
        return new LoginInterceptor();
    }

    //添加拦截器方法
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加拦截路径
        String[] addPathPatters={
                "/**"
        };
        //添加不拦截路径
        String[] excludePathPatters={
                "/", "/api/tologin/login", "/api/tologin/loginPage","/api/tologin/register","/api/merchants/login",
                "/**/*.css", "/**/*.js", "/**/*.png", "/**/*.jpg",
                "/**/*.jpeg", "/**/*.gif", "/**/fonts/*", "/**/*.svg",
                "/**/*.ttf","/**/*.woff","/**/*.eot","/**/*.otf","/**/*.woff2"
        };
        //注册登录拦截器
        registry.addInterceptor(loginInterceptor()).addPathPatterns(addPathPatters).excludePathPatterns(excludePathPatters);
        //如果多条拦截器则增加多条
    }

    //添加放行静态资源
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        //文件磁盘图片url 映射
        //配置server虚拟路径，handler为前台访问的目录，locations为files相对应的本地路径
        registry.addResourceHandler("/attachments/**").addResourceLocations("file:"+basePath+"attachments/");
        //配置静态文件路径，与上面并不冲突
        registry.addResourceHandler("/**").addResourceLocations("classpath:/META-INF/resources/");


    }


}
