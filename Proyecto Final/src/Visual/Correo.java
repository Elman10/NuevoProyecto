package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Logico.CorreoPersona;
import Logico.CrucialWork;
import Logico.Empresa;
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
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Correo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tbCorreo;
	public static DefaultTableModel modelo;
	public static Object[] fila;
	private JLabel lblNommbre;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			Correo dialog = new Correo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Correo(String cedula) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Correo.class.getResource("/Img/MiniLogo.png")));
		setBounds(100, 100, 706, 581);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(Correo.class.getResource("/Img/BarraInferiorr.png")));
			lblNewLabel.setBounds(0, 0, 688, 40);
			contentPanel.add(lblNewLabel);
		}
		{
			JPanel Buscar = new JPanel();
			Buscar.setBackground(Color.WHITE);
			Buscar.setBounds(10, 53, 666, 106);
			contentPanel.add(Buscar);
			Buscar.setLayout(null);
			{
				JLabel lblNewLabel_1 = new JLabel("BANDEJA DE ENTRADA:");
				lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
				lblNewLabel_1.setBounds(12, 23, 366, 46);
				Buscar.add(lblNewLabel_1);
			}
			{
				ArrayList<Persona> aux = new ArrayList<Persona>();
				aux.add(CrucialWork.getInstance().buscarPersona(cedula));
				lblNommbre = new JLabel("New label");
				lblNommbre.setFont(new Font("Tahoma", Font.BOLD, 20));
				for(Persona p : aux) {
					lblNommbre.setText(p.getNombre()+" "+p.getApellido());
				}
				
				lblNommbre.setBounds(389, 23, 265, 46);
				Buscar.add(lblNommbre);
			}
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 172, 664, 304);
			contentPanel.add(scrollPane);
			{
				modelo = new DefaultTableModel();
				String[] columns = {"RNC","Nombre","Preferencia"};
				modelo.setColumnIdentifiers(columns);
				tbCorreo = new JTable();
				scrollPane.setViewportView(tbCorreo);
				tbCorreo.setModel(modelo);
			}
		}
		{
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.setBackground(Color.WHITE);
			btnAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SolicitudEmpleo se = null;
					se = CrucialWork.getInstance().buscarSolicitud(cedula);
					se.setEstado(true);
					if(se.getPersona() instanceof Obrer0) {
						CrucialWork.ob++;
						//System.out.println("Sumando ob.."+CrucialWork.ob);
					}else if(se.getPersona() instanceof Universitario) { CrucialWork.uni++; 
					//System.out.println("Sumando uni.."+CrucialWork.uni);
					}
					else if(se.getPersona() instanceof Tecnic0) { CrucialWork.tec++; 
					//System.out.println("Sumando tec.. Cant: "+CrucialWork.tec);
					}
					
					/*ArrayList<Persona> aux = new ArrayList<Persona>();
					aux.add(CrucialWork.getInstance().buscarPersona(cedula));
					for(Persona p : aux) {
						if(p != null) {
							if(p.getGenero().equalsIgnoreCase("Hombre")){
								
							}
						}
					}*/
					/*if(se.getPersona().getGenero().equalsIgnoreCase("Hombre")) { CrucialWork.hombre++; System.out.println("Sumando hombre.. Cant: "+CrucialWork.hombre);}
					else if(se.getPersona().getGenero().equalsIgnoreCase("Mujer")) {CrucialWork.mujer++; System.out.println("Sumando mujer.. Cant: "+CrucialWork.mujer);}
					else System.out.println("ERROR404");*/
					
					
					
				}
			});
			btnAceptar.setBounds(437, 489, 97, 25);
			contentPanel.add(btnAceptar);
		}
		{
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.setForeground(Color.WHITE);
			btnCancelar.setBackground(Color.RED);
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SolicitudEmpleo se = null;
					se = CrucialWork.getInstance().buscarSolicitud(cedula);
					se.setEstado(false);
					dispose();
				}
			});
			btnCancelar.setBounds(546, 489, 97, 25);
			contentPanel.add(btnCancelar);
		}
		CargarTabla(cedula);
		
		
	}

	private void CargarTabla(String cedula) {
		ArrayList<CorreoPersona>aux = new ArrayList<CorreoPersona>();
		modelo.setRowCount(0);
		fila = new Object[modelo.getColumnCount()];
		aux.add(CrucialWork.getInstance().buscarCorreo(cedula));
		for(CorreoPersona cp : aux) {
			if(cp != null) {
				fila[0] = cp.getEmpresa().getRnc_Empresa();
				fila[1] = cp.getEmpresa().getNombreEmpresa();
				fila[2] = cp.getEmpresa().getAreaDeTrabajo();
				
				modelo.addRow(fila);
			}
			
		}
		
	}
}
