package com.example.testservice2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainRestController {

    @GetMapping("/")
    public ResponseEntity<String> Greet(){
        return new ResponseEntity<>("Hello from test service 2",HttpStatus.OK);
    }

    @GetMapping("/fromservice2")
    public ResponseEntity<String> getDataFromServiceTwo(){
        RestTemplate restTemplate = new RestTemplate();
        String url="http://localhost:8072/test-service-2";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return response;
    }
}
