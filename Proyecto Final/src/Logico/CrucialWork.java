package Logico;

import java.util.ArrayList;

import Visual.Correo;

public class CrucialWork {
	
	private ArrayList<Persona>p;
	private ArrayList<Empresa>e;
	public static CrucialWork c = new CrucialWork();
	public static int cont_p = 0;
	public static int cont_e = 0;
	private ArrayList<SolicitudEmpleo>se;
	private ArrayList<SolicitudDeEmpresa>sde;
	private ArrayList<CorreoPersona>correo;
	private ArrayList<CorreoEmpresa>correoE;
	
	/*
	 * Contadores para revisar los gráficos...
	 */
	/*
	 * Grafico de barra donde se vea la cantidad de solicitudes satisfechas dependiendo del tipo de empleado. (obrero, universitario, tecnico)
	 */
	public static int ob = 0;
	public static int uni = 0;
	public static int tec = 0;
	/*
	 * Grafico de pastel donde se vea el porcentaje en funcion del sexo(Hombre, mujer)
	 */
	public static int hombre = 0;
	public static int mujer = 0;
	/*
	 * 
	 */
	private CrucialWork() {
		super();
		this.p = new ArrayList<>();
		this.e = new ArrayList<>();
		this.se = new ArrayList<>();
		this.sde = new ArrayList<>();
		this.correo = new ArrayList<>();
		this.correoE = new ArrayList<>();
	}
	
	
	public ArrayList<CorreoPersona> getCorreo() {
		return correo;
	}


	public void setCorreo(ArrayList<CorreoPersona> correo) {
		this.correo = correo;
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
	
	public ArrayList<SolicitudDeEmpresa> getSde() {
		return sde;
	}

	public void setSde(ArrayList<SolicitudDeEmpresa> sde) {
		this.sde = sde;
	}

	public ArrayList<SolicitudEmpleo> getSe() {
		return se;
	}

	public void setSe(ArrayList<SolicitudEmpleo> se) {
		this.se = se;
	}

	public ArrayList<CorreoEmpresa> getCorreoE() {
		return correoE;
	}


	public void setCorreoE(ArrayList<CorreoEmpresa> correoE) {
		this.correoE = correoE;
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
	public void insertSoliEmpresa(SolicitudDeEmpresa soli) {
		sde.add(soli);
	}
	public void insertarCorreo(CorreoPersona c) {
		correo.add(c);
	}
	public void insertarCorreoE(CorreoEmpresa ce) {
		correoE.add(ce);
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
	
	public Empresa loggin(String RNC, String password) {
		for(Empresa emp : e) {
			if(emp !=null) {
				if(emp.getRnc_Empresa().equals(RNC) && emp.getPassword().equals(password)) {
					return emp;
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
	
	public Empresa buscarEmpresa(String RNC) {
		for(Empresa emp : e) {
			if(emp != null) {
				if(emp.getRnc_Empresa().equalsIgnoreCase(RNC)) {
					return emp;
				}
			}
		}
		return null;
	}
	
	public SolicitudDeEmpresa buscarSolicitudE(String RNC) {
		for(SolicitudDeEmpresa soli : sde) {
			if(soli != null) {
				if(soli.getId().equalsIgnoreCase(RNC)) {
					return soli;
				}
			}
		}
		return null;
	}
	
	public CorreoPersona buscarCorreo(String cedula) {
		for(CorreoPersona ce : correo) {
			if(ce != null) {
				if(ce.getCedula().equalsIgnoreCase(cedula)) {
					return ce;
				}
			}
		}
		return null;
	}
	
	public CorreoEmpresa buscarCorreoE(String RNC) {
		for(CorreoEmpresa ce : correoE) {
			if(ce != null) {
				if(ce.getRnc().equalsIgnoreCase(RNC));
				return ce;
			}
		}
		return null;
	}
	
	
}
