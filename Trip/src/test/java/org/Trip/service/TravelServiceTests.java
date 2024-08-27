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
	
	@Test
	public void testTravleService() {
		
		TravelVO tv = new TravelVO();
		
		ImageFileVO img = new ImageFileVO();
		
		
//		Map<String, Object> map = new HashMap<>();
		
		
		tv.setTitle("서울 제목 지정");
		tv.setAddress("서울특별시 어디구 어디로");
		tv.setContent("서울 내용 지정");
		tv.setLocal("서울특별시");
		tv.setLocalId(1L);
		tv.setLocalCategory(1L);
		tv.setPrice("10000원");
		
		img.setTno(tv.getTno());
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

}
