package Logico;

public class Empresa {
	private String NombreEmpresa;
	private String RNC_Empresa;
	private String Pais;
	private String CodPostal;
	private String Direccion;
	private String AreaDeTrabajo;
	private String Numero_Telefono;
	
	public Empresa(String nombreEmpresa, String rNC_Empresa, String pais, String codPostal, String direccion,
			String areaDeTrabajo, String numero_Telefono) {
		super();
		NombreEmpresa = nombreEmpresa;
		RNC_Empresa = rNC_Empresa;
		Pais = pais;
		CodPostal = codPostal;
		Direccion = direccion;
		AreaDeTrabajo = areaDeTrabajo;
		Numero_Telefono = numero_Telefono;
	}

	public String getNombreEmpresa() {
		return NombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		NombreEmpresa = nombreEmpresa;
	}

	public String getRNC_Empresa() {
		return RNC_Empresa;
	}

	public void setRNC_Empresa(String rNC_Empresa) {
		RNC_Empresa = rNC_Empresa;
	}

	public String getPais() {
		return Pais;
	}

	public void setPais(String pais) {
		Pais = pais;
	}

	public String getCodPostal() {
		return CodPostal;
	}

	public void setCodPostal(String codPostal) {
		CodPostal = codPostal;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getAreaDeTrabajo() {
		return AreaDeTrabajo;
	}

	public void setAreaDeTrabajo(String areaDeTrabajo) {
		AreaDeTrabajo = areaDeTrabajo;
	}

	public String getNumero_Telefono() {
		return Numero_Telefono;
	}

	public void setNumero_Telefono(String numero_Telefono) {
		Numero_Telefono = numero_Telefono;
	}
	
	
	
	
	

}
