package Logico;

import java.util.ArrayList;
import java.io.Serializable;



public class CrucialWork implements Serializable {
	
	private ArrayList<Persona>p;
	private ArrayList<Empresa>e;
	public static CrucialWork c = new CrucialWork();
	public static int cont_p = 0;
	public static int cont_e = 0;
	
	private static final long serialVersionUID = 1L;
	private static CrucialWork control;
	private static Persona loginPersona;
	
	private CrucialWork() {
		super();
		this.p = new ArrayList<>();
		this.e = new ArrayList<>();
		
	}


	
	public static CrucialWork getControl() {
		return control;
	}
	
	public static Persona getLoginUser() {
		return loginPersona;
	}

	public static void setLoginUser(Persona LoginPersona) {
		CrucialWork.loginPersona = LoginPersona;
	}


	public static void setControl(CrucialWork control) {
		CrucialWork.control = control;
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

	public boolean confirmarUsuario(String Nombre, String Contraseña) {
		boolean login = false;
		for (Persona Persona : p) {
			if(Persona.getNombre().equals(Nombre) && Persona.getCedula().equals(Contraseña)){
				loginPersona = Persona;
				login = true;
			}
		}
		return login;
	}
	
	
	
}
