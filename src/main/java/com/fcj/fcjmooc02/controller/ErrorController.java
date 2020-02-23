package com.fcj.fcjmooc02.controller;

import com.fcj.fcjmooc02.pojo.IMoocJSONResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("err")
public class ErrorController {

	@RequestMapping("/error")
	public String error() {
		
		int a = 1 / 0;
		
		return "thymeleaf/error666";
	}
	
	@RequestMapping("/ajaxerror")
	public String ajaxerror() {

		return "thymeleaf/ajaxerror";
	}
	
	@RequestMapping("/getAjaxerror")
	@ResponseBody
	public IMoocJSONResult getAjaxerror() {
		
		int a = 1 / 0;

		return IMoocJSONResult.ok();

	}
}