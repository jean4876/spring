package kr.or.ddit.config.test;

import javax.annotation.Resource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.ddit.config.DatasourceConfig;
import kr.or.ddit.config.RootConfig;
import kr.or.ddit.config.spring.DatasourceConfigTest;

@RunWith(SpringJUnit4ClassRunner.class)

//@ContextConfiguration(locations = 
//{"classpath:kr/or/ddit/config/spring/context-root.xml",
// "classpath:kr/or/ddit/config/spring/context-datasource-test.xml",
// "classpath:kr/or/ddit/config/spring/context-transaction.xml"})

@ContextConfiguration(classes = {RootConfig.class, DatasourceConfigTest.class})
public class RootTestConfig {
	
	private static final Logger logger = LoggerFactory.getLogger(RootTestConfig.class);

	
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
	      logger.debug("before");
	      //userService.deleteUser(userId); // -> 더이상 필요가 없음 ㅋㅋ
	      
	      ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
	      populator.addScript(new ClassPathResource("/kr/or/ddit/db/init.sql"));
	      populator.setContinueOnError(false); // ->init.sql을 실행하다 에러가 발생할 경우 중지
	      // 좀 위험함. 운영DB에서 사용한다면 많이 위험함 ㅋㅋ;
	      DatabasePopulatorUtils.execute(populator, datasource);
	   }
	   
	   @Ignore	//테스트코드를 실행하지 말고 건너띄어라
	   @Test
	   public void dummy() { }

}
