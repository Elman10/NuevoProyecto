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
import javax.swing.JTextArea;

public class Menu_Persona extends JFrame {

	private JPanel contentPane;
	private JTextField txtCedula;
	private JTextField txtProfesion;
	private JTextField txtGenero;
	private JTextField txtTelefono;
	private JTextField txtPais;
	private JTextField txtCodigoZIP;
	private JTextField txtEstadoC;
	private JLabel lblNomm;
	private JScrollPane scrollPane;
	private JTextArea txtExp;
	private JPanel Universitario;
	private JPanel Tecnico;
	private JLabel lblUniversidad;
	private JTextField txtUni;
	private JTextField txtCarrera;
	private JPanel Obrero;
	private JLabel lblExp;
	private JTextArea txtExpe;
	private JButton btnSolicitud;
	private JButton btnCorreo;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 * @param aux 
	 */
	public Menu_Persona(Persona son) {
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
		
		
		
		JButton btnNewButton = new JButton("Cerrar Sesion");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PgPrincipal main = new PgPrincipal();
				main.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(633, 441, 131, 25);
		panel.add(btnNewButton);
		
		
		
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
		lblNomm.setBounds(86, 23, 678, 73);
		panel.add(lblNomm);
		
		Obrero = new JPanel();
		Obrero.setBorder(new TitledBorder(null, "Obrero", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		Obrero.setBackground(Color.WHITE);
		Obrero.setBounds(63, 257, 666, 168);
		panel.add(Obrero);
		Obrero.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Experiencia Laboral:");
		lblNewLabel.setBounds(36, 29, 129, 16);
		Obrero.add(lblNewLabel);
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(36, 58, 233, 86);
		Obrero.add(scrollPane);
		
		txtExp = new JTextArea();
		txtExp.setLineWrap(true);
		scrollPane.setViewportView(txtExp);
		
		Universitario = new JPanel();
		Universitario.setBorder(new TitledBorder(null, "Universitario", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		Universitario.setBackground(Color.WHITE);
		Universitario.setBounds(63, 257, 666, 168);
		panel.add(Universitario);
		Universitario.setLayout(null);
		
		lblUniversidad = new JLabel("Universidad:");
		lblUniversidad.setBounds(36, 29, 125, 16);
		Universitario.add(lblUniversidad);
		
		txtUni = new JTextField();
		txtUni.setBackground(Color.WHITE);
		txtUni.setEditable(false);
		txtUni.setBounds(36, 62, 150, 22);
		Universitario.add(txtUni);
		txtUni.setColumns(10);
		
		JLabel lblCarrera = new JLabel("Carrera:");
		lblCarrera.setBounds(240, 28, 125, 16);
		Universitario.add(lblCarrera);
		
		txtCarrera = new JTextField();
		txtCarrera.setEditable(false);
		txtCarrera.setBounds(240, 62, 250, 22);
		Universitario.add(txtCarrera);
		txtCarrera.setColumns(10);
		
		Tecnico = new JPanel();
		Tecnico.setBorder(new TitledBorder(null, "Tecnico", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		Tecnico.setBackground(Color.WHITE);
		Tecnico.setBounds(63, 257, 666, 168);
		panel.add(Tecnico);
		Tecnico.setLayout(null);
		
		lblExp = new JLabel("Experiencia Laboral:");
		lblExp.setBounds(36, 29, 129, 16);
		Tecnico.add(lblExp);
		
		txtExpe = new JTextArea();
		txtExpe.setBackground(Color.WHITE);
		txtExpe.setEditable(false);
		txtExpe.setLineWrap(true);
		txtExpe.setBounds(36, 58, 233, 86);
		Tecnico.add(txtExpe);
		
			
		//if(CrucialWork.getInstance().buscarPersona(cedula) != null) {
			/*for(Persona p : CrucialWork.getInstance().getP()) {
				lblNomm.setText(p.getNombre()+" "+p.getApellido());
				txtCedula.setText(p.getCedula());
				if(p instanceof Obrer0) {
					txtProfesion.setText("Obrero");
				}else if(p instanceof Universitario) {
					txtProfesion.setText("Universitario");
				}else if(p instanceof Tecnic0) {
					txtProfesion.setText("Tecnico");
				}
				txtGenero.setText(p.getGenero());
				txtTelefono.setText(p.getTelefono());
				txtCodigoZIP.setText(p.getCodigoZ());
				txtPais.setText(p.getPais());
				txtEstadoC.setText(p.getEstadoC());
			}*/
		//}
			
		lblNomm.setText(son.getNombre()+" "+son.getApellido());
		txtCedula.setText(son.getCedula());
		if(son instanceof Obrer0) {
			txtProfesion.setText("Obrero");
			//listHabilidades.setListData(((Obrer0) son).getHabilidades());
			txtExp.setText(((Obrer0) son).getExperiencia());
			Universitario.setVisible(false);
			Obrero.setVisible(true);
			Tecnico.setVisible(false);
		}else if(son instanceof Universitario) {
			txtProfesion.setText("Universitario");
			txtUni.setText(((Universitario) son).getUniversidad());
			txtCarrera.setText(((Universitario) son).getCarrera());
			Universitario.setVisible(true);
			Obrero.setVisible(false);
			Tecnico.setVisible(false);
		}else if(son instanceof Tecnic0) {
			txtProfesion.setText("Tecnico");
			txtExpe.setText(((Tecnic0) son).getExperiencia());
			Universitario.setVisible(false);
			Obrero.setVisible(false);
			Tecnico.setVisible(true);
		}
		txtGenero.setText(son.getGenero());
		txtTelefono.setText(son.getTelefono());
		txtCodigoZIP.setText(son.getCodigoZ());
		txtPais.setText(son.getPais());
		txtEstadoC.setText(son.getEstadoC());
		
		JButton btnMisSolis = new JButton("Mis Solicitudes");
		btnMisSolis.setBackground(Color.WHITE);
		btnMisSolis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MisSolicitudes ms = new MisSolicitudes(txtCedula.getText());
				ms.setVisible(true);
			}
		});
		btnMisSolis.setBounds(490, 441, 131, 25);
		panel.add(btnMisSolis);
		
		btnSolicitud = new JButton("Solicitar");
		btnSolicitud.setBackground(Color.WHITE);
		btnSolicitud.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Soli_Persona sp = new Soli_Persona(txtCedula.getText());
				sp.setVisible(true);
;			}
		});
		btnSolicitud.setBounds(385, 441, 97, 25);
		panel.add(btnSolicitud);
		
		btnCorreo = new JButton("Buzon ");
		btnCorreo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Correo c = new Correo(txtCedula.getText());
				c.setVisible(true);
				
			}
		});
		btnCorreo.setBackground(Color.WHITE);
		btnCorreo.setBounds(12, 441, 97, 25);
		panel.add(btnCorreo);
		
		JButton btnOfertas = new JButton("Ofertas");
		btnOfertas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				OfertasEmpleo oe = new OfertasEmpleo(txtCedula.getText());
				oe.setVisible(true);
			}
		});
		btnOfertas.setBackground(Color.WHITE);
		btnOfertas.setBounds(116, 441, 97, 25);
		panel.add(btnOfertas);
		
		
		
		
		
		
		
		
		
	}
}
