package kr.or.ddit.lprod.web;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.lprod.service.ILprodService;

@RequestMapping("lprod")
@Controller
public class LprodController {
	
	private static final Logger logger = LoggerFactory.getLogger(LprodController.class);

	@Resource(name = "lprodService")
	private ILprodService lprodService;
	
	@RequestMapping(path = "lprodList", method = RequestMethod.GET)
	public String lprodList(Model model) {
		
		model.addAttribute("lprodList",lprodService.selectAllLprodList());
		
		return "lprod/lprodList";
		
		
	}
	
	@RequestMapping(path = "lprodPagingList", method = RequestMethod.GET)
	//public String userPagingList(int page, int pagesize, Model model) {
	public String lprodPagingList(Model model,Page page) {
		//사용자 정보 페이징 전체 조회
		
		
		model.addAttribute("pageVo",page);

		Map<String, Object> resultMap = lprodService.getLprodPagingList(page);
		model.addAllAttributes(resultMap);
		
		return "lprod/lprodPagingList";
		
	}
	
	
	

}
