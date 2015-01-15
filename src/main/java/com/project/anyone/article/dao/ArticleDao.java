package com.project.anyone.article.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.project.anyone.article.model.Article;

@Repository
public class ArticleDao {
  
  @Autowired
  private SqlSession sqlSession;
  
  public List<HashMap<String, Object>> selectArticleColumnList(Model model) {
    List<HashMap<String, Object>> columns = sqlSession.selectList("com.project.anyone.selectArticleColumnList");
    return columns;
  }
  
  public List<HashMap<String, Object>> selectArticleList(Model model) {
    List<HashMap<String, Object>> articleList = sqlSession.selectList("com.project.anyone.selectArticleList", model);
    return articleList;
  }
  
  public int insertArticleList(Article article) {
    return sqlSession.insert("com.project.anyone.insertArticle", article);
  }
}