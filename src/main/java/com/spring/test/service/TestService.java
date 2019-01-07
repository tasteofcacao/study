package com.spring.test.service;


import java.util.List;

import com.spring.test.domain.TestVO;

public interface TestService {

//    void create(ArticleVO articleVO) throws Exception;
//
//    ArticleVO read(Integer articleNo) throws Exception;
//
//    void update(ArticleVO articleVO) throws Exception;
//
//    void delete(Integer articleNo) throws Exception;

    List<TestVO> listAll() throws Exception;

//    List<ArticleVO> listCriteria(Criteria criteria) throws Exception;
//
//    int countArticles(Criteria criteria) throws Exception;
//
//    List<ArticleVO> listSearch(SearchCriteria searchCriteria) throws Exception;
//
//    int countSearchedArticles(SearchCriteria searchCriteria) throws Exception;

}
