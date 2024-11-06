package com.compass.spring_course_1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compass.spring_course_1.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
