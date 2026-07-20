package com.example.demo.controller;

import com.example.demo.controller.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class HelloWolrdController {


    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("/neme")
    public String neme(){
        String qu = "영희";
        return qu;
    }

    @GetMapping("/age")
    public String age(){
        String w = "25";
        return w;
    }

    @GetMapping("/sum")
    public int sum(){
        int a = 10;
        int b = 20;
        return a + b;
    }
    @GetMapping("/product")
    public String product(@RequestParam String id){
        return "상품번호:"+id;
    }

    @PostMapping("/singup")
            public String singup(User user)
    {
        return "회원가입 완료";
    }





}

