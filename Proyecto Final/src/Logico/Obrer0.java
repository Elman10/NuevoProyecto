package Logico;

import java.util.ArrayList;

public class Obrer0 extends Persona {
	
	private ArrayList<String> habilidades;
	private String experiencia;
	
	public Obrer0(String nombre, String apellido, String cedula, String pais, String telefono, String estadoC, String codigoz,
			String genero, String password, ArrayList<String> habilidades, String experiencia) {
		super(nombre, apellido, cedula, pais, telefono, estadoC, codigoz, genero, password);
		this.habilidades = new ArrayList<>();
		this.experiencia = experiencia;
	}

	public ArrayList<String> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(ArrayList<String> habilidades) {
		this.habilidades = habilidades;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
}
