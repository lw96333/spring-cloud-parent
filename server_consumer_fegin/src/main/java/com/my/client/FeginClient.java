package com.my.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lw
 * @create 2020-01-14-14:34
 */

@RequestMapping("provider")
@FeignClient(value = "test-provider")
public interface FeginClient {

    //和调用服务controller的一致
    @RequestMapping("get")
    String getData();
}
