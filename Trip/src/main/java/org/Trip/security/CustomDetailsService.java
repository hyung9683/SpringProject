package org.Trip.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.Trip.mapper.UserMapper;
import org.Trip.mapper.TravelMapper;
import org.Trip.domain.TripUserVO;
import org.Trip.security.domain.CustomUser;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
public class CustomDetailsService implements UserDetailsService {
	
	@Setter(onMethod_ = {@Autowired})
	private UserMapper userMapper;
	
	//유저 정보 조회
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		
		log.warn("Load User Ny UserName:" + username);
		
		//username은 userid
		TripUserVO vo = userMapper.readId(username);
		
		log.warn("quried by user mapper:" + vo);
		
		return vo == null ? null : new CustomUser(vo);
	}

}
