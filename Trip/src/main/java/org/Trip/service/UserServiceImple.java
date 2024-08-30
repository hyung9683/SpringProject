package org.Trip.service;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.Trip.domain.TripUserVO;
import org.Trip.domain.AuthVO;

import org.Trip.mapper.UserMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;


@Service
@Log4j
public class UserServiceImple implements UserService {
	
	@Setter(onMethod_ ={@Autowired})
	private UserMapper userMapper;
	
	//회원가입
	@Override
	public void join(TripUserVO user) {
		
		Map<String, Object> map = new HashMap<>();
		
		map.put("p_user_id", user.getUserId());
		map.put("p_user_pw", user.getPasswd());
		map.put("p_user_nick", user.getUserNick());
		map.put("p_user_email", user.getEmail());
		map.put("p_user_num", user.getPhone());
		map.put("p_user_zipcode", user.getZipCode());
		map.put("p_user_adr1", user.getAddress1());
		map.put("p_user_adr2", user.getAddress2());
		map.put("p_login_ty", user.getLoginType());
		
		log.info("회원 가입:" + map);
		
		userMapper.procedureInsert(map);
		
	}
	
	

}
