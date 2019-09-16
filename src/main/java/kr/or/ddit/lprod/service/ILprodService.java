package kr.or.ddit.lprod.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.common.model.Page;
import kr.or.ddit.lprod.model.Lprod;

public interface ILprodService {

	List<Lprod> selectAllLprodList();

	Map<String, Object> getLprodPagingList(Page page);

}
