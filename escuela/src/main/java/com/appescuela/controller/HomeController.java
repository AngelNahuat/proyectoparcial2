package com.appescuela.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/listadoP")
	public String motrarListadoP(Model model) {
		   
		//Prueba 9:38
		//listado de materias Programacion
		List<String> lista = new LinkedList<String>();
		lista.add("Álgebra"); 
		lista.add(" Inglés I\r\n"+ " ");
		lista.add("Química I ");
		lista.add("Tecnologías de\r\n"
				+ "la Información y\r\n"
				+ "la Comunicación");
		lista.add("Lógica");
		lista.add("Lectura, Expresión Oral\r\n"
				+ "y Escrita I");
		

		model.addAttribute("asignaturasP", lista);
		

		return "listadoP";
		
	}
	
	
	@GetMapping("/listadoC")
	public String motrarListadoC(Model model) {
		
		
		//listado de materias Contabilidad
		List<String> lista = new LinkedList<String>();
				lista.add("Álgebra"); 
				lista.add(" Inglés I\r\n"+ " ");
				lista.add("Química I ");
				lista.add("Tecnologías de\r\n"
						+ "la Información y\r\n"
						+ "la Comunicación");
				lista.add("Lógica");
				lista.add("Lectura, Expresión Oral\r\n"
						+ "y Escrita I");
				
		
		
		model.addAttribute("asignaturasC", lista);
		
		

		return "listadoC";
		
	}

	
	@GetMapping("/")
	public String motrarHome(Model model) {
		     
		model.addAttribute("mensaje", "Bienvenidos a Pagina/Escuela");
		model.addAttribute("fecha", new Date() );
		return "home";
	}
	
}
