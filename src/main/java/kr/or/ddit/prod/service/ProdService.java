package kr.or.ddit.prod.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import kr.or.ddit.prod.model.Prod;
import kr.or.ddit.prod.repository.IProdDao;

@Service
public class ProdService implements IProdService {
	
	private static final Logger logger = LoggerFactory.getLogger(ProdService.class);

	
	@Resource(name="prodDaoImpl")
	private IProdDao prodDao;
	
	public ProdService() {
	}
	
	public ProdService(IProdDao prodDao) {
		this.prodDao = prodDao;
	}

	@Override
	public List<Prod> selectLProdList(String LprodLgu) {
		List<Prod> lprodList = prodDao.selectLProdList(LprodLgu);
		return lprodList;
		
	
	}

}
