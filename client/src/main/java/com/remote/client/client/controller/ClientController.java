package com.remote.client.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

    @Value("${BACKEND_URL}")
    private String backendUrl;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/client-response")
    public ResponseEntity<String> getResponseEntity(){
        return restTemplate.getForEntity(backendUrl,String.class);
    }

}
