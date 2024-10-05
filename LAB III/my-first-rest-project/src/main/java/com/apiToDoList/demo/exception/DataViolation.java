package com.apiToDoList.demo.exception;

public class DataViolation extends RuntimeException {
    public DataViolation(String message) {
        super(message);
    }
}
