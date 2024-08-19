package org.Trip.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import org.Trip.domain.TripUserVO;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserSecurityDetails implements UserDetails {
	
	private TripUserVO user;
	
	//권한 테이블
	private String id;
	private String password;
	private String nickname;
	
	private String authority;
	private boolean enabled;
	
//	public UserSecurityDetails(TripUserVO user) {
//		
//		this.user = user;
//	}
	
	
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		// 사용자의 권한을 반환
//		// 예를 들어, 사용자의 역할에 기반하여 권한을 반환할 수 있습ㅂ니다.
//		return Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"));
//	}
	
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		
//		Set<GrantedAuthority> authorities = new HashSet<>();
//		
//		//사용자, 관리자 권한
//		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
//		authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
//		
//		return authorities;
//	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		ArrayList<GrantedAuthority> auth = new ArrayList<GrantedAuthority>();
		
		auth.add(new SimpleGrantedAuthority(authority));
		
		return auth;
	}
	
	@Override
	public String getPassword() {
		
//		return user.getPasswd();
		return password;
	}
	
	@Override
	public String getUsername() {
		
//		return user.getUserId();
		return id;
	}
	
	@Override
	public boolean isAccountNonExpired() {
		
		return true; // 계정 만료 여부
	}
	
	@Override
	public boolean isAccountNonLocked() {
		return true; // 계정 잠금 여부
	}
	
	@Override
	public boolean isCredentialsNonExpired() {
		return true; // 자격 증명 만료 여부
	}
	
	@Override
	public boolean isEnabled() {
//		return true; // 계정 활성화 여부
		
		return enabled;
	}
	

}
