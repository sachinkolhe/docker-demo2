package com.example.demodocker2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Value("${example.myvalue}")
    String val;

    @GetMapping("/")
    public String home() {
        return val;
    }
}
