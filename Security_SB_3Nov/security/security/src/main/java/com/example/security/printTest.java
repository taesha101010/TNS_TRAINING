
package com.example.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class printTest {

    @GetMapping("/hi")
    public String hi() {
        return "Hii Taesha";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Taesha";
    }

    @GetMapping("/hallo")
    public String hallo() {
        return "Hallo my Baby....";
    }
}
