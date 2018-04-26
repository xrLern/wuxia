package com.xurui.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class LoginController {
//  NamedParameterJdbcOperations
	@RequestMapping(value = "/user/login")
	@ResponseBody
	public String login(){
		@SuppressWarnings("unchecked")
		Map<String,Object> maps = new HashMap(32, 0.75f);
		return "";
	}
}
