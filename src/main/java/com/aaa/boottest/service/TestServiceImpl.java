package com.aaa.boottest.service;

import com.aaa.boottest.dao.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * fileName:TestServiceImpl
 * description:
 * author:zz
 * createTime:2019-05-20 21:42
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;
    @Override
    public List<Map> show() {
        return testMapper.show();
    }
}
