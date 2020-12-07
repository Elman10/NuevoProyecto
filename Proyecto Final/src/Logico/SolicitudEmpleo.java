package Logico;

import java.util.ArrayList;

public class SolicitudEmpleo {
	
	private String cedula;
	private String salarioMinimo;
	private Persona persona;
	private boolean estado;
	private boolean dispViaje;
	
	
	
	public SolicitudEmpleo(String cedula, String salarioMinimo, boolean estado, boolean dispViaje, Persona persona) {
		super();
		this.cedula = cedula;
		this.salarioMinimo = salarioMinimo;
		this.persona = persona;
		this.estado = estado;
		this.dispViaje = dispViaje;
	}


	public String getId() {
		return cedula;
	}


	public void setId(String cedula) {
		this.cedula = cedula;
	}


	public String getSalarioMinimo() {
	        return salarioMinimo;
	}


	public void setSalarioMinimo(String salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
	}


	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public boolean isDispViaje() {
		return dispViaje;
	}
	
	public void setDispViaje(boolean dispViaje) {
		this.dispViaje = dispViaje;
	}
	
	
	
	

}
