package order.spring.family.springcloudfeignapi.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@FeignClient(name = "ms-provider-order-feign",path = "/order")
public interface OrderApi {

    @RequestMapping(value="/getOrderInfo/{userId}",method = RequestMethod.GET)
    List<Map<String,Object>> getOrderInfo(@PathVariable("userId") String userId);

    @RequestMapping(value="/getOrderInfoPost",method = RequestMethod.POST)
    List<Map<String,Object>> getOrderInfoPost(@RequestParam("userId") String userId);
}
