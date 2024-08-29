package org.Trip.domain;

import java.util.List;
import java.util.Date;
import java.util.Collection;

import org.Trip.domain.AuthVO;

import org.springframework.security.core.GrantedAuthority;

import lombok.Data;

@Data
public class TripUserVO {
	
	private Long uno;
	private String userId;
	private String passwd;
	private String userNick;
	private String email;
	private String phone;
	private int userType;
	private String zipCode;
	private String address1;
	private String address2;
	private int loginType;
	private String tmi;
	private String accessToken;
	private Date regDate;
	private Date delete;
	
	private List<AuthVO> authList;
	

}
