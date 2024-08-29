package org.Trip.service;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Struct;
import org.apache.ibatis.session.SqlSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.Trip.domain.TravelVO;
import org.Trip.domain.ImageFileVO;

import org.Trip.mapper.TravelMapper;

import org.Trip.struct.ProcedureStruct;


import lombok.extern.log4j.Log4j;
import lombok.Setter;

@Service
@Log4j
public class TravelServiceImple implements TravelService {
	
	@Setter(onMethod_ =@Autowired)
	private TravelMapper travelMapper;
	
//	@Setter(onMethod_ =@Autowired)
//	private SqlSession sqlSession;
	
//	@Override
//	public void registerTrip(TravelVO tv, ImageFileVO img) {
//		
//		Map<String, Object> map = new HashMap<>();
//		
//		map.put("p_tv.tv_tit", tv.getTitle());
//		map.put("p_tv.tv_ads", tv.getAddress());
//		map.put("p_tv.tv_content", tv.getContent());
//		map.put("p_tv.tv_id", tv.getLocalId());
//		map.put("p_tv.tv_local", tv.getLocal());
//		map.put("p_tv.tv_category", tv.getLocalCategory());
//		map.put("p_tv.tv_price", tv.getPrice());
//		map.put("p_img.m_img", img.getMain());
//		map.put("p_img.sub_img1", img.getSub1());
//		map.put("p_img.sub_img2", img.getSub2());
//		map.put("p_img.sub_img3", img.getSub3());
//		map.put("p_img.sub_img4", img.getSub4());
//		map.put("p_img.local_id", img.getLocalId());
//		
//		log.info("현재 map:" + map);
//		
//		travelMapper.insertTrip(map);
//		
//		
//	}
	
	@Override
	public void registerTrip(TravelVO tv, ImageFileVO img) {
		
		Map<String, Object> map = new HashMap<>();
		
		map.put("p_tv_tit", tv.getTitle());
		map.put("p_tv_ads", tv.getAddress());
		map.put("p_tv_content", tv.getContent());
		map.put("p_tv_id", tv.getLocalId());
		map.put("p_tv_local", tv.getLocal());
		map.put("p_tv_category", tv.getLocalCategory());
		map.put("p_tv_price", tv.getPrice());
		map.put("p_img_m_img", img.getMain());
		map.put("p_img_sub_img1", img.getSub1());
		map.put("p_img_sub_img2", img.getSub2());
		map.put("p_img_sub_img3", img.getSub3());
		map.put("p_img_sub_img4", img.getSub4());
		map.put("p_img_local_id", img.getLocalId());
		
		log.info("현재 map:" + map);
		
		travelMapper.insertTrip(map);
		
		
	}
	
	@Override
	public List<TravelVO> bestTrip() {
		
		log.info("현재 조회수 많은 여행지들:" + travelMapper.bestTrip());
		
		return travelMapper.bestTrip();
	}
	
	
	
	@Override
	public void insertGo(TravelVO tv) {
		
		log.info("테스트용 insert:" + tv);
		
		travelMapper.insertGo(tv);
	}
	
//	@Override
//	public int getPKNumber() {
//		
//		log.info("현재 PK_TNO:" + travelMapper.selectKey());
//		
//		int tno = travelMapper.selectKey();
//		
//		return tno;
//	}
	
	
	
	
	
	
	
	
	//%ROWTYPE 예제
//	@Override
//	public void structTest(TravelVO tv, ImageFileVO img) throws SQLException {
//		
//		Connection conn = sqlSession.getConnection();
//		
//		Struct tvStruct = ProcedureStruct.createTripTvStruct(conn, tv);
//		Struct imgStruct = ProcedureStruct.createTripImgStruct(conn, img);
//		
//		travelMapper = sqlSession.getMapper(TravelMapper.class);
//		
//		travelMapper.procedureTest(tvStruct, imgStruct);
//		
//	}
	
	
	

}
