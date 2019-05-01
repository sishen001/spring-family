package org.spring.family.springbootredis.importBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class TestService {

    @Autowired
    private RedisTemplate redisTemplate;
    
    public TestService(){
        System.out.println("我是导入进来的 通过 importSeletor");
    }
}
