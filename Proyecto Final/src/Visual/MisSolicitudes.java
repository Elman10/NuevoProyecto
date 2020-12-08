package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logico.CrucialWork;
import Logico.Obrer0;
import Logico.Persona;
import Logico.SolicitudEmpleo;
import Logico.Tecnic0;
import Logico.Universitario;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class MisSolicitudes extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tbSolis;
	private JLabel lblNombre;
	private JLabel lblCedula;
	private JLabel lblTipo;
	private JLabel lblTelefono;
	private JLabel lblNewLabel_1;
	private JLabel lblCdula;
	private JLabel lblTipo_1;
	private JLabel lblTelefono_1;
	public static DefaultTableModel modelo;
	public static Object[] fila;
	
	
	//private ArrayList<SolicitudEmpleo>soli = new ArrayList<SolicitudEmpleo>();
	

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			MisSolicitudes dialog = new MisSolicitudes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public MisSolicitudes(String cedula) {
		setBounds(100, 100, 714, 507);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(MisSolicitudes.class.getResource("/Img/BarraInferiorr.png")));
			lblNewLabel.setBounds(0, 0, 696, 40);
			contentPanel.add(lblNewLabel);
		}
		
		JPanel DatosP = new JPanel();
		DatosP.setBackground(Color.WHITE);
		DatosP.setBorder(new TitledBorder(null, "Datos Personales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		DatosP.setBounds(10, 53, 193, 394);
		contentPanel.add(DatosP);
		DatosP.setLayout(null);
		
		lblNombre = new JLabel("New label");
		lblNombre.setBounds(36, 51, 113, 34);
		DatosP.add(lblNombre);
		
		lblCedula = new JLabel("New label");
		lblCedula.setBounds(36, 136, 113, 34);
		DatosP.add(lblCedula);
		
		lblTipo = new JLabel("New label");
		lblTipo.setBounds(36, 221, 113, 34);
		DatosP.add(lblTipo);
		
		lblTelefono = new JLabel("New label");
		lblTelefono.setBounds(36, 306, 113, 34);
		DatosP.add(lblTelefono);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(215, 53, 469, 394);
		contentPanel.add(scrollPane);
		
		ArrayList<Persona> person = new ArrayList<Persona>();
		person.add(CrucialWork.getInstance().buscarPersona(cedula));
		
		for(Persona p : person) {
			lblNombre.setText(p.getNombre()+" "+p.getApellido());
			lblCedula.setText(p.getCedula());
			if(p instanceof Obrer0) {
				lblTipo.setText("Obrero");
			} if(p instanceof Universitario) 
				lblTipo.setText("Universitario");
			if(p instanceof Tecnic0)
				lblTipo.setText("Tecnico");
			lblTelefono.setText(p.getTelefono());
		}
		
		
		
		lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(36, 38, 56, 16);
		DatosP.add(lblNewLabel_1);
		
		lblCdula = new JLabel("Cedula");
		lblCdula.setBounds(36, 123, 56, 16);
		DatosP.add(lblCdula);
		
		lblTipo_1 = new JLabel("Tipo:");
		lblTipo_1.setBounds(36, 209, 56, 16);
		DatosP.add(lblTipo_1);
		
		lblTelefono_1 = new JLabel("Telefono:");
		lblTelefono_1.setBounds(36, 291, 56, 16);
		DatosP.add(lblTelefono_1);
		
		modelo = new DefaultTableModel();
		String[] columns = {"Cedula","Tipo","Salario Minimo","Disp. Viaje","Estado de la Solicitud"};
		modelo.setColumnIdentifiers(columns);
		tbSolis = new JTable();
		scrollPane.setViewportView(tbSolis);
		tbSolis.setModel(modelo);
		
		
		 CargarTabla(cedula);
		}
		

	private void CargarTabla(String cedula) {
		ArrayList<SolicitudEmpleo>soli = new ArrayList<SolicitudEmpleo>();
		modelo.setRowCount(0);
		fila = new Object[modelo.getColumnCount()];
		soli.add(CrucialWork.getInstance().buscarSolicitud(cedula));
		for(SolicitudEmpleo e : soli) {
			if(e != null) {
				fila[0] = e.getId();
				fila[2] = e.getSalarioMinimo();
				if(e.getPersona() instanceof Obrer0) {
					fila[1] = "Obrero";
				}else if(e.getPersona() instanceof Universitario) {
					fila[1] = "Universitario";
				}else if(e.getPersona() instanceof Tecnic0) {
					fila[1] = "Tecnico";
				}
				if(e.isDispViaje() != false) {
					fila[3] = "Sí";
				}else fila[3] = "No";
				if(e.isEstado() != false) {
					fila[4] = "Aceptado";
				}else fila[4] = "Pendiente";
				modelo.addRow(fila);
			}
		}
		
	}
}
