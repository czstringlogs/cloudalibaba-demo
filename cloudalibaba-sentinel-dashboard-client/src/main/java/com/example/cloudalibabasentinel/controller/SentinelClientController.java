package com.example.cloudalibabasentinel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zqing
 * @description: TODO
 * @date: 2020/9/30 14:22
 */
@RestController
public class SentinelClientController {

    @GetMapping("getProvider")
    public String getProvider(){
        return "我是生产者测试";
    }

    @GetMapping("getConsumer")
    public String getConsumer(){
        return "我是消费者测试";
    }

}
