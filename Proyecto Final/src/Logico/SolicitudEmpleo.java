package Logico;

public class SolicitudEmpleo {
	
	private String Cedula;
	private float SalarioMinimo;
	private Persona persona;
	private boolean Estado;
	
	
	public SolicitudEmpleo(String cedula, float salarioMinimo, Persona persona, boolean estado) {
		super();
		Cedula = cedula;
		SalarioMinimo = salarioMinimo;
		this.persona = persona;
		Estado = estado;
	}


	public String getId() {
		return Cedula;
	}


	public void setId(String cedula) {
		Cedula = cedula;
	}


	public float getSalarioMinimo() {
		return SalarioMinimo;
	}


	public void setSalarioMinimo(float salarioMinimo) {
		SalarioMinimo = salarioMinimo;
	}


	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}


	public boolean isEstado() {
		return Estado;
	}


	public void setEstado(boolean estado) {
		Estado = estado;
	}
	
	
	
	

}
