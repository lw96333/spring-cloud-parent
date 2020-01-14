package com.my.client.conrtroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author lw
 * @create 2020-01-14-10:49
 */
@RestController
@RequestMapping("consumer")
public class ConsumerConrtoller {

    private final String URL = "http://localhost:9001/provider/get";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("get" )
    public String getData(){
        System.out.println("123123");
//        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(URL,String.class);
    }
}
