package org.spring.family.springcloudhystrixconsumer8007.controller;
import org.spring.family.springcloudhystrixconsumer8007.api.OrderApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RequestMapping("/testFeign")
@RestController
public class TestController {

    @Resource
    private OrderApi orderApi;

    @RequestMapping("/getResourceInfo")
    public List<Map<String,Object>> getResourceInfo(String userId){
        return orderApi.getOrderInfo(userId);
    }

    @RequestMapping("/getResourceInfoPost")
    public List<Map<String,Object>> getResourceInfoPost(String userId){
        return orderApi.getOrderInfoPost(userId);
    }
}
