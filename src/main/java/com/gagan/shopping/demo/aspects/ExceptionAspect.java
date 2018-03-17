package com.gagan.shopping.demo.aspects;

import com.gagan.shopping.demo.bindings.FieldErrorBindings;
import com.gagan.shopping.demo.exceptions.InvalidPayloadException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@RestControllerAdvice
public class ExceptionAspect {

    @ExceptionHandler({InvalidPayloadException.class})
    public ResponseEntity handleInvalidPayloadException(RuntimeException r, WebRequest request) {
        System.out.println("Into advice");
        InvalidPayloadException invalidPayloadException = (InvalidPayloadException)r;
        Errors errors =  invalidPayloadException.getErrors();
        FieldErrorBindings fieldErrorBindings = new FieldErrorBindings();
        List<FieldError> fieldErrors =  errors.getFieldErrors();
         fieldErrors.forEach(fieldError -> {
             fieldErrorBindings.setField(fieldError.getField());
             fieldErrorBindings.setMessage(fieldError.getDefaultMessage());
      });
      return new ResponseEntity(fieldErrorBindings, HttpStatus.BAD_REQUEST);
    }
}
