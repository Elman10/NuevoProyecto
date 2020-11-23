package Logico;

import java.util.ArrayList;

public class CrucialWork {
	
	ArrayList<Persona>p;
	ArrayList<Empresa>e;
	public static CrucialWork c;
	public static int cont_p = 0;
	public static int cont_e = 0;
	
	private CrucialWork() {
		super();
		this.p = new ArrayList<>();
		this.e = new ArrayList<>();
	}
	
	
	public ArrayList<Persona> getP() {
		return p;
	}
	public void setP(ArrayList<Persona> p) {
		this.p = p;
	}

	public ArrayList<Empresa> getE() {
		return e;
	}

	public void setE(ArrayList<Empresa> e) {
		this.e = e;
	}

	public static CrucialWork getInstance(){
		
		if(c == null) {
			c = new CrucialWork();
		}
		
		return c;
	}
	
	public void insertPerson(Persona persona) {
		p.add(persona);
		cont_p++;
	}
	
	public void insertEmpresa(Empresa empresa) {
		e.add(empresa);
		cont_e++;
	}
	
	public int buscarPersona(String cedula) {
		int pos = 0;
		pos = p.indexOf(cedula);
		return pos;
	}
	
	
}
