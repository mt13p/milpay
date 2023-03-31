package com.calc.milpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MilpayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MilpayApplication.class, args);
	}

	/*@GetMapping("/hello")
	public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}*/

	@GetMapping("/api/hello")
	public MilpayApplication.HelloMessage hello() {
		return new MilpayApplication.HelloMessage("Hello, World!");
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
