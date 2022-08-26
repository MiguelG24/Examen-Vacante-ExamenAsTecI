package com.examen.predicate;

public class Empleado {

	private int id;
	private Integer edad;
	private String genero;
	private String nombre;
	private String apellido;
	
	public Empleado(int id, Integer edad, String genero, String nombre, String apellido) {
		super();
		this.id = id;
		this.edad = edad;
		this.genero = genero;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	@Override
	public String toString() {
		return "Empleado [" + id + ", " + genero + ", " + nombre + "]";
	}
	
	
}
