package org.Trip.security.domain;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;


import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import org.Trip.domain.TripUserVO;

import lombok.Getter;


//p. 659  username만으로 이루어진 사용자 정보만이 아닌 이메일이나 이름 등의 자세한 정보를 이용하기 위해 작성 
// 기존의 MemberVO를 수정하지 않고 확장하는 방식, VO에 있는것 뿐만 아닌 추가적인 사용자 정보를 안전하게 보호하기 위함
@Getter
public class CustomUser extends User {
	
	private static final long serialVersionUID = 1L;
	
	private TripUserVO vo;
	
	public CustomUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		
		super(username, password, authorities);
	}
	
	public CustomUser(TripUserVO vo) {
		
		//Collectors.toList()는 스트림의 모든 요소를 List
		super(vo.getUserId(), vo.getPasswd(), vo.getAuthList().stream().map(auth -> new SimpleGrantedAuthority(auth.getAuth())).collect(Collectors.toList()));

		
		this.vo = vo;
	}

}
