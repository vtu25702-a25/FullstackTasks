package edu.springorm.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@GetMapping("/Productservice")
	public String showmsg() {
		return "hi welcomee to official page of BCCI";
	}

}
