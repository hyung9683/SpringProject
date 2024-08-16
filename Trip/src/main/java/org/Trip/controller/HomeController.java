package org.Trip.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.Trip.service.UserService;
import org.Trip.service.TravelService;
import org.Trip.service.FestivalService;

import org.Trip.domain.TripUserVO;
import org.Trip.domain.FestivalVO;
import org.Trip.domain.TripUserVO;

import lombok.extern.log4j.Log4j;
import lombok.Setter;

@Log4j
@Controller
public class HomeController {
	
	private UserService userService;
	private TravelService tripService;
	private FestivalService fesService;
	
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public void home(Locale locale, Model model) {
		log.info();
		
		
	}
	
}
