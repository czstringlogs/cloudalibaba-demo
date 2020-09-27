package com.example.cloudalibabaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zqing
 * @description: TODO
 * @date: 2020/9/27 11:24
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CloudAlibabaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaConsumerApplication.class,args);
    }

}
