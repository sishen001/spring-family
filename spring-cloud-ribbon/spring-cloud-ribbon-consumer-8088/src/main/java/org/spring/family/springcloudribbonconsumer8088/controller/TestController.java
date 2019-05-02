package org.spring.family.springcloudribbonconsumer8088.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/test")
@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/testRibbon")
    public String  testRibbon(String msg) throws Exception{
        String url = "http://ms-provider-order/test/getOrderInfo?id="+msg;
        ResponseEntity<String> entity = restTemplate.getForEntity(url,String.class);
        return entity.getBody();
    }

}
