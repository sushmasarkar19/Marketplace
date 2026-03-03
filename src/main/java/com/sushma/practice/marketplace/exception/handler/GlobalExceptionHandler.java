package com.sushma.practice.marketplace.exception.handler;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.sushma.practice.marketplace.dto.ErrorResponseDto;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorResponseDto> handleValidationExceptions(MethodArgumentNotValidException ex) {

		List<String> errors = ex.getBindingResult().getFieldErrors().stream().map(error -> error.getDefaultMessage())
				.toList();

		ErrorResponseDto response = new ErrorResponseDto(HttpStatus.BAD_REQUEST.value(), errors);

		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);

	}

}
