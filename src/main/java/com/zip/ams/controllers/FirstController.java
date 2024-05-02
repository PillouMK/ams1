package com.zip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
	@GetMapping("/info")
	// @ResponseBody
	public String info() {
		System.out.println("test commit");
		return "first/info";
	}
	
	@GetMapping("/details")
	// @ResponseBody
	public String detailsFormation()
	{
		return "first/details";
	}
}
