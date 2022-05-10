package com.origin.webcurriculo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Hello {
	
	@RequestMapping("/hello")
	public String hello() {
		return "--> olla este é um teste de @RestController";
	}

}
