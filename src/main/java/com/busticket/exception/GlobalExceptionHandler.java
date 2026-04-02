package com.busticket.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.busticket.dto.response.ErrorResponse;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleResourceNotFoundexception(ResourceNotFoundException e, HttpServletRequest request) {
		return new ResponseEntity<ErrorResponse>(new ErrorResponse(e.getMessage(),request.getRequestURI(),HttpStatus.BAD_REQUEST.value(),LocalDateTime.now()),HttpStatus.BAD_REQUEST);
	}

}
