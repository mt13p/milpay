package com.calc.milpay;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public HelloMessage hello() {
        return new HelloMessage("Hello, World!");
    }

    private static class HelloMessage {

        private String message;

        public HelloMessage(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

    }

}