package org.Trip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.Trip.domain.TripUserVO;
import org.Trip.domain.Criteria;
import org.Trip.mapper.UserMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.Setter;


@Log4j
@Service
@AllArgsConstructor
public class UserServiceImple implements UserService {
	
	private UserMapper mapper;
	
	@Override
	public void join(TripUserVO user) {
		
		log.info("환영합니다" + user);
		
		mapper.insertSelectKey(user);
	}
	
//	@Override
//	public void join(TripUserVO user) {
//		
//		log.info("환영합니다" + user);
//		
//		mapper.insert(user);
//	}
	
	@Override
	public TripUserVO get(Long uno) {
		
		log.info("해당 유저:" + uno);
		
		return mapper.read(uno);
	}
	

}
