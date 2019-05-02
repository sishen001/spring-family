package org.spring.family.springbootmybatis.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface OrderMapper {

    List<Map<String,Object>> getInfo();
}
