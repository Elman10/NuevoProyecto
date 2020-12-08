package Logico;

public class CorreoPersona {
	private Empresa empresa;
	private String cedula;
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public CorreoPersona(Empresa empresa, String cedula) {
		super();
		this.empresa = empresa;
		this.cedula = cedula;
	}
	
	
}
