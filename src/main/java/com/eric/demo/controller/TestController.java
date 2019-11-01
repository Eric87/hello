package com.eric.demo.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("test/hello")
    public String hello(@RequestParam(value = "name", required = false) String name) {
        return StringUtils.isEmpty(name) ? "Hello!" : "Hello " + name + " !";
    }

}
