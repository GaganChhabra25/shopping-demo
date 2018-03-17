package com.gagan.shopping.demo.util;


public enum ResponseMessage {

    SUCCESS("success"),
    FAILURE("failure");

    String message;

    ResponseMessage(String messgage) {
        this.message = messgage;
    }

    public String getMessage() {
        return this.message;
    }
}
