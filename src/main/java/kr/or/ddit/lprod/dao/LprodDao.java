package kr.or.ddit.lprod.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.lprod.model.Lprod;

@Repository
public class LprodDao implements ILprodDao {
	
	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate sqlSession;
	

	@Override
	public List<Lprod> selectAllLprodList() {

		return sqlSession.selectList("lprod.selectAllLprodList");
	}

	@Override
	public List<Lprod> getLprodPagingList(Page page){
		return sqlSession.selectList("lprod.getLprodPagingList",page);
	}

	@Override
	public int getLprodTotalCnt(){
		return sqlSession.selectOne("lprod.getLprodTotalCnt");
	}





}
