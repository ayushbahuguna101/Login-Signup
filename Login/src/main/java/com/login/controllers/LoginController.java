package com.login.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.login.models.User;
import com.login.services.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String showLoginPage() {
		return "login";
	}

	@PostMapping("/doLogin")
	public String checkUserCredentials(@ModelAttribute User user, Model model) {
		System.out.println("doLogin is running");
//		System.out.println(password);

		// User user = new User(username, password);
		
		model.addAttribute("username", user.getUsername());
		  if(this.userService.validateUser(user))
			  return "welcome";
		  else
			  return "error";
		 

//		ModelAndView mav = new ModelAndView();
//		mav.addObject("username", username);
//		mav.addObject("password", password);
//		mav.setViewName("welcome");
		
	}

}
