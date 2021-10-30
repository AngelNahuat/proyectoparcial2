package com.appescuela.model;

public class Asignatura {

	
	private Integer CodAsignatura;
	private String nombre;
	private String Detalle;
	
	
	
	//Getters and setters
	public Integer getCodAsignatura() {
		return CodAsignatura;
	}
	public void setCodAsignatura(Integer codAsignatura) {
		CodAsignatura = codAsignatura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDetalle() {
		return Detalle;
	}
	public void setDetalle(String detalle) {
		Detalle = detalle;
	}
	
	//To string
	@Override
	public String toString() {
		return "Asignatura [CodAsignatura=" + CodAsignatura + ", nombre=" + nombre + ", Detalle=" + Detalle + "]";
	}
	
	
	
	
	
}
