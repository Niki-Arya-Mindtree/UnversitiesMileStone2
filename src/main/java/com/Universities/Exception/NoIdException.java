package com.Universities.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class NoIdException extends Exception{
	public NoIdException(String str) 
	{
		super(str);
	}
}
