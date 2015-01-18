package com.project.anyone.article.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.project.anyone.article.model.Article;
import com.project.anyone.common.helper.Page;
import com.project.anyone.common.helper.PagingHelper;

@Service
public class ArticleServiceImpl implements ArticleService {

	public List<HashMap<String, Object>> selectArticleColumnList(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<HashMap<String, Object>> selectArticleList(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	public Article selectArticle(long seq) {
		// TODO Auto-generated method stub
		return null;
	}

	public int insertArticle(Article article) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int selectArticleListCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
