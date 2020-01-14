package com.my.server.conrtroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lw
 * @create 2020-01-14-10:24
 */
@RestController
@RequestMapping("provider")
public class ProviderConrtroller {

    @RequestMapping("get" )
    public String getData(){
        return "提供了数据";
    }
}
