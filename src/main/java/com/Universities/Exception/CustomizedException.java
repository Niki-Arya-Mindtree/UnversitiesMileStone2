package com.Universities.Exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@ControllerAdvice
public class CustomizedException extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(NoIdException.class)
	public final ResponseEntity<Object> handleNoIdException(NoIdException ex, WebRequest request)
	{
		ExceptionModel exModel =new ExceptionModel(new Date() , ex.getMessage() , HttpStatus.NOT_MODIFIED+"" , request.getDescription(false));
		
		return new ResponseEntity<>(exModel,HttpStatus.NOT_MODIFIED);
	}
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request)
	{
		ExceptionModel exModel =new ExceptionModel(new Date() , ex.getMessage() , HttpStatus.NOT_MODIFIED+"" , request.getDescription(false));
		
		return new ResponseEntity<>(exModel,HttpStatus.NOT_MODIFIED);
	}
}
