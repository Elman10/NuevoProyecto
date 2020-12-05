package Logico;

public class SolicitudEmpleo {
	
	private String cedula;
	private float salarioMinimo;
	private Persona persona;
	private boolean estado;
	private boolean dispViaje;
	
	
	public SolicitudEmpleo(String cedula, float salarioMinimo, boolean estado, boolean dispViaje) {
		super();
		this.cedula = cedula;
		this.salarioMinimo = salarioMinimo;
		//this.persona = persona;
		this.estado = estado;
		this.dispViaje = dispViaje;
	}


	public String getId() {
		return cedula;
	}


	public void setId(String cedula) {
		this.cedula = cedula;
	}


	public float getSalarioMinimo() {
		return salarioMinimo;
	}


	public void setSalarioMinimo(float salarioMinimo) {
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
