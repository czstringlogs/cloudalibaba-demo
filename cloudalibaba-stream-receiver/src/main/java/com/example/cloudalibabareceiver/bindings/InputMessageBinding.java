package com.example.cloudalibabareceiver.bindings;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author zqing
 * @description: TODO
 * @date: 2020/10/10 15:29
 */
public interface InputMessageBinding {

    String INPUT = "msg-input";

    @Input(INPUT)
    SubscribableChannel input();

}
