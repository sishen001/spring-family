package org.spring.family.springcloudhystrixconsumer8007.api;

import org.spring.family.springcloudhystrixconsumer8007.config.MsConsumerCustomCfg;
import org.spring.family.springcloudhystrixconsumer8007.fallback.OrderFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

//默认走服务异常，走服务降级
@FeignClient(name = "ms-provider-order-feign",fallback = OrderFallBack.class,path = "/order")
//局部控制服务降级
//@FeignClient(name = "ms-provider-order-feign",configuration = MsConsumerCustomCfg.class,fallback = OrderFallBack.class,path = "/order")
public interface OrderApi {

    @RequestMapping(value="/getOrderInfo/{userId}",method = RequestMethod.GET)
    List<Map<String,Object>> getOrderInfo(@PathVariable("userId") String userId);

    @RequestMapping(value="/getOrderInfoPost",method = RequestMethod.POST)
    List<Map<String,Object>> getOrderInfoPost(@RequestParam("userId") String userId);
}
