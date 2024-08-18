package org.Trip.mapper;

import java.util.List;

import org.Trip.domain.TravelVO;
import org.Trip.domain.Criteria;


public interface TravelMapper {
	
	 public List<TravelVO> getList(String localId);
	
	 public List<TravelVO> getListPageWith(Criteria cri);
	 
	 public List<TravelVO> bestTrip();
	
	
	 public int insertTrip(TravelVO trip);
	 
	 public int deleteTrip(Long tno);
	 
	 public int updateTrip(TravelVO trip);
	 
	 //상세 페이지
	 public TravelVO readTrip(Long tno);
	 
	 //조회수
	 public int updateCount(int count);
	 
	 
	 
	
	

}
