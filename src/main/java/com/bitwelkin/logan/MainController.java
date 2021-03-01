package com.bitwelkin.logan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class MainController {

	@GetMapping("/list")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/{id}")
	public String getProductById(@RequestParam int id) {
		System.out.println("value for id is:"+id);
		return "success";
	}
}
