package com.example.cloudalibabaconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zqing
 * @description: TODO
 * @date: 2020/9/27 13:14
 */
// name :是yml 文件中的sprping.application.name ,
// FeignServiceFallBack  降级   当服务宕机时返回给页面的异常处理
@FeignClient(name = "provider-server",fallbackFactory = FeignServiceFallBack.class)
public interface ConsumerFeign {
    // 路径、方法名称必须与生产者一样，不然没有办法调用
    @GetMapping("/index")
    String index();
}
