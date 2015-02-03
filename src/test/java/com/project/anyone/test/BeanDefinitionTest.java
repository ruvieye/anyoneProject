package com.project.anyone.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.project.anyone.contorller.ArticleController;
import com.project.anyone.model.article.Article;
import com.project.anyone.repository.ArticleRepository;

public class BeanDefinitionTest {

	@Test
	public void 빈설정테스트() {
		GenericApplicationContext ac = new GenericApplicationContext();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(ac);
		reader.loadBeanDefinitions("classpath:/applicationContexts/root-applicationContext.xml");
		ac.refresh();

		ArticleRepository repository = ac.getBean("articleRepository", ArticleRepository.class);

		Article article = new Article();
		assertEquals(repository.updateArticle(article), 0);

		//아래 테스트는 실패로 끝난다
		//root application에 exclude로 빈스캐닝을 하고 있기 때문이다 
		//ArticleController controller = ac.getBean("articleController", ArticleController.class);
		//assertEquals(controller.main(), "/article/test");

	}

	@Test
	public void 빈상속테스트() {

		ApplicationContext parent = new GenericXmlApplicationContext("classpath:/applicationContexts/root-applicationContext.xml");
		GenericApplicationContext child = new GenericApplicationContext(parent);

		XmlBeanDefinitionReader scReader = new XmlBeanDefinitionReader(child);
		scReader.loadBeanDefinitions("classpath:/applicationContexts/anyoneProject-applicationContext.xml");

		//child에서 선언된 controller를 가져와서 비교 
		ArticleController controller = child.getBean("articleController", ArticleController.class);
		assertEquals(controller.main(), "/article/test");

		//child에서 선언되지 않는 repository를 가져와서 비교 
		ArticleRepository repository = child.getBean("articleRepository", ArticleRepository.class);
		Article article = new Article();
		assertEquals(repository.updateArticle(article), 0);

	}
}
