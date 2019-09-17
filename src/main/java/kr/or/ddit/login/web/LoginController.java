package kr.or.ddit.login.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.or.ddit.user.model.User;
import kr.or.ddit.user.service.IUserService;

@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Resource(name = "userService")
	private IUserService userService;
	
	/**
	 * 
	 * Method : view
	 * 작성자 : PC-23
	 * 변경이력 :
	 * @return
	 * Method 설명 : 로그인 화면 요청 처리(forward)
	 */
	@RequestMapping(path = "login" , method = RequestMethod.GET)
	public String view() {
		//cookie 처리는 생략
		return "login/login";
	}
	
	
	/**
	 * 
	 * Method : loginProcess
	 * 작성자 : PC-23
	 * 변경이력 :
	 * @param userId
	 * @param pass
	 * @param rememberMe
	 * @param response
	 * @param session
	 * @return
	 * Method 설명 : 로그인 화면 요청 처리
	 */
	//로그인 요청처리
	@RequestMapping(path = "login" , method = RequestMethod.POST)
	public String loginProcess(String userId, String pass, String rememberMe,
								HttpServletResponse response, HttpSession session) {

		   manageUserIdCookie(response, userId, rememberMe);


		   //db에서 조회해온 사용자 정보
		   User user = userService.getUser(userId);
		   
		   if(user == null) {
			   return "login/login"; //view();
		   }else if(user.checkLoginValidate(userId, pass)) {
			   session.setAttribute("S_USERVO", user);
			   
			   //스프링에서는 기본적으로 포워드 해줌
			   return "main";
		   }else {
			   return "login/login"; //view();
		   }
			   


	   }
	/**
	 * 
	 * Method : userList
	 * 작성자 : PC-23
	 * 변경이력 :
	 * @param model
	 * @return
	 * Method 설명 : 사용자 전체 리스트 조회
	 */
	@RequestMapping(path = "userList", method = RequestMethod.GET)
	public String userList(Model model) {
		//사용자 정보 전체 조회
		List<User> userList = userService.getUserList();
		model.addAttribute("userList",userService.getUserList());
		return "user/userList";
	}
	
	
	
	
	private void manageUserIdCookie(HttpServletResponse response, String userId, String rememberMe) {
		Cookie cookie = new Cookie("userId", userId);

		   if(rememberMe != null) {
			   cookie.setMaxAge(60*60*24*30); // 30일
		   }else {
			   cookie.setMaxAge(0); // 삭제 -> :) 기간이 만료
		   }

		   response.addCookie(cookie);
	}


}
