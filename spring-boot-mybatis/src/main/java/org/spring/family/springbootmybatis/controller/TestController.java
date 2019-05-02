package org.spring.family.springbootmybatis.controller;

import com.alibaba.fastjson.JSON;
import org.spring.family.springbootmybatis.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/getInfo")
    public String getInfo() {
        try{
            return JSON.toJSONString(testService.getInfo());
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
