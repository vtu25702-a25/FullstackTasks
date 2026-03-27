package edu.springorm.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/msg")
	public String showMsg() {
		return "Hi .. welcome tomy home page";
	}

}
