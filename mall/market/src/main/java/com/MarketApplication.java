package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
/**
 * @author xinting
 * @date 2021/2/25
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.mapper"})

public class MarketApplication {
    public static void main(String[] args) {
        SpringApplication.run(MarketApplication.class,args);
    }
}
