package kr.or.ddit.user.repository;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.After;
import org.junit.Before;
//import org.junit.After;
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
import kr.or.ddit.user.dao.IUserDao;
import kr.or.ddit.user.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = 
{"classpath:kr/or/ddit/config/spring/context-root.xml",
 "classpath:kr/or/ddit/config/spring/context-datasource-test.xml",
 "classpath:kr/or/ddit/config/spring/context-transaction.xml"})
public class UserDaoTest extends RootTestConfig {
	
	private static final Logger logger = LoggerFactory.getLogger(UserDaoTest.class);

	
	//userDao를 테스트 하기 위해 필요한거
	//db 연결, 트랜잭션, dao

	@Resource(name = "userDao")
	private IUserDao userDao;
	
	private String userId = "brownTest";
	
	 @Resource(name = "datasource")
	 private BasicDataSource datasource;
	
	

	   // junit 테스트 메소드 실행 순서
	   // @Before -> @Test -> @After
	   // @Test 테스트 메소드가 실행되기 전에  @Before이 작용된 메소드를 먼저 실행하고, @Test 메소드 실행후
	   // @After이 적용된 메소드를 실행한다.
	   // @Test 메소드는 실행순서가 보장되지 않음

	   // 테스트에 공통적으로 필요한 자원을 생성 / 초기화
	   @Before
	   public void setup() {
	      //지금까지 테스트를 위해 삭제(delete)를 진행했었음
	      //번거로운 작업을 하지 않기 위해 개발자DB 가 필요
	      //이것에 따른 라이브러리가 존재
	      
	      //init.sql에 있는 모든 sql 문장을 테스트 메소드 실행전에 실행
	      //init.sql에는 table 데이터삭제, 데이터입력 sql 문장이있음
	      ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
	      populator.addScript(new ClassPathResource("/kr/or/ddit/db/init.sql"));
	      populator.setContinueOnError(false); // ->init.sql을 실행하다 에러가 발생할 경우 중지
	      // 좀 위험함. 운영DB에서 사용한다면 많이 위험함 ㅋㅋ;
	      DatabasePopulatorUtils.execute(populator, datasource);
	      
	      
	   }

	   // 테스트에 공통적으로 사용한 자원을 해제
	   @After
	   public void tearDown() {
	      logger.debug("after");
	   }

	   @Test
	   public void getUserListTest() {
		   /***Given***/
		   
		   
		   /***When***/
		   List<User> userList = userDao.getUserList();
		   
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
	      User userVo= userDao.getUser(userId);

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
	      List<User> userList = userDao.getUserListOnlyHalf();

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
	      List<User> userList = userDao.getUserPagingList(page);

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
	      int totalCnt = userDao.getUserTotalCnt();

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
	      int inserCnt = userDao.insertUser(user);

	      /***Then***/
	      assertEquals(1, inserCnt);
	   }

	   @Test
	   public void updateUserTest() throws ParseException {
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
	      user.setFilename("brown.png");
	      user.setRealfilename("e:\\upload\\2019\\08\\8d19d9ea-c67f-416b-9b40-8dac10011aaa.png");

	      /***When***/
	      int updateCnt = userDao.updateUser(user);

	      /***Then***/
	      assertEquals(0, updateCnt);
	   }

}
