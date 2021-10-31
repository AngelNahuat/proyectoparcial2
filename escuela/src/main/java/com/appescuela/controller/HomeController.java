package com.appescuela.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.appescuela.service.IMateriasPService;

@Controller
public class HomeController {
<<<<<<< HEAD
	@Autowired
	private IMateriasPService materiasPService;
	@GetMapping("/materiasProgramacion")
=======

	@GetMapping("/listadoP")
>>>>>>> branch 'master' of https://github.com/AngelNahuat/proyectoparcial2.git
	public String motrarListadoP(Model model) {
		   
<<<<<<< HEAD
		//Prueba 9:38
		//listado de materias Programacion
		List<List<String>> lista = materiasPService.buscarTodas();
		model.addAttribute("materiasP",lista);
=======
		//Prueba 3:12 
		//listado de materias Prtogramacion
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
>>>>>>> branch 'master' of https://github.com/AngelNahuat/proyectoparcial2.git
		
		System.out.println(lista);
		return "listadoP";
		
	}
	
	
<<<<<<< HEAD
	@GetMapping("/formProfesor")
	public String formProfesor() {
		
		return "formProfesor";
	}
	@GetMapping("/formAlumno")
	public String formAlumno() {
		
		return "formAlumno";
	}
	@GetMapping("/formAsignatura")
	public String formAsigantura() {
		
		return "formAsignatura";
	}
	
	@GetMapping("/registrarse")
	public String registrarse() {
		
		return "registrarse";
	}
	
	
	@GetMapping("/detallesProgramacion")
	public String detallesP() {
		
		return "detallesP";
	}
	
	@GetMapping("/detallesContabilidad")
	public String detallesC() {
		
		return "detallesC";
	}
	
	
	
	@GetMapping("/materiasContabilidad")
=======
	@GetMapping("/listadoC")
>>>>>>> branch 'master' of https://github.com/AngelNahuat/proyectoparcial2.git
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
