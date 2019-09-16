
package kr.or.ddit.prod.repository;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.or.ddit.prod.model.Prod;

@Repository
public class ProdDaoImpl implements IProdDao {
	
	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate sqlSession;
	

	@Override
	public List<Prod> selectLProdList(String LprodLgu) {
		
		return sqlSession.selectList("prod.selectLProdList", LprodLgu);
		
	}
	
	


}
