package org.Trip.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import org.Trip.mapper.MemberMapper;

//import org.Trip.mapper.UserMapper;
//import org.Trip.domain.TripUserVO;

import org.Trip.domain.MemberVO;
import org.Trip.security.domain.CustomUser;


import lombok.Setter;
import lombok.Data;
import lombok.extern.log4j.Log4j;
//Spring Sercurity 사용자인증 관련 클래스
//DB에서 사용자 정보조회를 담당하는 클래스

@Data
@Service
@Log4j
public class UserAuthenticationService implements UserDetailsService {
	
//	@Setter(onMethod_ = {@Autowired})
//	private UserMapper userMapper;
//	
//	
//	
//	
//	public UserSecurityDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
//		
//		UserSecurityDetails userDetails = null;
//		
//		TripUserVO user = userMapper.findId(userId);
//		
//		if(user == null) {
//			
//			
//			throw new UsernameNotFoundException(userId);
//		}
//		
//		userDetails = new UserSecurityDetails();
//		return userDetails;
//	}
	
	@Setter(onMethod_ = {@Autowired})
	private MemberMapper memberMapper;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		log.warn("Load User By UserName: " + userName);
		
		// userName means userid
		MemberVO vo = memberMapper.read(userName);
		
		log.warn("queried by member mapper:" + vo);
		
		//CustomUser 객체로 변환
		
		return vo == null ? null : new CustomUser(vo);
//		return null;
	}
	
}
