package com.fizzli.spring.boot.hello.world.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 返回字符串 "Hello World"
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/")
    @ResponseBody
    public String SayHello(){

        return "Hello World!!!";
    }
}
