package com.example.cloudalibabasleuth.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zqing
 * @description: TODO
 * @date: 2020/11/18 14:08
 */

@FeignClient(name = "sleuth-b-server",fallbackFactory = FeignServiceFallBack.class)
public interface ServiceAFeign {
    @RequestMapping("/getServiceB")
    String getServiceB();
}
