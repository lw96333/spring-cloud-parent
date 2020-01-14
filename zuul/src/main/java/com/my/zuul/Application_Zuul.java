package com.my.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author lw
 * @create 2020-01-14-11:05
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class Application_Zuul {

    public static void main(String[] args){
        SpringApplication.run(Application_Zuul.class);
    }
}
