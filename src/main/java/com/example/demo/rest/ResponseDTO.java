package com.example.demo.rest;

class ResponseDTO {

    public final String c = "ok";

    public static ResponseDTO create() {
        return new ResponseDTO();
    }
}
