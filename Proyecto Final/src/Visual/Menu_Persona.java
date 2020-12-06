package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;

import Logico.CrucialWork;
import Logico.Obrer0;
import Logico.Persona;
import Logico.Tecnic0;
import Logico.Universitario;

import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu_Persona extends JFrame {

	private JPanel contentPane;
	private int i = 0;
	private JTextField txtCedula;
	private JList listHabilidades;
	private JTextField txtProfesion;
	private JTextField txtGenero;
	private JTextField txtTelefono;
	private JTextField txtBuscar;
	private JTextField txtPais;
	private JTextField txtCodigoZIP;
	private JTextField txtEstadoC;
	private JLabel lblNomm;
	
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 * @param aux 
	 */
	public Menu_Persona(String cedula, ArrayList<String>aux) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 610);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVertical = new JLabel("");
		lblVertical.setIcon(new ImageIcon(Menu_Persona.class.getResource("/Img/BarraVertical.png")));
		lblVertical.setBounds(822, -11, 40, 1045);
		contentPane.add(lblVertical);
		
		JLabel lblHorizontal = new JLabel("");
		lblHorizontal.setIcon(new ImageIcon(Menu_Persona.class.getResource("/Img/BarraInferiorr.png")));
		lblHorizontal.setBounds(0, 523, 862, 40);
		contentPane.add(lblHorizontal);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos Personales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(12, 13, 798, 497);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblMiniLogo_1 = new JLabel("");
		lblMiniLogo_1.setIcon(new ImageIcon(Menu_Persona.class.getResource("/Img/MiniLogo.png")));
		lblMiniLogo_1.setBounds(12, 13, 50, 93);
		panel.add(lblMiniLogo_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(198, 378, 223, 106);
		panel.add(scrollPane);
		
		listHabilidades = new JList();
		scrollPane.setViewportView(listHabilidades);
		
		JLabel lblHabilidades = new JLabel("Habilidades:");
		lblHabilidades.setBounds(198, 357, 78, 16);
		panel.add(lblHabilidades);
		
		
		
		JButton btnNewButton = new JButton("Cerrar Sesión");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PgPrincipal main = new PgPrincipal();
				main.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(633, 441, 131, 25);
		panel.add(btnNewButton);
		
		txtBuscar = new JTextField();
		txtBuscar.setBounds(545, 405, 116, 22);
		panel.add(txtBuscar);
		txtBuscar.setColumns(10);
		
		
		
		JPanel AcercaDe = new JPanel();
		AcercaDe.setBorder(new TitledBorder(null, "Acerca de", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		AcercaDe.setBackground(Color.WHITE);
		AcercaDe.setBounds(63, 102, 666, 132);
		panel.add(AcercaDe);
		AcercaDe.setLayout(null);
		
		txtGenero = new JTextField();
		txtGenero.setBounds(331, 75, 116, 22);
		AcercaDe.add(txtGenero);
		txtGenero.setHorizontalAlignment(SwingConstants.RIGHT);
		txtGenero.setBackground(Color.WHITE);
		txtGenero.setEditable(false);
		txtGenero.setColumns(10);
		
		txtEstadoC = new JTextField();
		txtEstadoC.setBounds(497, 40, 116, 22);
		AcercaDe.add(txtEstadoC);
		txtEstadoC.setEditable(false);
		txtEstadoC.setHorizontalAlignment(SwingConstants.RIGHT);
		txtEstadoC.setBackground(Color.WHITE);
		txtEstadoC.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(497, 75, 116, 22);
		AcercaDe.add(txtTelefono);
		txtTelefono.setBackground(Color.WHITE);
		txtTelefono.setEditable(false);
		txtTelefono.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTelefono.setColumns(10);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(45, 40, 116, 22);
		AcercaDe.add(txtCedula);
		txtCedula.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCedula.setBackground(Color.WHITE);
		txtCedula.setEditable(false);
		txtCedula.setColumns(10);
		
		txtProfesion = new JTextField();
		txtProfesion.setBounds(45, 75, 116, 22);
		AcercaDe.add(txtProfesion);
		txtProfesion.setHorizontalAlignment(SwingConstants.RIGHT);
		txtProfesion.setBackground(Color.WHITE);
		txtProfesion.setEditable(false);
		txtProfesion.setColumns(10);
		
		txtPais = new JTextField();
		txtPais.setBounds(198, 40, 249, 22);
		AcercaDe.add(txtPais);
		txtPais.setBackground(Color.WHITE);
		txtPais.setEditable(false);
		txtPais.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPais.setColumns(10);
		
		txtCodigoZIP = new JTextField();
		txtCodigoZIP.setBounds(198, 75, 116, 22);
		AcercaDe.add(txtCodigoZIP);
		txtCodigoZIP.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCodigoZIP.setEditable(false);
		txtCodigoZIP.setBackground(Color.WHITE);
		txtCodigoZIP.setColumns(10);
		
		lblNomm = new JLabel("New label");
		lblNomm.setFont(new Font("Tahoma", Font.BOLD, 42));
		lblNomm.setBounds(86, 23, 427, 73);
		panel.add(lblNomm);
		
		
		if(CrucialWork.getInstance().buscarPersona(cedula) != null) {
			for(Persona p : CrucialWork.getInstance().getP()) {
				lblNomm.setText(p.getNombre()+" "+p.getApellido());
				txtCedula.setText(p.getCedula());
				if(p instanceof Obrer0) {
					txtProfesion.setText("Obrero");
				}else if(p instanceof Universitario) {
					txtProfesion.setText("Universitario");
				}else if(p instanceof Tecnic0) {
					txtProfesion.setText("Técnico");
				}
				txtGenero.setText(p.getGenero());
				txtTelefono.setText(p.getTelefono());
				txtCodigoZIP.setText(p.getCodigoZ());
				txtPais.setText(p.getPais());
				txtEstadoC.setText(p.getEstadoC());
				
			
			}
		}
		
			
		
		listHabilidades.setListData(aux.toArray());
		
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArrayList<Persona> person = new ArrayList<Persona>();
				person.add(CrucialWork.getInstance().buscarPersona(txtBuscar.getText()));
				
				for(Persona q : person) {
					lblNomm.setText(q.getNombre()+" "+q.getApellido());
					txtCedula.setText(q.getCedula());
					if(q instanceof Obrer0) {
						txtProfesion.setText("Obrero");
					}else if(q instanceof Universitario) {
						txtProfesion.setText("Universitario");
					}else if(q instanceof Tecnic0) {
						txtProfesion.setText("Técnico");
					}
					txtGenero.setText(q.getGenero());
					txtTelefono.setText(q.getTelefono());
					txtCodigoZIP.setText(q.getCodigoZ());
					txtPais.setText(q.getPais());
					txtEstadoC.setText(q.getEstadoC());
				}
				//for(Persona q : CrucialWork.getInstance().buscarPersona(txtBuscar.getText())) {
					
				//}
			}
		});
		btnBuscar.setBounds(673, 403, 97, 25);
		panel.add(btnBuscar);
		
		
		
		
		
	}
}
