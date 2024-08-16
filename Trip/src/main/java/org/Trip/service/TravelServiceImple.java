package org.Trip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.Trip.domain.TravelVO;
import org.Trip.mapper.TravelMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;


@Log4j
@Service
public class TravelServiceImple implements TravelService {
	
	@Setter(onMethod_ =@Autowired)
	private TravelMapper travelMapper;
	
	@Override
	public List<TravelVO> localTrip(String category) {
		
		log.info("해당" + category + "데이터: " + travelMapper.getList(category));
		
		//지역 이름이 넣어지면 해당 지역에 해당하는 데이터를 전부 갖고온다
		return travelMapper.getList(category);
	}
	
	@Override
	public List<TravelVO> findAll() {
		
		log.info("전체목록에 표시된 여행지:" + travelMapper.);
	}

}
