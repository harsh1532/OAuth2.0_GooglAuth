package com.example.SpringOAuthDemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
 
	@GetMapping({"hello"})
	public String hello(){
		System.out.println("Hello Controller called");
		return "Hello World....";
	}
}
