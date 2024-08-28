package org.Trip.service;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

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
	
	@Override
	public void registerTrip(TravelVO tv, ImageFileVO img) {
		
		Map<String, Object> map = new HashMap<>();
		
		map.put("p_tv.tv_tit", tv.getTitle());
		map.put("p_tv.tv_ads", tv.getAddress());
		map.put("p_tv.tv_content", tv.getContent());
		map.put("p_tv.tv_id", tv.getLocalId());
		map.put("p_tv.tv_local", tv.getLocal());
		map.put("p_tv.tv_category", tv.getLocalCategory());
		map.put("p_tv.tv_price", tv.getPrice());
		map.put("p_img.m_img", img.getMain());
		map.put("p_img.sub_img1", img.getSub1());
		map.put("p_img.sub_img2", img.getSub2());
		map.put("p_img.sub_img3", img.getSub3());
		map.put("p_img.sub_img4", img.getSub4());
		map.put("p_img.local_id", img.getLocalId());
		
		log.info("현재 map:" + map);
		
		travelMapper.insertTrip(map);
		
		
	}
	
	@Override
	public int getPKNumber() {
		
		log.info("현재 PK_TNO:" + travelMapper.selectKey());
		
		int tno = travelMapper.selectKey();
		
		return tno;
	}
	
	

}
