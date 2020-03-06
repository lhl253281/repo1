package com.leyou.item.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class TestController {


    @GetMapping("/test")
    @ResponseBody
    public String Test(){


        System.out.println("hello test");

        return "hello test";
    }


}
