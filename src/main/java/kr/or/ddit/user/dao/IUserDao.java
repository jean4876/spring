package kr.or.ddit.user.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.or.ddit.user.model.User;

public interface IUserDao {
	
	/**
	 * 
	 * Method : getUserList
	 * 작성자 : PC-23
	 * 변경이력 :
	 * @return
	 * Method 설명 : 사용자 전체 리스트 조회
	 */
	List<User> getUserList();

}
