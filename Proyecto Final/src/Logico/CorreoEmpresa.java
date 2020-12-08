package Logico;

public class CorreoEmpresa {
	private String rnc;
	private Persona persona;
	
	
	public String getRnc() {
		return rnc;
	}
	public void setRnc(String rnc) {
		this.rnc = rnc;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public CorreoEmpresa(String rnc, Persona persona) {
		super();
		this.rnc = rnc;
		this.persona = persona;
	}
	
	
	
	
}
