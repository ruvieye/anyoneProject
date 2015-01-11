package com.project.anyone.common.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	@Autowired
	private SqlSession sqlSession;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(Locale locale, Model model) {

		HashMap<String, String> input = new HashMap<String, String>();
		List<HashMap<String, String>> outputs = sqlSession.selectList(
				"com.project.anyone.selectTestUserList", input);
		System.out.print(outputs.toString());

		return "hello";
	}

	@RequestMapping(value="/insert")
	public String insert(){
		HashMap<String, String> input = new HashMap<String, String>();
		List<HashMap<String, String>> outputs = sqlSession.selectList(
				"com.project.anyone.insertTestUser", input);
		System.out.print(outputs.toString());

		return "hello";
	}
	
}
