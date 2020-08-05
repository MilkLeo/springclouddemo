package com.springcloud.demo.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("sayHello")
    public String sayHello(@RequestParam String name){

        return name;
    }
}
