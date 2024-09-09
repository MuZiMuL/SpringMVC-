package com.itYang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    //handler -> springmvc/hello  return "hello springmvc"
    @RequestMapping("springmvc/hello")
    @ResponseBody //直接返回字符串给前端 不要找视图解析器
    public String hello(){
        System.out.println("HelloController.hello");
        //返回给前端
        return "hello springmvc!!";
    }

}
