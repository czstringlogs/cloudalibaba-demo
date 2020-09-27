package com.example.cloudalibabaprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zqing
 * @description: TODO
 * @date: 2020/9/27 11:07
 */
@RestController
public class ProviderController {

    @GetMapping("/index")
    public String index(){
        return "Hello Provider";
    }

}
