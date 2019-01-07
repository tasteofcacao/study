package com.spring.test.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.spring.test.domain.TestVO;
import com.spring.test.persistence.TestDAO;

import javax.inject.Inject;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    private final TestDAO testDAO;


    @Inject
    public TestServiceImpl(TestDAO articleDAO) {
        this.testDAO = articleDAO;
    }

//    @Transactional
//    @Override
//    public void create(ArticleVO articleVO) throws Exception {
//
//        testDAO.create(articleVO);
//        String[] files = articleVO.getFiles();
//
//        if (files == null)
//            return;
//        for (String fileName : files)
//            articleFileDAO.addFile(fileName);
//
//    }

//    @Transactional(isolation = Isolation.READ_COMMITTED)
//    @Override
//    public ArticleVO read(Integer articleNo) throws Exception {
//        testDAO.updateViewCnt(articleNo);
//        return testDAO.read(articleNo);
//    }

//    @Transactional
//    @Override
//    public void update(ArticleVO articleVO) throws Exception {
//        Integer articleNo = articleVO.getArticleNo();
//        String[] files = articleVO.getFiles();
//
//        testDAO.update(articleVO);
//        articleFileDAO.deleteFiles(articleNo);
//
//        if (files == null)
//            return;
//        for (String fileName : files)
//            articleFileDAO.replaceFile(fileName, articleNo);
//    }
//
//    @Transactional
//    @Override
//    public void delete(Integer articleNo) throws Exception {
//        articleFileDAO.deleteFiles(articleNo);
//        testDAO.delete(articleNo);
//    }

    @Override
    public List<TestVO> listAll() throws Exception {
        return testDAO.listAll();
    }

//    @Override
//    public List<ArticleVO> listCriteria(Criteria criteria) throws Exception {
//        return testDAO.listCriteria(criteria);
//    }
//
//    @Override
//    public int countArticles(Criteria criteria) throws Exception {
//        return testDAO.countArticles(criteria);
//    }
//
//    @Override
//    public List<ArticleVO> listSearch(SearchCriteria searchCriteria) throws Exception {
//        return testDAO.listSearch(searchCriteria);
//    }
//
//    @Override
//    public int countSearchedArticles(SearchCriteria searchCriteria) throws Exception {
//        return testDAO.countSearchedArticles(searchCriteria);
//    }
}
