package com.example.cloudalibabaconsumer.feign;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author zqing
 * @description:  降级处理结果
 * @date: 2020/9/18 14:21
 */
@Component
@Slf4j
public class FeignServiceFallBack implements FallbackFactory<ConsumerFeign> {

    @Override
    public ConsumerFeign create(Throwable throwable) {
        return new ConsumerFeign() {
            @Override
            public String index() {
                return "生产者cloudalibaba-provider服务被降级停用了";
            }
        };
    }
}
