package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {
	@GetMapping
	public String hello() {
		return "Hello Generation!!";
	}
}
