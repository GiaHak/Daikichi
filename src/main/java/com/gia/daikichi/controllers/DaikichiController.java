package com.gia.daikichi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Daikichi")
public class DaikichiController {
	@RequestMapping("/")
	public String welcome() {
		return "Welcome!";
	}
	@RequestMapping("/today") 
		public String index() {
		return "Today you will find luck in all your endeavors!";
		
	}
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to open to new ideas!";
	}

}
