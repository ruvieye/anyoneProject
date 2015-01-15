package com.project.anyone.article.controller;

import org.apache.ibatis.session.SqlSession;
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

@Controller
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	private SqlSession sqlSession;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		ArticleService articleService = sqlSession.getMapper(ArticleService.class);
		model.addAttribute("articleColumnList", articleService.selectArticleColumnList(model));
		model.addAttribute("articleList", articleService.selectArticleList(model));

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
