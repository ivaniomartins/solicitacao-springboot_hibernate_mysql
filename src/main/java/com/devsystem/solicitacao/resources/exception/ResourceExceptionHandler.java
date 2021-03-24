package com.devsystem.solicitacao.resources.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.devsystem.solicitacao.services.exception.DataNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(DataNotFoundException.class)
	public ResponseEntity<StandardError> dataNotFoundException(DataNotFoundException exc, HttpServletRequest http ){
		
		StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(),  exc.getMessage(), System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
		
	}

}
