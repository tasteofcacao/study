package com.spring.dev_nsj.article.service;


import java.util.List;

import com.spring.dev_nsj.article.domain.ArticleVO;

public interface ArticleService {

//    void create(ArticleVO articleVO) throws Exception;
//
//    ArticleVO read(Integer articleNo) throws Exception;
//
//    void update(ArticleVO articleVO) throws Exception;
//
//    void delete(Integer articleNo) throws Exception;

    List<ArticleVO> listAll() throws Exception;

//    List<ArticleVO> listCriteria(Criteria criteria) throws Exception;
//
//    int countArticles(Criteria criteria) throws Exception;
//
//    List<ArticleVO> listSearch(SearchCriteria searchCriteria) throws Exception;
//
//    int countSearchedArticles(SearchCriteria searchCriteria) throws Exception;

}
