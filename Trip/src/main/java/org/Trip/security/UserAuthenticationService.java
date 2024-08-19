package org.Trip.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import org.Trip.mapper.UserMapper;
import org.Trip.domain.TripUserVO;


import lombok.Setter;
import lombok.Data;
//Spring Sercurity 사용자인증 관련 클래스
//DB에서 사용자 정보조회를 담당하는 클래스

@Data
@Service
public class UserAuthenticationService implements UserDetailsService {
	
	@Setter(onMethod_ = {@Autowired})
	private UserMapper userMapper;
	
	
	
	
	public UserSecurityDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		
		UserSecurityDetails userDetails = null;
		
		TripUserVO user = userMapper.findId(userId);
		
		if(user == null) {
			
			
			throw new UsernameNotFoundException(userId);
		}
		
		userDetails = new UserSecurityDetails();
		return userDetails;
	}
}
