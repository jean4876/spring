package kr.or.ddit.prod.web;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.ddit.prod.service.IProdService;

@RequestMapping("prod/")
@Controller
public class ProdController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProdController.class);
	
	@Resource(name = "prodService")
	private IProdService prodService;
	
	


}
