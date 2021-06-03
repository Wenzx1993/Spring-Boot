package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {   


    @RequestMapping("test1")
    public String getOne() {
        return "你好啊";
    }

    @RequestMapping("test2")
    public String getTwo() {
        return "你好啊测试aaaaa";
    }
}
