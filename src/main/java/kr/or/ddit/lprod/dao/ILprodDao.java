package kr.or.ddit.lprod.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.lprod.model.Lprod;


public interface ILprodDao {

	List<Lprod> selectAllLprodList();

	List<Lprod> getLprodPagingList(Page page);

	int getLprodTotalCnt();


}
