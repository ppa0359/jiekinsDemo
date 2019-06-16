package com.aaa.boottest.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * fileName:TestMapper
 * description:
 * author:zz
 * createTime:2019-05-20 21:33
 */
@Mapper
public interface TestMapper {
@Select("select * from aaa")
    public List<Map> show();
}
