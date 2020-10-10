package com.example.cloudalibabareceiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

import javax.xml.transform.Source;

/**
 * @author zqing
 * @description: TODO
 * @date: 2020/10/9 13:30
 */
@SpringBootApplication
public class CloudalibabaReceiverApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaReceiverApplication.class,args);
    }

}
