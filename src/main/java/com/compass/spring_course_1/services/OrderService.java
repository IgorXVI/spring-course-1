package com.compass.spring_course_1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.compass.spring_course_1.entities.Order;
import com.compass.spring_course_1.repositories.OrderRepository;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> listAll() {
        List<Order> result = repository.findAll();
        return result;
    }

    public Order findById(Long id) {
        Optional<Order> result = repository.findById(id);
        return result.get();
    }
}
