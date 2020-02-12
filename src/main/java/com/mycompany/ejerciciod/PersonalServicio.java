/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciod;

package com.mycompany.ejerciciod;

public class PersonalServicio extends Persona {
	
	private String seccion;
	
	public PersonalServicio(String nombre, String apellidos, String id, String estadoCivil,
							String seccion) {
		super(nombre, apellidos, id, estadoCivil);
		
		this.seccion = seccion;
	}
	
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public String getSeccion() {
		return seccion;
	}
							
	public String toString() {
		return super.toString() + "Seccion: "+ seccion;
		
	}
}

