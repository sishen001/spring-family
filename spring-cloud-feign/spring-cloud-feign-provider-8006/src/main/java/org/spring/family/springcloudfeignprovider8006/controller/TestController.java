package org.spring.family.springcloudfeignprovider8006.controller;

import org.spring.family.springcloudfeignprovider8006.service.OrderService;
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
    public List<Map<String,Object>> getOrderInfo(@PathVariable("userId") String userId){
        return orderService.getOrderInfo(userId);
    }
    @RequestMapping(value = "/getOrderInfoPost",method = RequestMethod.POST)
    public List<Map<String,Object>> getOrderInfoPost(@RequestParam("userId") String userId){
        return orderService.getOrderInfo(userId);
    }
}
