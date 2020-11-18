package com.example.demo.rest;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

@RestController
public class APIEndpoint {

    @ApiOperation(value = "method")
    @ApiResponses(value = {
            @ApiResponse(code = 401, response = String.class, message = "forbidden"),
            @ApiResponse(code = 403, response = String.class, message = "unauthorized"),
            @ApiResponse(code = 404, response = String.class, message = "not_found")
    })
    @PostMapping(
            value = "method",
            produces = {APPLICATION_XML_VALUE},
            consumes = {APPLICATION_XML_VALUE}
    )
    ResponseEntity<ResponseDTO> method(@RequestBody RequestDTO requestDTO){
        return ResponseEntity.ok(ResponseDTO.create());
    }


}
