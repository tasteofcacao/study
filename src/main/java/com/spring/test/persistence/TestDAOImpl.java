package com.spring.test.persistence;

//import com.doubles.mvcboard.article.domain.ArticleVO;
//import com.doubles.mvcboard.commons.paging.Criteria;
//import com.doubles.mvcboard.commons.paging.SearchCriteria;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.test.domain.TestVO;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TestDAOImpl implements TestDAO {

    private static final String NAMESPACE = "com.spring.test.mappers.test.TestMapper";

    private final SqlSession sqlSession;

    @Inject
    public TestDAOImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

//    @Override
//    public void create(ArticleVO articleVO) throws Exception {
//        sqlSession.insert(NAMESPACE + ".create", articleVO);
//    }
//
//    @Override
//    public ArticleVO read(Integer articleNo) throws Exception {
//        return sqlSession.selectOne(NAMESPACE + ".read", articleNo);
//    }
//
//    @Override
//    public void update(ArticleVO articleVO) throws Exception {
//        sqlSession.update(NAMESPACE + ".update", articleVO);
//    }
//
//    @Override
//    public void delete(Integer articleNo) throws Exception {
//        sqlSession.delete(NAMESPACE + ".delete", articleNo);
//    }
//
    @Override
    public List<TestVO> listAll() throws Exception {
        return sqlSession.selectList(NAMESPACE + ".listAll");
    }
//
//    @Override
//    public List<ArticleVO> listPaging(int page) throws Exception {
//
//        if (page <= 0) {
//            page = 1;
//        }
//
//        page = (page - 1) * 10;
//
//        return sqlSession.selectList(NAMESPACE + ".listPaging", page);
//    }
//
//    @Override
//    public List<ArticleVO> listCriteria(Criteria criteria) throws Exception {
//        return sqlSession.selectList(NAMESPACE + ".listCriteria", criteria);
//    }
//
//    @Override
//    public int countArticles(Criteria criteria) throws Exception {
//        return sqlSession.selectOne(NAMESPACE + ".countArticles", criteria);
//    }
//
//    @Override
//    public List<ArticleVO> listSearch(SearchCriteria searchCriteria) throws Exception {
//        return sqlSession.selectList(NAMESPACE + ".listSearch", searchCriteria);
//    }
//
//    @Override
//    public int countSearchedArticles(SearchCriteria searchCriteria) throws Exception {
//        return sqlSession.selectOne(NAMESPACE + ".countSearchedArticles", searchCriteria);
//    }
//
//    @Override
//    public void updateReplyCnt(Integer articleNo, int amount) throws Exception {
//
//        Map<String, Object> paramMap = new HashMap<>();
//        paramMap.put("articleNo", articleNo);
//        paramMap.put("amount", amount);
//
//        sqlSession.update(NAMESPACE + ".updateReplyCnt", paramMap);
//    }
//
//    @Override
//    public void updateViewCnt(Integer articleNo) throws Exception {
//        sqlSession.update(NAMESPACE + ".updateViewCnt", articleNo);
//    }
}
