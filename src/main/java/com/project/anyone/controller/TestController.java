package com.project.anyone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/hello.do")
	public String hello() {

		return "/hello";
	}
}
