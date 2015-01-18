package com.project.anyone.article.controller;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.project.anyone.article.model.Article;
import com.project.anyone.article.service.ArticleService;
import com.project.anyone.common.helper.Page;

@Controller
@RequestMapping("/article")
public class ArticleController {
	private static final Logger logger = LoggerFactory.getLogger(ArticleController.class);

	@Autowired
	private SqlSession sqlSession;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Page page, Model model) {
		ArticleService articleService = sqlSession.getMapper(ArticleService.class);

		int articleCount = articleService.selectArticleListCount();
		page.setTotalCount(articleCount);
		page.init();

		model.addAttribute("articleColumnList", articleService.selectArticleColumnList(page));
		model.addAttribute("articleList", articleService.selectArticleList(page));
		model.addAttribute("page", page);

		return "/article/list";
	}

	@RequestMapping(value = "/{seq}", method = RequestMethod.GET)
	public String view(Model model, @PathVariable("seq") long seq) {
		ArticleService articleService = sqlSession.getMapper(ArticleService.class);
		Article article = articleService.selectArticle(seq);
		model.addAttribute("article", article);
		return "/article/view";
	}

	@RequestMapping(value = "/post", method = RequestMethod.GET)
	public ModelAndView post(Model model) {
		return new ModelAndView("/article/post", "article", new Article());
	}

	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public @ResponseBody long submitPost(Article article) {
		ArticleService articleService = sqlSession.getMapper(ArticleService.class);
		articleService.insertArticle(article);
		return article.getSeq();
	}
}
