package com.example.demo.controller;

import com.example.demo.controller.User;

import com.example.demo.dto.signupRequestDto;
import com.example.demo.dto.signupResponseDto;
import org.springframework.web.bind.annotation.*;


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

    @PostMapping("/signup")
            public String signup(@RequestBody User user)
    {
        return "회원가입 완료";
    }

    @PostMapping("/signup2")
    public User signup2(@RequestBody User user)
    {
        return user;
    }

    @PostMapping("/signup3")
    public signupResponseDto signup3(@RequestBody signupResponseDto request)
    {
        signupResponseDto response = new signupResponseDto();

        response.name = request.name;
        response.email = request.email;

        return response;
    }



}

