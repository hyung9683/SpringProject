package org.Trip.service;

import java.util.List;

import org.Trip.domain.TravelVO;
import org.Trip.domain.ImageFileVO;
import org.Trip.domain.Criteria;

public interface TravelService {
	
	//지역별로 출력
//	public List<TravelVO> localTrip(String category);
//	
//	public List<TravelVO> bestTrip(int count);
	
//	public List<TravelVO> findAll();
	
	public void registerTrip(TravelVO tv, ImageFileVO img);
	
//	public int getPKNumber();
	
	public void insertGo(TravelVO tv);
	
//	public int getCount(int count);
	

}
