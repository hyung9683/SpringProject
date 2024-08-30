package org.Trip.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import org.Trip.domain.TripUserVO;
import org.Trip.service.UserService;

import lombok.extern.log4j.Log4j;
import lombok.Setter;


@Controller
@Log4j
public class UserController {
	
	@Setter(onMethod_ =@Autowired)
	private UserService userService;
	
	
	
	@GetMapping("/accessError")
	public void accessDenied(Authentication auth, Model model) {
		
		log.info("access Denied:" + auth );
		
		model.addAttribute("msg", "접근 할수 없습니다.");
	}
	
	
	@GetMapping("/login")
	public void loginInput(String error, String logout, Model model) {
		
		log.info("error:" + error);
		log.info("logout:" + logout);
		
		if(error != null) {
			
			model.addAttribute("error", "로그인중 에러가 발생했습니다 계정이 맞는지 확인해주십시오");
		}
		
		if(logout != null) {
			
			model.addAttribute("logout", "로그아웃 완료");
		}
	}
	
	@GetMapping("/logout")
	public void logoutGET() {
		
		log.info("custom logout");
	}
	
	@GetMapping("/join")
	public void joinGET() {
		
		log.info("회원가입 화면");
	}
	
	@PostMapping("/join")
	public String joinPOST(TripUserVO vo) throws Exception {
		
		log.info("입력된 데이터" + vo);
		
		userService.join(vo);
		
		log.info("회원가입 성공");
		
		return "redirect: /login";
		
	}
	
	
//	@PostMapping("/logout")
//	public void logoutPost() {
//		
//		log.info("post custom logout");
//	}

}
