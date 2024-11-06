package com.compass.spring_course_1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.compass.spring_course_1.entities.User;
import com.compass.spring_course_1.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> listAll() {
        List<User> result = repository.findAll();
        return result;
    }

    public User findById(Long id) {
        Optional<User> result = repository.findById(id);
        return result.get();
    }
}
