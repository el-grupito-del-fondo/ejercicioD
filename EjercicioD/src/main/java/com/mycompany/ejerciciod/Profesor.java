/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciod;

/**
 *
 * @author Alumno
 */
public class Profesor extends Persona {
	
	//ATRIBUTO
    public String departamento;

    //CONSTRUCTOR
	public Profesor(String nombre, String apellidos, String id, String estadoCivil, String departamento) {
		super(nombre, apellidos, id, estadoCivil);
		this.departamento = departamento;
	}

	//SETT GETT
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	//toSTRING
	@Override
	public String toString() {
		return super.toString() + "Profesor [departamento=" + departamento + "]";
	}

	//METODOS
	  public void cambiarDepartamento(String dep){
	        this.departamento = dep;
	    }
	
}
