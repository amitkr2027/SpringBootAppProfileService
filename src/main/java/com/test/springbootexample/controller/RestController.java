package com.test.springbootexample.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {
	@RequestMapping("/home")
	public @ResponseBody Object home(HttpServletResponse response) {
		return "Demo Services With build successful are running...";
	}
}
