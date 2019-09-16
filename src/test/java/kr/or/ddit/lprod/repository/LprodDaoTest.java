package kr.or.ddit.lprod.repository;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.config.test.RootTestConfig;
import kr.or.ddit.lprod.dao.ILprodDao;
import kr.or.ddit.lprod.model.Lprod;
public class LprodDaoTest extends RootTestConfig {
	
	private static final Logger logger = LoggerFactory.getLogger(LprodDaoTest.class);
	
	//userDao를 테스트 하기 위해 필요한거
	//db 연결, 트랜잭션, dao

	@Resource(name = "lprodDao")
	private ILprodDao lprodDao;

	@Test
	public void selectAllLprodList() {

		/***Given***/


		/***When***/
		List<Lprod> list = lprodDao.selectAllLprodList();

		/***Then***/
		assertEquals(9, list.size());
	}
	
	@Test
	public void getLprodPagingList() {

		/***Given***/
	      Page page = new Page();
	      page.setPage(1);
	      page.setPagesize(10);


		/***When***/
		List<Lprod> list = lprodDao.getLprodPagingList(page);

		/***Then***/
		assertEquals(9, list.size());
	}
	
	@Test
	public void getLprodTotalCnt() {

		/***Given***/


		/***When***/
		int totalCnt = lprodDao.getLprodTotalCnt();

		/***Then***/
		assertEquals(9, totalCnt);
	}

}
