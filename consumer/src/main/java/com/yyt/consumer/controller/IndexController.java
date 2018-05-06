package com.yyt.consumer.controller;

import com.yyt.consumer.feign.IndexFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private IndexFeign indexFeign;

    @RequestMapping("/")
    public Object index(){
        return indexFeign.index();
    }
}
