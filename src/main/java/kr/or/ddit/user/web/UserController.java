package kr.or.ddit.user.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.ResultMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.user.model.User;
import kr.or.ddit.user.model.UserValidator;
import kr.or.ddit.user.service.IUserService;
import kr.or.ddit.util.FileUtil;
import kr.or.ddit.util.model.FileInfo;

@RequestMapping("user///")
@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Resource(name = "userService")
	private IUserService userService;
	// private UserService userService

	/**
	 * 
	 * Method : userView 작성자 : PC-23 변경이력 :
	 * 
	 * @return Method 설명 : 사용자 상세화면 요청
	 */

	// 사용자가 localhost:8081/spring/user/view
	@RequestMapping("view.do")
	public String userView() {
		logger.debug("userController.userView()");
		return "user/view";
	}
	// prefix + viewName + suffix
	// WEB-INF/views/user/view.jsp

	/**
	 * 
	 * Method : userList 작성자 : PC-23 변경이력 :
	 * 
	 * @param model
	 * @return Method 설명 : 사용자 전체 리스트 조회
	 */
	@RequestMapping(path = "userList", method = RequestMethod.GET)
	public String userList(Model model) {
		// 사용자 정보 전체 조회
		List<User> userList = userService.getUserList();
		model.addAttribute("userList", userService.getUserList());
		return "user/userList";
	}

	@RequestMapping(path = "userListOnlyHalf", method = RequestMethod.GET)
	public String UserListOnlyHalf(Model model) {
		// 사용자 정보 반 조회
		List<User> UserListOnlyHalf = userService.getUserListOnlyHalf();
		model.addAttribute("userListOnlyHalf", userService.getUserListOnlyHalf());
		return "user/userListOnlyHalf";
	}

	@RequestMapping(path = "userPagingList", method = RequestMethod.GET)
	// public String userPagingList(int page, int pagesize, Model model) {
	public String userPagingList(Page page, Model model) {
		// 사용자 정보 페이징 전체 조회
		model.addAttribute("pageVo", page);

		Map<String, Object> resultMap = userService.getUserPagingList(page);
		model.addAllAttributes(resultMap);

		return "user/userPagingList";
	}

	@RequestMapping(path = "user", method = RequestMethod.GET)
	public String user(Model model, String userId) {
		// 사용자 정보 페이징 전체 조회
		logger.debug("user()");

		User user = userService.getUser(userId);
		model.addAttribute(user);

		return "user/user";
	}

	@RequestMapping("userPicture")
	public void userPiture(String userId, HttpServletResponse response) throws IOException {

		User user = userService.getUser(userId);

		ServletOutputStream sos = response.getOutputStream();

		File picture = new File(user.getRealfilename());
		FileInputStream fis = new FileInputStream(picture);

		byte[] buff = new byte[512];
		int len = 0;
		while ((len = fis.read(buff, 0, 512)) != -1) {
			sos.write(buff, 0, len);
		}
		fis.close();

	}

	@RequestMapping(path = "userForm", method = RequestMethod.GET)
	public String userFormView() {
		return "user/userForm";
	}

	@RequestMapping(path = "userForm", method = RequestMethod.POST)
	public String userForm(User user, BindingResult result, @RequestPart("picture") MultipartFile picture) {
		
		new UserValidator().validate(user, result);
		if(result.hasErrors()){
			logger.debug("hasError()");
			return "user/userForm";

		}else {

			FileInfo fileInfo = FileUtil.getFileInfo(picture.getOriginalFilename());
			if (picture.getSize() > 0) {
				
				try {
					picture.transferTo(fileInfo.getFile());
					user.setFilename(fileInfo.getOriginalFileName());	//originFileName
					user.setRealfilename(fileInfo.getFile().getPath());	//
					
				} catch (IllegalStateException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			logger.debug("user : {}", user);
			
			int insertCnt = userService.insertUser(user);
			logger.debug("insertCnt : {} " , insertCnt);
			
			
			if(insertCnt == 1) {
				return "redirect:/user/user?userId=" + user.getUserId();
				//redirect
			}else {
				return "user/userForm";
				//forward
			}
			
			
		}
	}
	
	@RequestMapping(path = "userModify", method = RequestMethod.GET)
	public String userModifyView(Model model, String userId) {
		// 사용자 정보 페이징 전체 조회
		logger.debug("userModify()");

		User user = userService.getUser(userId);
		logger.debug("user : {}", user);
		model.addAttribute(user);
		

		return "user/userModify";
	}
	
	@RequestMapping(path = "userModify", method = RequestMethod.POST)
	public String userModify(User user, BindingResult result, @RequestPart("picture") MultipartFile picture) {
		

			FileInfo fileInfo = FileUtil.getFileInfo(picture.getOriginalFilename());
			if (picture.getSize() > 0) {
				
				try {
					picture.transferTo(fileInfo.getFile());
					user.setFilename(fileInfo.getOriginalFileName());	//originFileName
					user.setRealfilename(fileInfo.getFile().getPath());	//
					
				} catch (IllegalStateException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				user.setFilename((userService.getUser(user.getUserId()).getFilename()));	//originFileName
				user.setRealfilename((userService.getUser(user.getUserId()).getRealfilename()));	
				
			}
			
			int updateCnt = userService.updateUser(user);
			
			if(updateCnt == 1) {
				return "redirect:/user/user?userId=" + user.getUserId();
				//redirect
			}else {
				return "user/userModify";
				//forward
			}
			
			
		
	}
	@RequestMapping(path = "userPagingListAjaxView")
	public String userPagingListAjaxView() {
		return "user/userPagingListAjaxView";
	}
	
	
	@RequestMapping(path = "userPagingListAjax", method = RequestMethod.GET)
	// public String userPagingList(int page, int pagesize, Model model) {
	public String userPagingListAjax(Page page, Model model) {
		// 사용자 정보 페이징 전체 조회
		model.addAttribute("pageVo", page);

		Map<String, Object> resultMap = userService.getUserPagingList(page);
		model.addAllAttributes(resultMap);

		return "jsonView";
	}
	
	@RequestMapping("userPagingListHtmlAjax")
	public String userPagingListHtmlAjax(@RequestParam(defaultValue = "1") int page,
										 @RequestParam(defaultValue = "10")int pagesize, Model model) {

		Page pageVo = new Page(page, pagesize);
		Map<String, Object> resultMap = userService.getUserPagingList(pageVo);
		model.addAllAttributes(resultMap);
		model.addAttribute("pageVo", pageVo);
		
		return "user/userPagingListHtmlAjax";
	}

}



























































