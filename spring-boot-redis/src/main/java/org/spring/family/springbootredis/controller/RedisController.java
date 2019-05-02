package org.spring.family.springbootredis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;



    @RequestMapping("/setValue")
    public String setValue(){
        redisTemplate.opsForValue().set("dafeig1","my firstRedis1");
        return "OK";
    }
}
