package org.Trip.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import org.Trip.domain.TripUserVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class UserServiceTests {
	
	@Setter(onMethod_ =@Autowired)
	private UserService userService;
	
	@Test
	public void testUserJoin() throws Exception {
		
		TripUserVO vo = new TripUserVO();
		
		vo.setUserId("아이디1");
		vo.setPasswd("패스워드1234!");
		vo.setUserNick("닉네임");
		vo.setEmail("이메일@이메일.이메일");
		vo.setPhone("0000-00000-0000");
		vo.setZipCode("주소-주소-주소");
		vo.setAddress1("주소1");
		vo.setAddress2("주소2");
		vo.setLoginType(1);
		
		log.info("회원가입 테스트:" + vo);
		
		userService.join(vo);
	}

}
