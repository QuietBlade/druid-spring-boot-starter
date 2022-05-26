package com.example.Druid.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author: world
 * @date: 2022/5/25 17:17
 * @description: demoMapper
 */
@Mapper
public interface DemoMapper {

    /**
     * 测试sql
     * @return 字符串
     */
    @Select("Select 1")
    public String testSelect();
}
