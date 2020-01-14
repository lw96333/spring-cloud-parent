package com.my.fegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author lw
 * @create 2020-01-14-14:26
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.my.client")
@ComponentScan("com.my")
public class Application_Fegin {
    public static void main(String[] arge){
        SpringApplication.run(Application_Fegin.class);
    }
}
