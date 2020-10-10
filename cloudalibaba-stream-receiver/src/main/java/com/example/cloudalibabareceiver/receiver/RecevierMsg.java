package com.example.cloudalibabareceiver.receiver;

import com.example.cloudalibabareceiver.bindings.InputMessageBinding;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * @author zqing
 * @description: TODO
 * @date: 2020/10/10 15:58
 */
@Slf4j
@EnableBinding(InputMessageBinding.class)
public class RecevierMsg {

    @StreamListener(InputMessageBinding.INPUT)
    public void recevierMsg(String msg){
        log.info("[消息] 接收到发送消息MQ: {}", msg);
    }

}
