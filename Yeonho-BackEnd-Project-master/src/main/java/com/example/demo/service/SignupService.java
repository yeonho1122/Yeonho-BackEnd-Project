package com.example.demo.service;

import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;
import com.example.demo.dto.User;

import java.util.List;


@Service
public  class SignupService {
    public String signup(User user) {
        if (user.age >= 14) {
            userRepository.save(user);

            return user.name + "님 가입 완료";

        } else {
            return "14세 미만은 가입할 수 없습니다.";
        }
    }

    private final UserRepository userRepository;

    public SignupService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public User findUesrByName(String name) {
        User user = userRepository.findByName(name);


        if (user == null) {
            return null;
        }
        return user;
    }

    public User UpdateUser(int id, User updatedUser) {
        User user = userRepository.findById(id);

        if (user == null) {
            return null;
        }
        user.name = updatedUser.name;
        user.Password =updatedUser.Password;
        user.email =updatedUser.email;
        user.age =updatedUser.age;

        return user;
    }

}




