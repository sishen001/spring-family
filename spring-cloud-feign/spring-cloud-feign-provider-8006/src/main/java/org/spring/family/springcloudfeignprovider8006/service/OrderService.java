package org.spring.family.springcloudfeignprovider8006.service;

import java.util.List;
import java.util.Map;

public interface OrderService {

    List<Map<String,Object>> getOrderInfo(String userId);
}
