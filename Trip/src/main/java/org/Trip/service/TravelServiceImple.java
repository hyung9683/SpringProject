package org.Trip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.Trip.domain.TravelVO;
import org.Trip.domain.ImageFileVO;

import org.Trip.mapper.TravelMapper;

import lombok.extern.log4j.Log4j;
import lombok.Setter;

@Service
@Log4j
public class TravelServiceImple implements TravelService {
	
	@Setter(onMethod_ =@Autowired)
	private TravelMapper travelMapper;
	
	public List<TravelVO> localTrip(String category) {
		
			``
	}

}
