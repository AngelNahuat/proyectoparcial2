package com.appescuela.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/listado")
	public String motrarListado(Model model) {
		
		List<String> lista = new LinkedList<String>();
		lista.add("Programacion"); 
		lista.add("Contabilidad");
		
		model.addAttribute("carreras", lista);
		return "listado";
	}
	
	
	@GetMapping("/")
	public String motrarHome(Model model) {
		     
		model.addAttribute("mensaje", "Bienvenidos a Pagina-Escuela");
		model.addAttribute("fecha", new Date() );
		return "home";
	}
	
}
