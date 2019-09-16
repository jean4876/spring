package kr.or.ddit.prod.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.config.test.RootTestConfig;
import kr.or.ddit.prod.model.Prod;

public class ProdServiceTest extends RootTestConfig {
	
	private static final Logger logger = LoggerFactory.getLogger(ProdServiceTest.class);
	
	@Resource(name="prodService")
	private IProdService IProdService;

	   @Test
	   public void selectLProdList() {

	      /***Given***/
	      String LprodLgu = "P101";

	      /***When***/
	      List<Prod> prodList = IProdService.selectLProdList(LprodLgu);

	      /***Then***/
	      assertEquals(6, prodList.size());
	   }

}
