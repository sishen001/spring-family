package org.spring.family.springcloudfeignprovider8006.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface OrderMapper {

    List<Map<String, Object>> getResourceInfo(String resCode);
}
