package com.my.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * @author lw
 * @create 2020-01-14-10:43
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.my")
public class Application_Consumer {



    public static void main(String[] args){
        SpringApplication.run(Application_Consumer.class);
    }
}
