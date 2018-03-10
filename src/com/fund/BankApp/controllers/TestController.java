package com.fund.BankApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping(value = { "", "/index", "index*", "view/*" })
	public String index() {
		return "testRequestMapping";
	}

	@RequestMapping(value = "/name")
	public String mehtodWithParams(
			@RequestParam(value = "userName", required = false, defaultValue = "mani") String userName, Model model) {
		System.out.println("page requested by " + userName);
		model.addAttribute("userName", userName);
		return "testRequestMapping";
	}
	
//	@RequestMapping(value="/dynamic/{userName}")
	
	@RequestMapping(value="/dynamic/{category:[a-z]+}/{userName}")
	public String dynamicUrlOf(@PathVariable ("userName") String userName) {
		return "testRequestMapping";
	}
	
	@RequestMapping("*")
	public String fallBackPage() {
		return "fileNotFound";
	}
}
