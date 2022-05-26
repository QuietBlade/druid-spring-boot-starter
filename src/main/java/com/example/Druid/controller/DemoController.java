package com.example.Druid.controller;

import com.example.Druid.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: world
 * @date: 2022/5/24 15:13
 * @description:
 */

@RestController
@RequestMapping("/api/")
public class DemoController {
    @Autowired
    private DemoMapper demoMapper;

    @GetMapping("demo")
    public String demo(){
        return demoMapper.testSelect();

    }
}
