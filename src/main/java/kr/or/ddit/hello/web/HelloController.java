package kr.or.ddit.hello.web;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

	@RequestMapping("hello/hello.do")
	public String hello(Model Model, HttpServletRequest request) {
		
		logger.debug("hello()");

		// 기존에 request에 넣었던 속성을 스프링에서는
		// Model 객체에 넣는다
		// request - > Model
		// Session - > Session
		// Application - > Application

		Model.addAttribute("nowDt", new Date());
		Model.addAttribute("msg", "hello, World");
		Model.addAttribute("userId", request.getParameter("userId") + "_helloController");

		return "hello/hello"; // /WEB-INF/views/hello/hello.jsp

	}
}
