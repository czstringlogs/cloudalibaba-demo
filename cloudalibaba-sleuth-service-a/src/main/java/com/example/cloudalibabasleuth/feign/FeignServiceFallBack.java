package com.example.cloudalibabasleuth.feign;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author zqing
 * @description: 降级处理
 * @date: 2020/11/18 14:10
 */
@Component
@Slf4j
public class FeignServiceFallBack implements FallbackFactory<ServiceAFeign> {

    @Override
    public ServiceAFeign create(Throwable throwable) {
        return new ServiceAFeign() {
            @Override
            public String getServiceB() {
                return "服务被降级";
            }
        };
    }
}
