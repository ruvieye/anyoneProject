/*
 * @(#) ArticleController.java 2015. 1. 26 
 *
 * Copyright 2014 NHN Entertainment Corp. All rights Reserved. 
 * NHN Entertainment PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.project.anyone.contorller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.project.anyone.model.Page;
import com.project.anyone.model.article.Article;
import com.project.anyone.model.article.ArticleColumn;
import com.project.anyone.service.ArticleService;

/**
 * The Class ArticleController.
 *
 * @author Heesu Sohn
 */
@Controller
@RequestMapping("/article")
public class CopyOfArticleController {
	private static final Logger logger = LoggerFactory.getLogger(CopyOfArticleController.class);

	@Autowired
	private ArticleService articleService;


	@RequestMapping(value = {"/test"}, method = RequestMethod.GET)
	public String main() {
		return "/article/test";
	}

	// headers = "x-requested-with=XMLHttpRequest"
	/**
	 * 게시판
	 * List.
	 *
	 * @param page the page
	 * @param model the model
	 * @return the string
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String article(Model model) {
		logger.debug("여기다 졸 멋진 기능을 만들었다. + myFeature 라고 선언하고 커밋+ myFeature2 커밋");
		return "/article/main";
	}

	/**
	 * 게시판 목록
	 * List.
	 *
	 * @param page the page
	 * @param model the model
	 * @return the string
	 */
	@RequestMapping(value = "/columns", method = RequestMethod.GET)
	public @ResponseBody List<ArticleColumn> columns(Page page) {
		return articleService.selectArticleColumnList();

	}

	@RequestMapping(value = "/articles", method = RequestMethod.GET)
	public @ResponseBody List<HashMap<String, Object>> articles(Page page) {
		int articleCount = articleService.selectArticleListCount();
		page.setTotalCount(articleCount);
		page.init();
		return articleService.selectArticleList(page);

	}

	/**
	 * 게시물 조회
	 * View.
	 *
	 * @param model the model
	 * @param seq the seq
	 * @return the string
	 */
	@RequestMapping(value = "/{seq}", method = RequestMethod.GET)
	public String view(Model model, @PathVariable("seq") long seq) {
		model.addAttribute("article", articleService.selectArticle(seq));
		return "/article/view";
	}

	/**
	 * 게시물 수정처리
	 * Update post.
	 *
	 * @param model the model
	 * @param article the article
	 * @return the map
	 */
	@RequestMapping(value = "/{seq}", method = RequestMethod.PUT)
	public @ResponseBody Map<String, Object> updatePost(Model model, Article article) {
		articleService.updateArticle(article);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", "OK");
		resultMap.put("seq", article.getSeq());

		return resultMap;

	}

	/**
	 * 게시물 삭제처리
	 * Delete.
	 *
	 * @param seq the seq
	 * @return the map
	 */
	@RequestMapping(value = "/{seq}", method = RequestMethod.DELETE)
	public @ResponseBody Map<String, Object> delete(@PathVariable("seq") long seq) {
		articleService.deleteArticle(seq);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", "OK");
		resultMap.put("seq", seq);

		return resultMap;

	}

	/**
	 * 글등록 화면
	 * Post.
	 *
	 * @param model the model
	 * @return the model and view
	 */
	@RequestMapping(value = "/post", method = RequestMethod.GET)
	public ModelAndView post(Model model) {
		return new ModelAndView("/article/post", "article", new Article());
	}

	/**
	 * 글 등록 처리
	 * Submit post.
	 *
	 * @param article the article
	 * @return the map
	 */
	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> submitPost(Article article) {
		articleService.insertArticle(article);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", "OK");
		resultMap.put("seq", article.getSeq());

		return resultMap;
	}

}
