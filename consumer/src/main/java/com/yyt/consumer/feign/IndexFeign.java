package com.yyt.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("SERVER")
public interface IndexFeign {

    @RequestMapping("/")
    Object index();
}
