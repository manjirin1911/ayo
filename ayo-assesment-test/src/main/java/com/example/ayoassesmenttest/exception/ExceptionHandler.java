package com.example.ayoassesmenttest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {

	public ResponseEntity<Object> handleException(String msg , Exception e) {
		return new ResponseEntity<Object>(msg, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
