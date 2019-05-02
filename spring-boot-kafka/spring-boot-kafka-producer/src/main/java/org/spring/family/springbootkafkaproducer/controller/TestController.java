package org.spring.family.springbootkafkaproducer.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @RequestMapping("/send")
    public String sendMsg(String msg){
        JSONObject json = new JSONObject();
        json.put("aa",msg);
        kafkaTemplate.send("order","log_",json.toJSONString());
        return "success";
    }
}
