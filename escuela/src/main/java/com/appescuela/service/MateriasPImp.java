package com.appescuela.service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MateriasPImp implements IMateriasPService {
	
	public List<List<String>> lista;
	public ArrayList<String> listas1;
	public ArrayList<String> listas2;
	public ArrayList<String> listas3;
	public ArrayList<String> listas4;
	public ArrayList<String> listas5;
	public ArrayList<String> listas6;
public MateriasPImp() throws ParseException{
	listas1=new ArrayList<String>();
	listas2=new ArrayList<String>();
	listas3=new ArrayList<String>();
	listas4=new ArrayList<String>();
	listas5=new ArrayList<String>();
	listas6=new ArrayList<String>();
	lista=new ArrayList<>();
	
	listas1.add("Álgebra"); 
	listas1.add(" Inglés I\r\n"+ " ");
	listas1.add("Química I ");
	listas1.add("Tecnologías de\r\n"
			+ "la Información y\r\n"
			+ "la Comunicación");
	listas1.add("Lógica");
	listas1.add("Lectura, Expresión Oral\r\n"
			+ "y Escrita I");
	
	listas2.add("Geometría\r\n"
			+ "y Trigonometría");
	listas2.add("Inglés II");
	listas2.add("Química II");
	listas2.add("Lectura, Expresión Oral\r\n"
			+ "y Escrita II");
	listas2.add("Módulo I\r\n");
	listas2.add("Desarrolla software de\r\n"
			+ "aplicación con\r\n"
			+ "programación estructurada");
	
	listas3.add("Geometría Analítica");
	listas3.add("Inglés III");
	listas3.add("Biología");
	listas3.add("Ética");
	listas3.add("Modulo II");
	listas3.add("Aplica metodologías de\r\n"
			+ "desarrollo de software con\r\n"
			+ "herramientas de\r\n"
			+ "programación visual");
	
	listas4.add("Cálculo diferencial");
	listas4.add("Inglés IV");
	listas4.add("Física I");
	listas4.add("Ecologia");
	listas4.add("Modulo III");
	listas4.add("Desarrolla aplicaciones Web");
	
	listas5.add("Cálculo integral");
	listas5.add("Ingles V");
	listas5.add("Física II");
	listas5.add("Ciencia, Tecnología,\r\n"
			+ "Sociedad y Valores");
	listas5.add("Modulo IV");
	listas5.add("Desarrolla software de\r\n"
			+ "aplicación Web con\r\n"
			+ "almacenamiento persistente\r\n"
			+ "de datos");
	listas6.add("Probabilidad y Estadisitica");
	listas6.add("Temas de Filosofía");
	listas6.add("Asignatura propedéutica");
	listas6.add("Asignatura propedéutica");
	listas6.add("Modulo V");
	listas6.add("Desarrolla aplicaciones para\r\n"
			+ "dispositivos móviles");
	
	lista.add(listas1);
	lista.add(listas2);
	lista.add(listas3);
	lista.add(listas4);
	lista.add(listas5);
	lista.add(listas6);
	
}
	@Override
	public List<List<String>> buscarTodas() {
		// TODO Auto-generated method stub
		return lista;
	}

}
