package com.login.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.login.models.NewUser;
import com.login.services.UserService;


@Controller
public class SignupController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/signup")
	public String showSignupPage() {
		return "signup";
	}
	
	@PostMapping("/doSignup")
	public String saveUser(@ModelAttribute NewUser newUser, Model model) {
		this.userService.addNewUser(newUser);
		
//		System.out.println(newUser);
		
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("newUser", newUser);
//		mav.setViewName("welcome");
//		return mav;
		
		model.addAttribute("username", newUser.getUsername());
		return "welcome";
	}
}
