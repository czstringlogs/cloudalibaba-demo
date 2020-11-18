package com.example.cloudalibabasleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zqing
 * @description: TODO
 * @date: 2020/11/18 13:53
 */
@SpringBootApplication
@EnableFeignClients
public class CloudAlibabaSleuthServiceAApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaSleuthServiceAApplication.class,args);
    }

}
