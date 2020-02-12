
package com.mycompany.ejerciciod;

public class Estudiante extends Persona{
    
	private String curso;

	
	
	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estudiante(String nombre, String apellidos, String id, String estadoCivil, String _curso) {
		super(nombre, apellidos, id, estadoCivil);
		// TODO Auto-generated constructor stub
		this.curso = _curso; 
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String to----------------------String() {
		return "Estudiante [curso=" + curso + super.toString() + "]";
	} 
	
	
	
	
	
}
