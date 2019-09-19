package kr.or.ddit.user.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.config.test.RootTestConfig;
import kr.or.ddit.user.model.User;



public class UserServiceTest extends RootTestConfig {
	
	private static final Logger logger = LoggerFactory.getLogger(UserServiceTest.class);

	
	@Resource(name="userService")
	private IUserService userService;
	 
	private String userId = "brownTest";
	
	



	   // 테스트에 공통적으로 사용한 자원을 해제
	   @After
	   public void tearDown() {
	      logger.debug("after");
	   }

	   /**
	    *
	    * Method : getUserListTest
	    * 작성자 : PC-11
	    * 변경이력 :
	    * Method 설명 : getUserList 테스트
	    */
	   @Test
	   public void getUserListTest() {
		   /***Given***/
		   
		   
		   /***When***/
		   
		   List<User> userList =  userService.getUserList();
		   
		   /***Then***/
		   assertTrue(userList.size() > 100);
	   }


	   /**
	    *
	    * Method : getUserTest
	    * 작성자 : PC-11
	    * 변경이력 :
	    * Method 설명 : 사용자 정보 조회 테스트
	    */
	   @Test
	   public void getUserTest() {

	      /***Given***/
	      String userId = "brown";

	      /***When***/
	      User userVo= userService.getUser(userId);

	      /***Then***/
	      assertEquals("브라운", userVo.getuserNm());
	      assertEquals("brown1234", userVo.getPass());

	   }

	   /**
	    *
	    * Method : getUserListOnlyHalf
	    * 작성자 : PC-11
	    * 변경이력 :
	    * Method 설명 : 사용자 정보 조회 테스트
	    */
	   @Test
	   public void getUserListOnlyHalf() {

	      /***Given***/

	      /***When***/
	      List<User> userList = userService.getUserListOnlyHalf();

	      /***Then***/
	      assertEquals(50, userList.size());

	   }

	   /**
	    *
	    * Method : getUserPagingList
	    * 작성자 : PC-11
	    * 변경이력 :
	    * Method 설명 : 사용자 페이징 리스트 조회
	    */
	   @Test
	   public void getUserPagingList() {
	      /***Given***/
	      Page page = new Page();
	      page.setPage(3);
	      page.setPagesize(10);

	      /***When***/

	      Map<String, Object> resultMap = userService.getUserPagingList(page);
	      List<User> userList =  (List<User>) resultMap.get("userList");
	      int paginationSize = (Integer)resultMap.get("paginationSize");

	      /***Then***/
	      assertEquals(10, userList.size());
	      assertEquals("xuserid22", userList.get(0).getUserId());
	   }

	   /**
	    *
	    * Method : getUserTotalCnt
	    * 작성자 : PC-11
	    * 변경이력 :
	    * Method 설명 : 전체 사용자 건수 조회
	    */
	   @Test
	   public void getUserTotalCnt() {
	      /***Given***/

	      /***When***/
	      int totalCnt = userService.getUserTotalCnt();

	      /***Then***/
	      assertEquals(104, totalCnt);
	   }

	   /**
	    *
	    * Method : insertUserTest
	    * 작성자 : PC-11
	    * 변경이력 :
	    * Method 설명 : 사용자 등록 태스트
	    * @throws ParseException
	    */
	   @Test
	   public void insertUserTest() throws ParseException {
	      /***Given***/
	      User user = new User();

	      user.setUserId(userId);
	      user.setuserNm("브라운테스트");
	      user.setPass("brownTest1234");
	      user.setReg_dt(new SimpleDateFormat("yyyy-MM-dd").parse("2019-08-08"));
	      user.setAlias("곰테스트");
	      user.setAddr1("대전광역시 중구 중앙로 76");
	      user.setAddr2("영민빌딩 2층 DDIT");
	      user.setZipcode("34940");
	      user.setFilename("sally.png");
	      user.setRealfilename("e:/upload/2019/08/8cdaf3b1-e7a3-40f8-bc54-69b57d19d6b1.png");

	      /***When***/
	      int inserCnt = userService.insertUser(user);

	      /***Then***/
	      assertEquals(1, inserCnt);
	   }

	   @Test
	   public void updateUserTest() throws ParseException {
	      /***Given***/
	      User user = new User();
	      user.setUserId("xuserid100");
	      user.setuserNm("브라운테스트");
	      user.setPass("brownTest1234");
	      user.setReg_dt(new SimpleDateFormat("yyyy-MM-dd").parse("2019-08-08"));
	      user.setAlias("곰테스트");
	      user.setAddr1("대전광역시 중구 중앙로 76");
	      user.setAddr2("영민빌딩 2층 DDIT");
	      user.setZipcode("34940");
	      user.setFilename("brown.png");
	      user.setRealfilename("e:\\upload\\2019\\08\\8d19d9ea-c67f-416b-9b40-8dac10011aaa.png");

	      /***When***/
	      int updateCnt = userService.updateUser(user);

	      /***Then***/
	      assertEquals(1, updateCnt);
	   }

}
