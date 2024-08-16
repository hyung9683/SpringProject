package org.Trip.service;

import java.util.List;

import org.Trip.domain.TravelVO;
import org.Trip.domain.Criteria;

public interface TravelService {
	
	public List<TravelVO> localTrip(String category);
	
	public List<TravelVO> findAll();
	
	public int getCount(int count);
	

}
