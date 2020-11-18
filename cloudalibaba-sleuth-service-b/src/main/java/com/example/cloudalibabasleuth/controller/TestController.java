package com.example.cloudalibabasleuth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zqing
 * @description: TODO
 * @date: 2020/11/18 14:01
 */
@RestController
public class TestController {

    @RequestMapping("/getServiceB")
    public String getServiceB(){
        return "hello 调用B服务";
    }


}
