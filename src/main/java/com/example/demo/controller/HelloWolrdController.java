package com.example.demo.controller;

import com.example.demo.dto.User;

import com.example.demo.dto.signupResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.SignupService;
import java.util.List;


@RestController
public class HelloWolrdController {


    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/neme")
    public String neme() {
        String qu = "영희";
        return qu;
    }

    @GetMapping("/age")
    public String age() {
        String w = "25";
        return w;
    }

    @GetMapping("/sum")
    public int sum() {
        int a = 10;
        int b = 20;
        return a + b;
    }





    @PostMapping("/signup2")
    public User signup2(@RequestBody User user) {
        return user;
    }

    @PostMapping("/signup3")
    public signupResponseDto signup3(@RequestBody signupResponseDto request) {
        signupResponseDto response = new signupResponseDto();

        response.name = request.name;
        response.email = request.email;

        return response;
    }


    private final SignupService signupService;

    public HelloWolrdController(SignupService signupService){
        this.signupService = signupService;
    }

    @PostMapping("/Registration-complete")
    public String Registrationcomplete (@RequestBody User user){
        return signupService.signup(user);
    }

    @GetMapping("/gi")
    public List<User> findAllUsers(){
        return signupService.findAllUsers();
    }

    @GetMapping("/users/{name}")
    public ResponseEntity<User> findUser(@PathVariable String name){
        User user = signupService.findUesrByName(name);
        if (user == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(user);
    }
    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable int id,
                                           @RequestBody User updatedUser){
        User user = signupService.UpdateUser(id,updatedUser);

        if (user == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);



    }


}

