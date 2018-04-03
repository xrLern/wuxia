package com.xurui.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class LoginController {
	@RequestMapping(value = "/user/login")
	@ResponseBody
	public String login(){
		return "";
	}
}
