package com.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;


@RestController
public class helloController {

    //方式1、使用@CrossOrigin()注解
    @CrossOrigin("http://localhost:8888")
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

//    //方式4、手工设置响应头
//    @GetMapping("/hello")
//    public String index(HttpServletResponse response){
//        response.addHeader("Access-Control-Allow-Origin", "http://localhost:8888");
//        return "hello";
//    }

}
