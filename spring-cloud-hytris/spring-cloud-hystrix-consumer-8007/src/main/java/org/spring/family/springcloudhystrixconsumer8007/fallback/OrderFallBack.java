package org.spring.family.springcloudhystrixconsumer8007.fallback;

import org.spring.family.springcloudhystrixconsumer8007.api.OrderApi;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class OrderFallBack implements OrderApi {

    /**
     * 服务降级处理
     * @param userId
     * @return
     */
    @Override
    public List<Map<String, Object>> getOrderInfo(String userId) {
        List<Map<String,Object>> resources = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        map.put("code","-2");
        map.put("msg","触发降级方法");
        resources.add(map);
        return resources;
    }

    @Override
    public List<Map<String, Object>> getOrderInfoPost(String userId) {
        List<Map<String,Object>> resources = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        map.put("code","-3");
        map.put("msg","触发降级方法");
        resources.add(map);
        return resources;
    }
}
