package org.Trip.security.domain;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;


import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import org.Trip.domain.MemberVO;

import lombok.Getter;


//p. 659  username만으로 이루어진 사용자 정보만이 아닌 이메일이나 이름 등의 자세한 정보를 이용하기 위해 작성 
@Getter
public class CustomUser extends User {
	
	private static final long serialVersionUID = 1L;
	
	private MemberVO member;
	
	public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		
		super(username, password, authorities);
	}
	
	public CustomUser(MemberVO vo) {
		
		super(vo.getUserid(), vo.getUserpw(), vo.getAuthList().stream().map(auth -> new SimpleGrantedAuthority(auth.getAuth())).collect(Collectors.toList()));

		
		this.member = vo;
	}

}
