package com.remote.service.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendController {

    @Autowired
    private HttpHeaders httpHeaders;


    @GetMapping("/getbackend-response")
    public ResponseEntity<String> getBackendResponse(){
        String response = "{\n" +
                "    \"source\":\"backend\",\n" +
                "    \"data\":\"source\"\n" +
                "}";
        return ResponseEntity.ok().headers(httpHeaders).body(response);
    }

}
