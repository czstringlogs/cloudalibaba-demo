package com.example.cloudalibabaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zqing
 * @description: TODO
 * @date: 2020/9/27 10:40
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaProviderApplication.class,args);
    }

}
