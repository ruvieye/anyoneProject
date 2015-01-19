package com.project.anyone.article.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.project.anyone.article.model.Article;
import com.project.anyone.common.helper.Page;

public interface ArticleService {
  
  public int selectArticleListCount();
  
  public List<HashMap<String, Object>> selectArticleColumnList();
  
  public List<HashMap<String, Object>> selectArticleList(Page page);
  
  public Article selectArticle(long seq);
  
  public int insertArticle(Article article);
  
  public int deleteArticle(long seq);
  
  public int updateArticle(Article article);
}