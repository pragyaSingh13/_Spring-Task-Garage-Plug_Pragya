package com.order.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import com.order.PayLoad.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFound.class)
	public ResponseEntity<ApiResponse> handleResourceNotFound(ResourceNotFound ex){
		    ApiResponse api = new ApiResponse(ex.getMessage(), false);
		    return new ResponseEntity<ApiResponse>(api,HttpStatus.BAD_REQUEST);
	}
}
