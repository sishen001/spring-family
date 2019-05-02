package org.spring.family.springbootmybatis.service;

import org.spring.family.springbootmybatis.dao.OrderMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    private OrderMapper mapper;

    @Override
    public List<Map<String,Object>> getInfo() throws Exception {
        return mapper.getInfo();
    }
}
