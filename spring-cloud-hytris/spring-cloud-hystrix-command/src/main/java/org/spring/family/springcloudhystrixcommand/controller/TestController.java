package org.spring.family.springcloudhystrixcommand.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.spring.family.springcloudhystrixcommand.command.TulingHystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/test")
@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;


    /**
     *通过创建command 实现
     * @param userId
     * @return
     */
    @RequestMapping("/getResourceInfo1")
    public List<Map<String,Object>> getResourceInfoByCommand(String userId){
        //构建调用命令模式
        TulingHystrixCommand tulingHystrixCommand = new TulingHystrixCommand("orderGroupKey",restTemplate,userId);
        List<Map<String,Object>> orderVoList =tulingHystrixCommand.execute();
        return orderVoList;
    }

    /**
     * 通过注解去实现
     * @param userId
     * @return
     */
    @HystrixCommand(fallbackMethod="getFallback")
    @RequestMapping("/getResourceInfo2")
    public List<Map<String,Object>> getResourceInfoByAnnotion(String userId){
        String url = "http://localhost:8005/order/getOrderInfo/"+userId;
        ResponseEntity<List> responseEntity  =  restTemplate.getForEntity(url, List.class);
        List<Map<String,Object>> orderVoList = responseEntity.getBody();
        return orderVoList;
    }

    /**
     * 降级方法
     * @return
     */
    protected List<Map<String,Object>> getFallback() {
        List<Map<String,Object>> resources = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        map.put("code","-1");
        map.put("msg","触发降级方法");
        resources.add(map);
        return resources;
    }
}
