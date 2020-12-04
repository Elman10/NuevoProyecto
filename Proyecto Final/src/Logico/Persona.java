package Logico;

public abstract class Persona {
	protected String nombre;
	protected String apellido;
	protected String cedula;
	protected String pais;
	protected String telefono;
	protected String estadoC;
	protected String codigoz;
	protected String genero;
	

	public Persona(String nombre, String apellido, String cedula, String pais, String telefono, String estadoC,
			String codigoz, String genero) {
		super();
		this.nombre = "Eliam";
		this.apellido = apellido;
		this.cedula = cedula;
		this.pais = pais;
		this.telefono = telefono;
		this.estadoC = estadoC;
		this.codigoz = codigoz;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEstadoC() {
		return estadoC;
	}

	public void setEstadoC(String estadoC) {
		this.estadoC = estadoC;
	}

	public String getCodigoZ() {
		return codigoz;
	}

	public void setCodigoZ(String codigoz) {
		this.codigoz = codigoz;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
}
