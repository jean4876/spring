package kr.or.ddit.user.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.user.model.User;


//clas명에서 맨 첫글자를 소문자로 변경한 문자열이 스프링 빈 이름으로 기본 설정
//다른 이름의 스프링 빈이름으로 등록을 하려면 속성을 설정 ex)@Repository("userDaooo")
@Repository
public class UserDao implements IUserDao {
	
	@Resource(name="sqlSessionTemplate")
	private SqlSessionTemplate sqlSession;

	   /**
	    * Method : getUserList
	    * 작성자 : PC-11
	    * 변경이력 :
	    * @return
	    * Method 설명 :
	    */
	   @Override
	   public List<User> getUserList() {

	      // db에서 조회가 되었다고 가정하고 가짜 객체를 리턴
//	      List<UserVO> userList = new ArrayList<UserVO>();
//	      userList.add(new UserVO("brown"));
//	      userList.add(new UserVO("cony"));
//	      userList.add(new UserVO("sally"));

	      return sqlSession.selectList("user.getUserList");
	   }

	   /**
	    *
	    * Method : getUser
	    * 작성자 : PC-11
	    * 변경이력 :
	    * @param userId
	    * @return
	    * Method 설명 : userId를 갖는  사용자 정보 조회
	    */
	   @Override
	   public User getUser(String userId) {

	      return sqlSession.selectOne("user.getUser", userId);
	   }

	   /**
	    *
	    * Method : getUserListOnlyHalf
	    * 작성자 : PC-11
	    * 변경이력 :
	    * @return
	    * Method 설명 : 사용자 정보 조회(50명만)
	    */
	   @Override
	   public List<User> getUserListOnlyHalf() {

	      return sqlSession.selectList("user.getUserListOnlyHalf");
	   }

	   /**
	   *
	   * Method : getUserPagingList
	   * 작성자 : PC-23
	   * 변경이력 :
	   * @param sqlSession
	   * @param page
	   * @return
	   * Method 설명 : 사용자 페이징 리스트 조회
	   */
		@Override
		public List<User> getUserPagingList(Page page) {
			return sqlSession.selectList("user.getUserPagingList", page);
		}

		@Override
		public int getUserTotalCnt() {
			return sqlSession.selectOne("user.getUserTotalCnt");
		}


		   /**
		    *
		    * Method : insertUser
		    * 작성자 : PC-23
		    * 변경이력 :
		    * @param sqlSession
		    * @param user
		    * @return
		    * Method 설명 : 사용자 등록
		    */
		@Override
		public int insertUser(User user) {
			return sqlSession.insert("user.insertUser", user);
		}


	   /**
	    *
	    * Method : deleteUser
	    * 작성자 : PC-23
	    * 변경이력 :
	    * @param sqlSession
	    * @param userId
	    * @return
	    * Method 설명 : 사용자 삭제
	    */
		@Override
		public int deleteUser(String userId) {

			return sqlSession.delete("user.deleteUser", userId);
		}
	   /**
	    *
	    * Method : updateUser
	    * 작성자 : PC-23
	    * 변경이력 :
	    * @param sqlSession
	    * @param userId
	    * @return
	    * Method 설명 : 사용자 정보 수정
	    */
		@Override
		public int updateUser(User user) {
			return sqlSession.update("user.updateUser", user);
		}





}
