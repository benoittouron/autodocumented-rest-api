package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilController {

    @RequestMapping("/version")
    public String version() {
        return "1.0";
    }
}
