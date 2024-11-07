package com.compass.spring_course_1.errors;

public class InvalidOrderError extends Exception {
    public InvalidOrderError(String message) {
        super("message");
    }
}
