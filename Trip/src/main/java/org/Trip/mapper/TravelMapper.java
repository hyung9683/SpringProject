package org.Trip.mapper;

import java.util.List;
import java.util.Map;

import org.Trip.domain.TravelVO;
import org.Trip.domain.ImageFileVO;
import org.Trip.domain.Criteria;


public interface TravelMapper {
	
	 public List<TravelVO> getList(String localId);
	
	 public List<TravelVO> getListPageWith(Criteria cri);
	 
	 public List<TravelVO> bestTrip();
	 
	 //위 쿼리문과 같이 트랜잭션 처리
//	 public List<ImageFileVO> bestImage();
	
	
	 // PROCEDURE로 실행
//	 public void insertTrip(TravelVO trip);
	 
	 public void insertTrip(Map<String, Object> map);
	 
	 public int deleteTrip(Long tno);
	 
	 public int updateTrip(TravelVO trip);
	 
	 //상세 페이지
	 public TravelVO readTrip(Long tno);
	 
	 //조회수
	 public int updateCount(int count);
	 
	 
	 
	
	

}
