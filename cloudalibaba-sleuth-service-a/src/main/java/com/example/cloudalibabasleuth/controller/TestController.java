package com.example.cloudalibabasleuth.controller;

import com.example.cloudalibabasleuth.feign.ServiceAFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zqing
 * @description: TODO
 * @date: 2020/11/18 14:01
 */
@RestController
public class TestController {
    @Autowired
    private ServiceAFeign serviceAFeign;

    @RequestMapping("/indexA")
    public String getInfo(){
        return "hello service-a";
    }

    @RequestMapping("/indexB")
    public String getServiceB(){
        return serviceAFeign.getServiceB();
    }

}
