package com.educaronline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaMundoController {

	@RequestMapping
	public String index() {
		
		return "index";
	}
	
	@RequestMapping("bienvenida")
	public String bienvenida() {
		
		return "bienvenida";
	}
}
