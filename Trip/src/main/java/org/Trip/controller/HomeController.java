package org.Trip.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.List;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j;
import lombok.Setter;

import org.Trip.service.TravelService;

import org.Trip.domain.TravelVO;
import org.Trip.domain.FestivalVO;
import org.Trip.domain.ImageFileVO;

import org.Trip.mapper.FestivalMapper;
import org.Trip.mapper.TravelMapper;





/**
 * Handles requests for the application home page.
 */
@Controller
//@RestController
@Log4j
public class HomeController {
	
	@Setter(onMethod_ = {@Autowired})
	private TravelService travelService;
	
	@Setter(onMethod_ = {@Autowired})
	private TravelMapper travelMapper;
	
	@Setter(onMethod_ = {@Autowired})
	private FestivalMapper festivalMapper;
	
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "text/plain; charset=UTF-8")
	public String main(Model model, TravelVO trip, FestivalVO fes) {
		
		
		List<TravelVO> topTrips = travelService.bestTrip();
		
		log.info(topTrips);
		
		model.addAttribute("topTrips", topTrips);
		
		
		
		return "main";
		
		
		
	}
	
	
	
	
//	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
//	
//	/**
//	 * Simply selects the home view to render by returning its name.
//	 */
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
//		
//		return "home";
//	}
	
}
