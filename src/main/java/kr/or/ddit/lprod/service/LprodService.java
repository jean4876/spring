package kr.or.ddit.lprod.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.lprod.dao.ILprodDao;
import kr.or.ddit.lprod.model.Lprod;


@Service
public class LprodService implements ILprodService{
	
	private static final Logger logger = LoggerFactory.getLogger(LprodService.class);

	@Resource(name="lprodDao")
	private ILprodDao lprodDao;
	
	public LprodService() {
	}
	
	public LprodService(ILprodDao lprodDao) {
		this.lprodDao = lprodDao;
	}
	
	
	@Override
	public List<Lprod> selectAllLprodList() {
	      List<Lprod> lprodList = lprodDao.selectAllLprodList();
	      return lprodList;
	}

	@Override
	public Map<String, Object> getLprodPagingList(Page page) {

		Map<String, Object> map  = new HashMap<String, Object>();

	      List<Lprod> lprodList = lprodDao.getLprodPagingList(page);
	      int totalCnt = lprodDao.getLprodTotalCnt();


	      map.put("lprodList", lprodList);
	      map.put("paginationSize", (int)Math.ceil((double)totalCnt / page.getPagesize()));

	      return map;
	}

}
