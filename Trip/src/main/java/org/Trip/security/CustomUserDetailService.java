package org.Trip.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.Trip.mapper.MemberMapper;
import org.Trip.security.domain.CustomUser;
import org.Trip.domain.MemberVO;


import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
public class CustomUserDetailService implements UserDetailsService {
	
	@Setter(onMethod_ = {@Autowired})
	private MemberMapper memberMapper;
	
	
	//UserDetailsService에선 아래 loadUserByname이라는 추상메서드 하나만 있다. 리턴 타입은 UserDetails
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		log.warn("Load User By UserName:" + userName);
		
		// userName 은 userid를 의미한다.
		MemberVO vo = memberMapper.read(userName);
		
		log.warn("queried by member mapper:" + vo);
		
		return vo == null ? null : new CustomUser(vo);
		
//		return null;
	}
	

}
