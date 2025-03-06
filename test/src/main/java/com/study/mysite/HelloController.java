package com.study.mysite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "sdff";
	}
	@GetMapping("/questionList")
	public String questionList() {
		return "question_list";
	}
	
	/*
	@GetMapping("/")
	public String index() {
		return "main";
	}
	*/
}
