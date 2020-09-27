package com.example.cloudalibabaconsumer.controller;

import com.example.cloudalibabaconsumer.feign.ConsumerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zqing
 * @description: TODO
 * @date: 2020/9/27 11:26
 */
@RestController
public class ConsumerController {

    @Autowired
    private ConsumerFeign consumerFeign;

    @GetMapping("/index")
    public String index(){
        return "Hello Consumer";
    }


    @GetMapping("/getInfo")
    public String getProvider(){
      return  "消费者调用生产者："+ consumerFeign.index();
    }

}
