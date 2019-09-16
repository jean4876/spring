package kr.or.ddit.lprod.service;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.config.test.RootTestConfig;
import kr.or.ddit.lprod.model.Lprod;

public class LprodServiceTest extends RootTestConfig {
	
	private static final Logger logger = LoggerFactory.getLogger(LprodServiceTest.class);

	@Resource(name="lprodService")
	private ILprodService lprodService;

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void selectAllLprodList() {

		/***Given***/


		/***When***/
		List<Lprod> list = lprodService.selectAllLprodList();

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
		Map<String, Object> list = lprodService.getLprodPagingList(page);

		/***Then***/
		assertEquals(2, list.size());
	}


}
