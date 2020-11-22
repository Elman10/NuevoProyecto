package Logico;

import java.util.ArrayList;

public class Universitario extends Persona {
	
	private ArrayList<String> idiomas;
	private String universidad;
	private String carrera;
	
	public Universitario(String nombre, String apellido, String cedula, String pais, String telefono, String estadoC, String codigoz,
			String genero, ArrayList<String> idiomas, String universidad, String carrera) {
		super(nombre, apellido, cedula, pais, telefono, estadoC, codigoz, genero);
		this.idiomas = idiomas;
		this.universidad = universidad;
		this.carrera = carrera;
	}

	public ArrayList<String> getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(ArrayList<String> idiomas) {
		this.idiomas = idiomas;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
}
