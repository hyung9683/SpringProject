package org.Trip.controller;



import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.extern.log4j.Log4j;
import lombok.Setter;


import org.Trip.domain.TripUserVO;
import org.Trip.service.UserService;

@Log4j
//@RequestMapping("/user/*")
@Controller
public class UserController {
	
	@Setter(onMethod_ = {@Autowired})
	private UserService userService;
	
	@Setter(onMethod_ = {@Autowired})
	private PasswordEncoder encoder;
	
	
	
	@GetMapping("/join")
	public void join() {
		
		log.info("회원가입");
	}
	
	
	@GetMapping("/check")
	public boolean idCheck(@RequestBody TripUserVO user, Model model) {
		
		log.info("아이디 중복체크");
		
		boolean isCheck = userService.idCheck(user.getUserId());
		
		model.addAttribute("입력된 아이디", isCheck);
		
		if(isCheck) {
			
			return false;
		}
		
		return true;
		
		
	}
	
	
	//회원정보 저장
	@PostMapping("/join")
	public String join(TripUserVO user, RedirectAttributes rttr) {
		
		
			
			String cryptEncoderPw = encoder.encode(user.getPasswd());
			
			//암호화 비밀번호 저장
			user.setPasswd(cryptEncoderPw);
			
			log.info("암호화 비밀번호:" + user.getPasswd());
			
			
			log.info("회원가입 정보:" + user);
			
			userService.join(user);
			
			
		
		return "";
		
		
		
		
	}

}
