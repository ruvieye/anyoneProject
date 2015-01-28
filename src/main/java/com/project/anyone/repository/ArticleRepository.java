package com.project.anyone.repository;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.anyone.mapper.ArticleMapper;
import com.project.anyone.model.Page;
import com.project.anyone.model.article.Article;
import com.project.anyone.model.article.ArticleColumn;

@Repository
public class ArticleRepository {

	@Autowired
	private SqlSessionTemplate sqlSession;

	public int selectArticleListCount() {
		return sqlSession.getMapper(ArticleMapper.class).selectArticleListCount();
	}

	public List<ArticleColumn> selectArticleColumnList() {
		return sqlSession.getMapper(ArticleMapper.class).selectArticleColumnList();
	}

	public List<HashMap<String, Object>> selectArticleList(Page page) {
		return sqlSession.getMapper(ArticleMapper.class).selectArticleList(page);
	}

	public Article selectArticle(long seq) {
		return sqlSession.getMapper(ArticleMapper.class).selectArticle(seq);
	}

	public int insertArticle(Article article) {
		return sqlSession.getMapper(ArticleMapper.class).insertArticle(article);
	}

	public int deleteArticle(long seq) {
		return sqlSession.getMapper(ArticleMapper.class).deleteArticle(seq);
	}

	public int updateArticle(Article article) {
		return sqlSession.getMapper(ArticleMapper.class).updateArticle(article);
	}
}