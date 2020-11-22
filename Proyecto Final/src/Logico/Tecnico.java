package Logico;

import java.util.ArrayList;

public class Tecnico extends Persona {
	
	private ArrayList<String> area;
	private String experiencia;
	
	public Tecnico(String nombre, String apellido, String cedula, String pais, String telefono, String estadoC,
			String codigoz, String genero, ArrayList<String> area, String experiencia) {
		super(nombre, apellido, cedula, pais, telefono, estadoC, codigoz, genero);
		this.area = area;
		this.experiencia = experiencia;
	}

	public ArrayList<String> getArea() {
		return area;
	}

	public void setArea(ArrayList<String> area) {
		this.area = area;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	
	
	
	
}
