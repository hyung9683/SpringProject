package org.Trip.mapper;

import java.util.List;

import org.Trip.domain.Criteria;
import org.Trip.domain.FestivalVO;
import org.Trip.domain.ImageFileVO;

public interface FestivalMapper {
	
	public List<FestivalVO> getList();
	
	 public List<FestivalVO> getListPageWith(Criteria cri);
	 
	 public List<ImageFileVO> bestImage();
	
	
	 public int insertFes(FestivalVO trip);
	 
	 public int deleteFes(Long tno);
	 
	 public int updateFes(FestivalVO trip);
	 
	 //상세 페이지
	 public FestivalVO readFes(Long tno);
	 
	 //조회수
	 public int updateCount(int count);

}
