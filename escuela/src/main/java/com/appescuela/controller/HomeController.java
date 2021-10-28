package com.appescuela.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String motrarHome(Model model) {
		
		model.addAttribute("mensaje", "Bienvenidos a Pagina Escuela");
		return "home";
	}
	
}
