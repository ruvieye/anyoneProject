package com.project.anyone.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.project.anyone.model.Page;
import com.project.anyone.model.article.Article;
import com.project.anyone.model.article.ArticleColumn;

public interface ArticleMapper {

	//@Select({"SELECT COUNT(1) as cnt FROM tb_article"})
	public int selectArticleListCount();

	public List<ArticleColumn> selectArticleColumnList();

	public List<HashMap<String, Object>> selectArticleList(Page page);

	public Article selectArticle(long seq);

	public int insertArticle(Article article);

	public int deleteArticle(long seq);

	public int updateArticle(Article article);
}