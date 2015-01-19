package com.project.anyone.article.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.project.anyone.article.model.Article;
import com.project.anyone.article.repostitory.ArticleRepository;
import com.project.anyone.common.helper.Page;
import com.project.anyone.common.helper.PagingHelper;

@Service
public class ArticleServiceImpl implements ArticleService {
  
  @Autowired
  private ArticleRepository articleRepository;
  
  public int selectArticleListCount() {
    return articleRepository.selectArticleListCount();
  }
  
  public List<HashMap<String, Object>> selectArticleColumnList() {
    return articleRepository.selectArticleColumnList();
  }
  
  public List<HashMap<String, Object>> selectArticleList(Page page) {
    return articleRepository.selectArticleList(page);
  }
  
  public Article selectArticle(long seq) {
    return articleRepository.selectArticle(seq);
  }
  
  public int insertArticle(Article article) {
    return articleRepository.insertArticleList(article);
  }
  
}
