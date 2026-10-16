package com.example.demo.repository;

import com.example.demo.dto.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class UserRepository {
    private List<User> users = new ArrayList<>();

    private int nextId = 1;

    public void save(User user) {
        user.Id =nextId;
        users.add(user);
        nextId++;
    }

    public List<User> findAll() {
        return users;
    }


    public User findByName(String name) {
        for (User user : users) {
            if (user.name.equals(name)) {
                return user;
            }
        }
        return null;
    }

    public  User findById(int id) {
        for (User user : users) {
            if (user.Id == id) {
                return user;
            }

        }
        return null;
    }
}
