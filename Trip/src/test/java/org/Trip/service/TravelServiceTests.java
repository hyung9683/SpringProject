package org.Trip.service;

import java.util.Map;
import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.Trip.domain.TravelVO;
import org.Trip.domain.ImageFileVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class TravelServiceTests {
	
	@Setter(onMethod_ =@Autowired)
	private TravelService travelService;
	
//	@Test
//	public void testTravleKey() {
//		
//		log.info("SelecKey() 메서드: " + travelService.getPKNumber());
//		
//	}
//	
	
	@Test
	public void testTravleService() {
		
		TravelVO tv = new TravelVO();
		
		ImageFileVO img = new ImageFileVO();
	
//		int nextVal = travelService.getPKNumber();
//		
//		long tno = (long)nextVal;
		
		
//		Map<String, Object> map = new HashMap<>();
	
//		tv.setTno(tno);
		tv.setTitle("서울 제목 지정");
		tv.setContent("서울 내용 지정");
		tv.setAddress("서울특별시 어디구 어디로");
		tv.setLocalId(1L);
		tv.setLocal("서울특별시");
		tv.setLocalCategory(1L);
		tv.setPrice("10000원");
		
		
		img.setMain("main.jpg");
		img.setSub1("sub1.jpg");
		img.setSub2("sub2.jpg");
		img.setSub3("sub3.jpg");
		img.setSub4("sub4.jpg");
		img.setLocalId(1L);
	
		
		log.info("현재 여행지:" + tv);
		
		log.info("현재 여행지/이미지들:" + img);
		
		travelService.registerTrip(tv, img);
		
		
		
		
		
	}

//	@Test
//	public void insertTest() {
//		
//
//		TravelVO tv = new TravelVO();
//		
//		tv.setTitle("테스트용 서울 제목");
//		tv.setContent("테스트용 서울 내용");
//		tv.setAddress("테스트용 서울 주소");
//		tv.setLocalId(1L);
//		tv.setLocal("서울특별시");
//		tv.setLocalCategory(1L);
//		tv.setPrice("10000원");
//		
//		travelService.insertGo(tv);
//		
//	}

}
