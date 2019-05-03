package org.spring.family.springcloudhystrixcommand.command;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by smlz on 2019/4/12.
 */
@Slf4j
public class TulingHystrixCommand extends HystrixCommand<List<Map<String,Object>>> {

    private String userId;

    private RestTemplate restTemplate;

    @Override
    protected List<Map<String,Object>> run() throws Exception {
        String url = "http://127.0.0.1:8005/order/getOrderInfo/"+userId;
        ResponseEntity<List> responseEntity  =  restTemplate.getForEntity(url, List.class);
        List<Map<String,Object>> orderVoList = responseEntity.getBody();
        log.info("查询出的resroucesVoList:{}",orderVoList);
        return orderVoList;
    }

    public static void main(String[] arg0){
        String url = "http://127.0.0.1:8005/order/getOrderInfo/2018001002001";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List> responseEntity  =  restTemplate.getForEntity(url, List.class);
        System.out.println(responseEntity);
    }

    /**
     * 降级方法(回退)
     * @return
     */
    @Override
    protected List<Map<String,Object>> getFallback() {
        log.info("触发降级方法========================>");
        List<Map<String,Object>> resources = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        map.put("code","-1");
        map.put("msg","触发降级方法");
        resources.add(map);
        return resources;
    }

    //构造方法
    public TulingHystrixCommand(String commandGroupKey, RestTemplate restTemplate, String userId) {
        super(HystrixCommandGroupKey.Factory.asKey(commandGroupKey));
        this.restTemplate = restTemplate;
        this.userId = userId;
    }
}
