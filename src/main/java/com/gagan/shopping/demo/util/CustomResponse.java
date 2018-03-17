package com.gagan.shopping.demo.util;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter@Getter@NoArgsConstructor
public class CustomResponse {

    private String message;

    public CustomResponse(String message) {
        this.message = message;
    }
}
