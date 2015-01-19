package com.project.anyone.article.repostitory;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.project.anyone.article.model.Article;
import com.project.anyone.common.helper.Page;

@Repository
public class ArticleRepository {
  
  @Autowired
  private SqlSessionTemplate sqlSession;
  private final String NAMESAPCE = "com.project.anyone.article.";
  
  public int selectArticleListCount() {
    return sqlSession.selectOne(NAMESAPCE + "selectArticleListCount");
  }
  
  public List<HashMap<String, Object>> selectArticleColumnList() {
    return sqlSession.selectList(NAMESAPCE + "selectArticleColumnList");
  }
  
  public List<HashMap<String, Object>> selectArticleList(Page page) {
    return sqlSession.selectList(NAMESAPCE + "selectArticleList", page);
  }
  
  public Article selectArticle(long seq) {
    return sqlSession.selectOne(NAMESAPCE + "selectArticle", seq);
  }
  
  public int insertArticleList(Article article) {
    return sqlSession.insert(NAMESAPCE + "insertArticle", article);
  }
}