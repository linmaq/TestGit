package com.spring.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public Map<String,Object> resultError(){
		Map<String,Object> result = new HashMap<String,Object>();
		result.put("errorCode", "500");
		result.put("errorMsg", "系统错误！");
		return result;
	}
}
