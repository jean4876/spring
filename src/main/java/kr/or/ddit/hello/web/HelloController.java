package kr.or.ddit.hello.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("hello/hello.do")
	public String hello(Model Model) {
		
		
		//기존에 request에 넣었던 속성을  스프링에서는
		//Model 객체에 넣는다
		//request - > Model
		//Session - > Session
		//Application - > Application
		return "hello/hello";
	}

}
