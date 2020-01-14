package com.my.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lw
 * @create 2020-01-14-9:28
 */
@SpringBootApplication
@EnableEurekaServer
public class Application_Eureka {

    public static void main(String[] args){
        SpringApplication.run(Application_Eureka.class);
    }
}
