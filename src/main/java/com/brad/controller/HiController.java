package com.brad.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoubd
 * @Date 2018/11/13 9:15
 * @@Description
 */
@Slf4j
@RestController("/")
public class HiController {
    @Value("${server.port}")
    private String port;

    @GetMapping("hi")
    public String home(@RequestParam String name) {
        return "hi " + name + ", i am from port: " + port;
    }
}
