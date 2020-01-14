package com.my.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.annotation.Commit;

/**
 * @author lw
 * @create 2020-01-14-10:17
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = "com.my")
public class Application_Provider {

    public static void main(String[] args){
        SpringApplication.run(Application_Provider.class);
    }
}
