package kr.or.ddit.user.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.user.dao.IUserDao;
import kr.or.ddit.user.model.User;

@Service
public class UserService implements IUserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

	
	@Resource(name="userDao")
	private IUserDao userDao;
	
	
	public UserService() {
	}
	
	public UserService(IUserDao userDao) {
		this.userDao = userDao;
	}

	/**
	 * 
	 * Method : getUserList
	 * 작성자 : PC-23
	 * 변경이력 :
	 * @return
	 * Method 설명 : 사용자 전체 리스트 조회
	 */
	@Override
	public List<User> getUserList() {
		logger.debug("getUserList()");
		
		return userDao.getUserList();
	}


	   @Override
	   public User getUser(String userId) {

	      User user = userDao.getUser( userId);

	      return user;
	   }

	   @Override
	   public List<User> getUserListOnlyHalf() {

	      List<User> userList = userDao.getUserListOnlyHalf();
	      return userList;
	   }

		@Override
		public Map<String, Object> getUserPagingList(Page page) {
			  Map<String, Object> map  = new HashMap<String, Object>();

		      List<User> userList = userDao.getUserPagingList(page);
		      int totalCnt =  userDao.getUserTotalCnt();

		      map.put("userList", userList);
		      map.put("paginationSize", (int)Math.ceil((double)totalCnt / page.getPagesize()));


		      return map;
		}

		@Override
		public int getUserTotalCnt() {
			int res = userDao.getUserTotalCnt();
			return res;
		}

		@Override
		public int insertUser(User user) {
			//선언적 트랜젝션
			// .예외가 발생 했을때 정상적으로  rollback이 되는지
			// .예외가 발생하지 않고 정상적으로 코드가 실행되었을 때
			// .명시적인 commit이 없는데 commit이 정상적으로 되었는지

			return 	userDao.insertUser(user);
		}

		@Override
		public int deleteUser(String userId) {
			int res = userDao.deleteUser(userId);
			return res;
		}

		@Override
		public int updateUser(User user) {
			int res = userDao.updateUser(user);
			return res;
		}

}
