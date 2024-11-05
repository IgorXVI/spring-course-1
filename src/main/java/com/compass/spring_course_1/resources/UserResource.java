package com.compass.spring_course_1.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compass.spring_course_1.entities.User;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Igor", "igor@hotmail.com", "33339342", "admin123");
        return ResponseEntity.ok().body(user);
    }
}
