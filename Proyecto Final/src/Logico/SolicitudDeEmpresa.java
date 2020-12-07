package Logico;

public class SolicitudDeEmpresa {
	
	private String id;
	private Empresa empresa;
	private String tipo_empleado;
	private String cantidad;
	private String salarioMinimo;
	private boolean estado;
	private boolean dispViaje;
	/*public SolicitudDeEmpresa(String id, String tipo_empleado, String cantidad, String salarioMinimo,
			boolean estado, Empresa empresa) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.tipo_empleado = tipo_empleado;
		this.cantidad = cantidad;
		this.salarioMinimo = salarioMinimo;
		this.estado = estado;
	}*/
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public String getTipoDeEmpleado() {
		return tipo_empleado;
	}
	public void setTipoDeEmpleado(String tipo_empleado) {
		this.tipo_empleado = tipo_empleado;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getSalarioMinimo() {
		return salarioMinimo;
	}
	public void setSalarioMinimo(String salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
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
	public SolicitudDeEmpresa(String id, Empresa empresa, String tipo_empleado, String cantidad, String salarioMinimo,
			boolean estado, boolean dispViaje) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.tipo_empleado = tipo_empleado;
		this.cantidad = cantidad;
		this.salarioMinimo = salarioMinimo;
		this.estado = estado;
		this.dispViaje = dispViaje;
	}
	
	
	
	
	

}
