package com.test.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.mvc.service.MVCService;





@Controller
public class MVCController {
	
	@Autowired
	private MVCService mvcService;
	
	
	@RequestMapping("/index")
	public String sayHello(Model model) throws Exception {
		model.addAttribute("hello",mvcService.sayHello());
		return "home";
	}
	
}
