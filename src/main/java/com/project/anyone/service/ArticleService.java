package com.project.anyone.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.anyone.model.Page;
import com.project.anyone.model.article.Article;
import com.project.anyone.model.article.ArticleColumn;
import com.project.anyone.repository.ArticleRepository;

@Service
public class ArticleService {

	@Autowired
	private ArticleRepository articleRepository;

	public int selectArticleListCount() {
		return articleRepository.selectArticleListCount();
	}

	public List<ArticleColumn> selectArticleColumnList() {
		return articleRepository.selectArticleColumnList();
	}

	public List<HashMap<String, Object>> selectArticleList(Page page) {
		return articleRepository.selectArticleList(page);
	}

	public Article selectArticle(long seq) {
		return articleRepository.selectArticle(seq);
	}

	public int insertArticle(Article article) {
		return articleRepository.insertArticle(article);
	}

	public int deleteArticle(long seq) {
		return articleRepository.deleteArticle(seq);
	}

	public int updateArticle(Article article) {
		return articleRepository.updateArticle(article);
	}

}
