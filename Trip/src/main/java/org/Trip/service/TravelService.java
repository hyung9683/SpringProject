package org.Trip.service;

import java.util.List;

import java.sql.SQLException;

import org.Trip.domain.TravelVO;
import org.Trip.domain.ImageFileVO;
import org.Trip.domain.Criteria;

public interface TravelService {
	
	//지역별로 출력
//	public List<TravelVO> localTrip(String category);
//	
	public List<TravelVO> bestTrip();
	
//	public List<TravelVO> findAll();
	
	public void registerTrip(TravelVO tv, ImageFileVO img);
	
//	public int getPKNumber();
	
	public void insertGo(TravelVO tv);
	
//	public int getCount(int count);
	
	
	//%ROWTYPE 예제
	
//	public void structTest(TravelVO tv, ImageFileVO img) throws SQLException;
	

}
