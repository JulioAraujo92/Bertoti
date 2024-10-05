package com.apiToDoList.demo.web.exception;

import com.apiToDoList.demo.exception.DataViolation;
import com.apiToDoList.demo.exception.EntityNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class ApiExceptionHandler {
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ErrorMessage> entityNotFoundException(RuntimeException ex, HttpServletRequest request){
        log.error("API ERROR - ", ex);

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .contentType(MediaType.APPLICATION_JSON)
                .body(new ErrorMessage(request, HttpStatus.NOT_FOUND, ex.getMessage()));
    }

    @ExceptionHandler(DataViolation.class)
    public ResponseEntity<ErrorMessage> dataViolation(RuntimeException ex, HttpServletRequest request){
         return ResponseEntity
                 .status(HttpStatus.CONFLICT)
                 .contentType(MediaType.APPLICATION_JSON)
                 .body(new ErrorMessage(request, HttpStatus.CONFLICT, ex.getMessage()));
    }
}
