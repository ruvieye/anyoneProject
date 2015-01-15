package com.project.anyone.article.model;

import java.util.Date;

public class Article {
  private Long seq;
  private Integer bbsNo;
  private Integer articleNo;
  private String articleTitle;
  private String articleContent;
  private String writer;
  private String userId;
  private Date registerDatetime;
  private Date modifyDatetime;
  
  public Long getSeq() {
    return seq;
  }
  
  public void setSeq(Long seq) {
    this.seq = seq;
  }
  
  public Integer getBbsNo() {
    return bbsNo;
  }
  
  public void setBbsNo(Integer bbsNo) {
    this.bbsNo = bbsNo;
  }
  
  public Integer getArticleNo() {
    return articleNo;
  }
  
  public void setArticleNo(Integer articleNo) {
    this.articleNo = articleNo;
  }
  
  public String getArticleTitle() {
    return articleTitle;
  }
  
  public void setArticleTitle(String articleTitle) {
    this.articleTitle = articleTitle;
  }
  
  public String getArticleContent() {
    return articleContent;
  }
  
  public void setArticleContent(String articleContent) {
    this.articleContent = articleContent;
  }
  
  public String getWriter() {
    return writer;
  }
  
  public void setWriter(String writer) {
    this.writer = writer;
  }
  
  public String getUserId() {
    return userId;
  }
  
  public void setUserId(String userId) {
    this.userId = userId;
  }
  
  public Date getRegisterDatetime() {
    return registerDatetime;
  }
  
  public void setRegisterDatetime(Date registerDatetime) {
    this.registerDatetime = registerDatetime;
  }
  
  public Date getModifyDatetime() {
    return modifyDatetime;
  }
  
  public void setModifyDatetime(Date modifyDatetime) {
    this.modifyDatetime = modifyDatetime;
  }
  
}
