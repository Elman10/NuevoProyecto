package Logico;

public class Empresa {
	private String nombreEmpresa;
	private String rnc_Empresa;
	private String pais;
	private String codPostal;
	private String direccion;
	private String areaDeTrabajo;
	private String numero_Telefono;
	
	public Empresa(String nombreEmpresa, String rNC_Empresa, String pais, String codPostal, String direccion,
			String areaDeTrabajo, String numero_Telefono) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.rnc_Empresa = rNC_Empresa;
		this.pais = pais;
		this.codPostal = codPostal;
		this.direccion = direccion;
		this.areaDeTrabajo = areaDeTrabajo;
		this.numero_Telefono = numero_Telefono;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getRnc_Empresa() {
		return rnc_Empresa;
	}

	public void setRnc_Empresa(String rnc_Empresa) {
		this.rnc_Empresa = rnc_Empresa;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getAreaDeTrabajo() {
		return areaDeTrabajo;
	}

	public void setAreaDeTrabajo(String areaDeTrabajo) {
		this.areaDeTrabajo = areaDeTrabajo;
	}

	public String getNumero_Telefono() {
		return numero_Telefono;
	}

	public void setNumero_Telefono(String numero_Telefono) {
		this.numero_Telefono = numero_Telefono;
	}

}
