package com.aaa.boottest.controller;

import com.aaa.boottest.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * fileName:TestController
 * description:
 * author:zz
 * createTime:2019-05-20 21:22
 */
@Controller
@RequestMapping("/test")
public class TestController {
   @Autowired
    private   TestService testService;
    @RequestMapping("/show")
    @ResponseBody
    public List show(){
        return testService.show();
    }
}
