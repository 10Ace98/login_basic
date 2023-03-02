package com.basic.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping("goMain")
	public String goMain() {
		return "home/main";
	}
	
	@GetMapping("goLogin")
	public String goLogin() {
		return "member/login";
	}
}
