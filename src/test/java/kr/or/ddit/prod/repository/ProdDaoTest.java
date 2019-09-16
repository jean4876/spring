package kr.or.ddit.prod.repository;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import kr.or.ddit.config.test.RootTestConfig;
import kr.or.ddit.prod.model.Prod;

public class ProdDaoTest extends RootTestConfig{
   
   @Resource(name = "prodDaoImpl")
   private IProdDao prodDao;

   /**
    *
    * Method : getProdListTest
    * 작성자 : PC-11
    * 변경이력 :
    * Method 설명 : getProdList 테스트
    */
   @Test
   public void selectLProdList() {

      /***Given***/
      String LprodLgu = "P101";

      /***When***/
      List<Prod> prodList = prodDao.selectLProdList(LprodLgu);

      /***Then***/
      assertEquals(6, prodList.size());
   }

}