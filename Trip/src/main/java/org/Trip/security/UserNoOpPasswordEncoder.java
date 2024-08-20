package org.Trip.security;

import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.extern.log4j.Log4j;

@Log4j
public class UserNoOpPasswordEncoder implements PasswordEncoder {
	
	//PasswordEncoder 인터페이스이 메소드들
	
	public String encode(CharSequence rawPassword) {
		
		log.warn("before encode :" + rawPassword);
		
		return rawPassword.toString();
	}
	
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		
		log.warn("matches:" + rawPassword + ":" + encodedPassword);
		
		return rawPassword.toString().equals(encodedPassword);
	}

}
