package com.project.anyone.contorller;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.project.anyone.service.ArticleService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/applicationContexts/anyoneProject-applicationContext.xml", "classpath:/applicationContexts/root-applicationContext.xml"})
public class ArticleControllerTest {

	@Autowired
	private ApplicationContext ac;

	@Autowired
	private ArticleService service;

	@Autowired
	private ArticleController controller;

	@Test
	public void 서비스가져오나테스트() {
		assertEquals(this.service.deleteArticle((long)0), 0);

	}

	@Test
	public void 컨트롤러가져오나테스트() {
		assertEquals(controller.main(), "/article/test");
	}
}
