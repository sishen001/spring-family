package org.spring.family.springcloudfeignprovider8005.controller;

import org.spring.family.springcloudfeignprovider8005.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class TestController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/getOrderInfo/{userId}")
    public List<Map<String,Object>> getOrderInfo(@PathVariable("userId") String userId) throws  Exception{
        if("2018000000001".equals(userId)){
            throw new RuntimeException("异常");
        }
        if("2018001000000".equals(userId)){
            Thread.sleep(5000);
        }
        return orderService.getOrderInfo(userId);
    }

    @RequestMapping(value = "/getOrderInfoPost",method = RequestMethod.POST)
    public List<Map<String,Object>> getOrderInfoPost(@RequestParam("userId") String userId){
        return orderService.getOrderInfo(userId);
    }

}
