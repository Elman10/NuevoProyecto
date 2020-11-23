package Logico;

public class SolicitudEmpleo {
	
	private String cedula;
	private float salarioMinimo;
	private Persona persona;
	private boolean estado;
	
	
	public SolicitudEmpleo(String cedula, float salarioMinimo, Persona persona, boolean estado) {
		super();
		this.cedula = cedula;
		this.salarioMinimo = salarioMinimo;
		this.persona = persona;
		this.estado = estado;
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
	
	
	
	

}
