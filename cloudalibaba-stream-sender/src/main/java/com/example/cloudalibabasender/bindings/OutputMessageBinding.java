package com.example.cloudalibabasender.bindings;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author zqing
 * @description: 定义绑定(消息发布者)
 * @date: 2020/10/10 15:31
 */
public interface OutputMessageBinding {

    /**
     * Topic 名称
     */
    String OUTPUT = "msg-out";

    @Output(OUTPUT)
    MessageChannel output();

}
