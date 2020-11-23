package Logico;

public class SolicitudDeEmpresa {
	
	private String id;
	private Empresa empresa;
	private String tipo_empleado;
	private int cantidad;
	private float salarioMinimo;
	private boolean estado;	
	public SolicitudDeEmpresa(String id, Empresa empresa, String tipo_empleado, int cantidad, float salarioMinimo,
			boolean estado) {
		super();
		this.id = id;
		this.empresa = empresa;
		this.tipo_empleado = tipo_empleado;
		this.cantidad = cantidad;
		this.salarioMinimo = salarioMinimo;
		this.estado = estado;
	}
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
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getSalarioMinimo() {
		return salarioMinimo;
	}
	public void setSalarioMinimo(float salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
	

}
