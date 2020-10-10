package com.example.cloudalibabasender.controller;

import com.example.cloudalibabasender.service.SenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zqing
 * @description: TODO
 * @date: 2020/10/10 15:38
 */
@RestController
public class SenderController {


    @Autowired
    private SenderService senderService;

    @GetMapping("/send")
    public String sendMsg(@RequestParam String msg){
        senderService.getMsg(msg);
        return "success";
    }

}
