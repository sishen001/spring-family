package org.spring.family.springcloudribbonprovider8005.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

    @RequestMapping("/getOrderInfo")
    public String getOrderInfo(String id){
        return "8005_______"+id;
    }
}
