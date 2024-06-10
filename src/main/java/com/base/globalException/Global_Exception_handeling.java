package com.base.globalException;

import java.util.NoSuchElementException;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Global_Exception_handeling {
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handelnoSuchElementException(NoSuchElementException elementexp){
		
		return new ResponseEntity<String>("Invalid id ,not available in db......", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<String> handelduplicateElementException(DataIntegrityViolationException duplicateelementexp){
		
		return new ResponseEntity<String>("Duplicate entry ,duplicate data in db......", HttpStatus.BAD_REQUEST);
	}
	
	
}
