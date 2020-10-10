package com.example.cloudalibabasender.service.impl;

import com.example.cloudalibabasender.bindings.OutputMessageBinding;
import com.example.cloudalibabasender.service.SenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zqing
 * @description: TODO
 * @date: 2020/10/10 15:34
 */
@Service
@EnableBinding(OutputMessageBinding.class)
public class SenderServiceImpl implements SenderService {

    @Resource
    private OutputMessageBinding outputMessageBinding;

    @Override
    public void getMsg(String msg) {

        outputMessageBinding.output().send(MessageBuilder.withPayload(msg).build());

    }
}
