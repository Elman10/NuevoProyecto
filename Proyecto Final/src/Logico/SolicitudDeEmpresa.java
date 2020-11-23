package Logico;

public class SolicitudDeEmpresa {
	
	private String Id;
	private Empresa empresa;
	private String TipoDeEmpleado;
	private int Cantidad;
	private float SalarioMinimo;
	private boolean Estado;	
	public SolicitudDeEmpresa(String id, Empresa empresa, String tipoDeEmpleado, int cantidad, float salarioMinimo,
			boolean estado) {
		super();
		Id = id;
		this.empresa = empresa;
		TipoDeEmpleado = tipoDeEmpleado;
		Cantidad = cantidad;
		SalarioMinimo = salarioMinimo;
		Estado = estado;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public String getTipoDeEmpleado() {
		return TipoDeEmpleado;
	}
	public void setTipoDeEmpleado(String tipoDeEmpleado) {
		TipoDeEmpleado = tipoDeEmpleado;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	public float getSalarioMinimo() {
		return SalarioMinimo;
	}
	public void setSalarioMinimo(float salarioMinimo) {
		SalarioMinimo = salarioMinimo;
	}
	public boolean isEstado() {
		return Estado;
	}
	public void setEstado(boolean estado) {
		Estado = estado;
	}
	
	
	
	

}
