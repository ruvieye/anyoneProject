package com.project.anyone.article.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.anyone.article.dao.ArticleDao;
import com.project.anyone.article.model.Article;

@Controller
@RequestMapping("/article")
public class ArticleController {
  
  @Autowired
  private ArticleDao articleDao;
  
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String list(Model model) {
    model.addAttribute("articleColumnList", articleDao.selectArticleColumnList(model));
    model.addAttribute("articleList", articleDao.selectArticleList(model));
    
    return "/article/list";
  }
  
  @RequestMapping(value = "/post", method = RequestMethod.GET)
  public ModelAndView post(Model model) {
    return new ModelAndView("/article/post", "article", new Article());
  }
  
  @RequestMapping(value = "/post", method = RequestMethod.POST)
  public ModelAndView submitPost(Article model) {
    int result = articleDao.insertArticleList(model);
    
    ModelAndView mv = new ModelAndView();
    mv.setViewName("jsonView");
    mv.addObject("result", result);
    
    return mv;
  }
}
