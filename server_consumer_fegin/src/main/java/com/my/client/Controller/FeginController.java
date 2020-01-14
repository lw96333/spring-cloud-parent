package com.my.client.Controller;

import com.my.client.FeginClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lw
 * @create 2020-01-14-14:39
 */
@RestController
@RequestMapping("consumer")
public class FeginController {

    @Autowired
    private FeginClient feginClient;

    @RequestMapping("feginGet")
    public String getData(){
        return feginClient.getData();
    }
}
