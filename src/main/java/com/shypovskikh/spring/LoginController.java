package com.shypovskikh.spring;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	private static final Logger  logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView main() {
		return new ModelAndView("login", "user", new User());
	}
	
	@RequestMapping(value="/check-user", method = RequestMethod.POST)
	public ModelAndView checkUser(@ModelAttribute("user") User user) {
		return new ModelAndView("main", "user", user);
	}
	

}
