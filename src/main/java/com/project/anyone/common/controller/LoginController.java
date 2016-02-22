package com.project.anyone.common.controller;

import java.util.Locale;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@Autowired
	private SqlSession sqlSession;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String hello(Locale locale, Model model) {
		System.out.println("콜미");
		return "index";
	}

}
