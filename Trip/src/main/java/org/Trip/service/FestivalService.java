package org.Trip.service;

import java.util.List;

import org.Trip.domain.FestivalVO;

public interface FestivalService {
	
	public List<FestivalVO> localTrip(FestivalVO fes);
	
	public List<FestivalVO> findAll();
	
	public int getCount(int count);
	

}
