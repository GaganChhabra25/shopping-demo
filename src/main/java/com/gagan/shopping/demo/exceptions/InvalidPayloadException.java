package com.gagan.shopping.demo.exceptions;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;

@Getter@Setter@NoArgsConstructor
public class InvalidPayloadException extends RuntimeException {

    private Errors errors;

    public InvalidPayloadException(Errors bindingResult) {
        this.errors = bindingResult;
    }
 }
