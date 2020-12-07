package Logico;

import java.util.ArrayList;

public class CrucialWork {
	
	private ArrayList<Persona>p;
	private ArrayList<Empresa>e;
	public static CrucialWork c = new CrucialWork();
	public static int cont_p = 0;
	public static int cont_e = 0;
	private ArrayList<SolicitudEmpleo>se;
	
	private CrucialWork() {
		super();
		this.p = new ArrayList<>();
		this.e = new ArrayList<>();
		this.se = new ArrayList<>();
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
	
	

	public ArrayList<SolicitudEmpleo> getSe() {
		return se;
	}

	public void setSe(ArrayList<SolicitudEmpleo> se) {
		this.se = se;
	}

	public static CrucialWork getInstance(){
			return c;
	}
	
	
	public void insertPerson(Persona persona) {
		p.add(persona);
	}
	public void insertEmpresa(Empresa empresa) {
		e.add(empresa);
	}
	public boolean eliminarPerson(Persona person) {
		return p.remove(person);
	}
	public boolean eliminarEmpresa(Empresa empresa) {
		return e.remove(empresa);
	}
	public void insertSoli(SolicitudEmpleo soli) {
		se.add(soli);
	}
	
	public Persona buscarPersona(String cedula) {
		for(Persona person : p) {
			if(person != null) {
				if(person.getCedula().equalsIgnoreCase(cedula)) { 
					return person;
				}
			}
		}
		return null;
	}
	
	public Persona login(String cedula, String password) {
		for(Persona person : p) {
			if(person != null) {
				if(person.getCedula().equals(cedula) && person.getPassword().equals(password)) {
					return person;
				}
			}
		}
		return null;
	}
	
	public SolicitudEmpleo buscarSolicitud(String cedula) {
		for(SolicitudEmpleo soli : se) {
			if(soli != null) {
				if(soli.getId().equalsIgnoreCase(cedula)) {
					return soli;
				}
			}
		}
		return null;
	}
	
	
}
