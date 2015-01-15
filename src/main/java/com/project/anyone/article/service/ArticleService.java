package com.project.anyone.article.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.project.anyone.article.model.Article;

public interface ArticleService {

	public List<HashMap<String, Object>> selectArticleColumnList(Model model);

	public List<HashMap<String, Object>> selectArticleList(Model model);

	public Article selectArticle(long seq);

	public int insertArticle(Article article);
}