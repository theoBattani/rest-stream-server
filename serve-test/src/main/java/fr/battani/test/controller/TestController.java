package fr.battani.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("message")
    public ResponseEntity<String> getMessage() {
        return ResponseEntity.ok("Nick's hammer");
    }
}
