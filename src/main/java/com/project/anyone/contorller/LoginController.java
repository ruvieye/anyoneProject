package com.project.anyone.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@RequestMapping(method = RequestMethod.GET, value = "/login")
	public String login() {
		return "login";
	}


	@RequestMapping(method = RequestMethod.GET, value = "/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/error/accessDenied")
	public String accessDenied() {
		return "/error/accessDenied";
	}
	
	@RequestMapping("/account")
	public String account() {
		return "/account/form";
	}

}
