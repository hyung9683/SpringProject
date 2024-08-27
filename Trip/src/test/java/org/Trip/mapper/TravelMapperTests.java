package org.Trip.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import org.Trip.domain.TravelVO;
import org.Trip.domain.ImageFileVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j
public class TravelMapperTests {
	
	@Setter(onMethod_ =@Autowired)
	private TravelMapper travelMapper;
	
	@Test
	public void insertTest() {
		
		
		
	}
	
	
	@Test
	public void testTrip() {
		
		TravelVO tripVO = travelMapper
	}

}
