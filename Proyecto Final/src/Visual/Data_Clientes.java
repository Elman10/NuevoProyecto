package Visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import Logico.CrucialWork;
import Logico.Obrer0;
import Logico.Persona;
import Logico.Universitario;

import java.awt.Font;



public class Data_Clientes extends JDialog {
	
	private JTextField txtNombre;
	private JTextField txtCedula;
	private JTextField txtApellido;
	private JTextField txtCodigoZIP;
	private JTextField txtTelefono;
	private JTextField txtHabilidades;
	private JTextField txtIdioma;
	private JTextField txtUniversidad;
	private JTextField txtAreas;
	private JPanel Obrero;
	private JPanel Universidad;
	private JPanel Tecnico;
	private JScrollPane scrollPane;
	private JRadioButton rdbtnObrero;
	private JRadioButton rdbtnUniversitario;
	private JRadioButton rdbtnTecnico;
	private JComboBox cbxGenero;
	private JLabel lblTelefono;
	private JTextArea txtArea;
	private JComboBox cbxCarrera;
	private JComboBox cbxEstadoC;
	public static Persona p = null;
	public static CrucialWork c = null;
	private ArrayList<String> aux = new ArrayList<String>();

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Data_Clientes dialog = new Data_Clientes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Data_Clientes() {
		setUndecorated(true);
		setBounds(100, 100, 758, 620);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 762, 623);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBackground(Color.WHITE);
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setIcon(new ImageIcon(Data_Clientes.class.getResource("/Img/BarraInferiorr.png")));
				lblNewLabel.setBounds(-106, 0, 1151, 40);
				panel.add(lblNewLabel);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("");
				lblNewLabel_1.setIcon(new ImageIcon(Data_Clientes.class.getResource("/Img/BarraVertical.png")));
				lblNewLabel_1.setBounds(0, 38, 40, 1045);
				panel.add(lblNewLabel_1);
			}
			{
				JPanel Recoger_Datos_Panel = new JPanel();
				Recoger_Datos_Panel.setBorder(new TitledBorder(null, "Datos Personales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				Recoger_Datos_Panel.setBackground(Color.WHITE);
				Recoger_Datos_Panel.setBounds(58, 54, 688, 547);
				panel.add(Recoger_Datos_Panel);
				Recoger_Datos_Panel.setLayout(null);
				{
					JLabel lblNombre = new JLabel("*Nombre(s): ");
					lblNombre.setBounds(27, 41, 82, 16);
					Recoger_Datos_Panel.add(lblNombre);
				}
				
				txtNombre = new JTextField();
				txtNombre.setBounds(115, 38, 148, 22);
				Recoger_Datos_Panel.add(txtNombre);
				txtNombre.setColumns(10);
				
				JLabel lblCedula = new JLabel("*Cedula:");
				lblCedula.setBounds(27, 70, 82, 16);
				Recoger_Datos_Panel.add(lblCedula);
				
				txtCedula = new JTextField();
				txtCedula.setColumns(10);
				txtCedula.setBounds(115, 67, 148, 22);
				Recoger_Datos_Panel.add(txtCedula);
				
				JLabel lblApellidos = new JLabel("*Apellido(s):");
				lblApellidos.setBounds(275, 41, 82, 16);
				Recoger_Datos_Panel.add(lblApellidos);
				
				txtApellido = new JTextField();
				txtApellido.setColumns(10);
				txtApellido.setBounds(361, 38, 148, 22);
				Recoger_Datos_Panel.add(txtApellido);
				
				JLabel lblPais = new JLabel("*País:");
				lblPais.setBounds(27, 99, 82, 16);
				Recoger_Datos_Panel.add(lblPais);
				
				JComboBox cbxPais = new JComboBox();
				cbxPais.setModel(new DefaultComboBoxModel(new String[] {"Elige tu país...", "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bisáu", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo", "República Democrática del Congo", "República Dominicana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue"}));
				cbxPais.setBounds(115, 96, 148, 22);
				Recoger_Datos_Panel.add(cbxPais);
				
				JLabel lblCodPostal = new JLabel("*Código ZIP:");
				lblCodPostal.setBounds(275, 99, 82, 16);
				Recoger_Datos_Panel.add(lblCodPostal);
				
				txtCodigoZIP = new JTextField();
				txtCodigoZIP.setColumns(10);
				txtCodigoZIP.setBounds(361, 96, 148, 22);
				Recoger_Datos_Panel.add(txtCodigoZIP);
				
				lblTelefono = new JLabel("*Teléfono:");
				lblTelefono.setBounds(27, 128, 82, 16);
				Recoger_Datos_Panel.add(lblTelefono);
				
				txtTelefono = new JTextField();
				txtTelefono.setColumns(10);
				txtTelefono.setBounds(115, 125, 148, 22);
				Recoger_Datos_Panel.add(txtTelefono);
				
				JLabel lblGnero = new JLabel("*Género:");
				lblGnero.setBounds(27, 157, 82, 16);
				Recoger_Datos_Panel.add(lblGnero);
				
				cbxGenero = new JComboBox();
				cbxGenero.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Hombre ", "Mujer"}));
				cbxGenero.setBounds(115, 154, 148, 22);
				Recoger_Datos_Panel.add(cbxGenero);
				
				JLabel lblEstadoCivil = new JLabel("*Estado Civil:");
				lblEstadoCivil.setBounds(275, 157, 82, 16);
				Recoger_Datos_Panel.add(lblEstadoCivil);
				
				JSeparator separator = new JSeparator();
				separator.setBounds(12, 228, 664, 2);
				Recoger_Datos_Panel.add(separator);
				
				rdbtnObrero = new JRadioButton("Obrero");
				rdbtnObrero.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Obrero.setVisible(true);
						scrollPane.setVisible(true);
						Universidad.setVisible(false);
						Tecnico.setVisible(false);
						rdbtnObrero.setSelected(true);
						rdbtnUniversitario.setSelected(false);
						rdbtnTecnico.setSelected(false);
					}
				});
				rdbtnObrero.setSelected(true);
				rdbtnObrero.setBackground(Color.WHITE);
				rdbtnObrero.setBounds(47, 252, 127, 25);
				Recoger_Datos_Panel.add(rdbtnObrero);
				
				rdbtnUniversitario = new JRadioButton("Universitario");
				rdbtnUniversitario.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Obrero.setVisible(false);
						scrollPane.setVisible(false);
						Universidad.setVisible(true);
						Tecnico.setVisible(false);
						rdbtnObrero.setSelected(false);
						rdbtnUniversitario.setSelected(true);
						rdbtnTecnico.setSelected(false);
						txtUniversidad.setVisible(true);
					}
				});
				rdbtnUniversitario.setBackground(Color.WHITE);
				rdbtnUniversitario.setBounds(264, 252, 127, 25);
				Recoger_Datos_Panel.add(rdbtnUniversitario);
				
				rdbtnTecnico = new JRadioButton("Técnico");
				rdbtnTecnico.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Obrero.setVisible(false);
						scrollPane.setVisible(true);
						Universidad.setVisible(false);
						Tecnico.setVisible(true);
						rdbtnObrero.setSelected(false);
						rdbtnUniversitario.setSelected(false);
						rdbtnTecnico.setSelected(true);
					}
				});
				rdbtnTecnico.setBackground(Color.WHITE);
				rdbtnTecnico.setBounds(488, 252, 127, 25);
				Recoger_Datos_Panel.add(rdbtnTecnico);
				
				scrollPane = new JScrollPane();
				scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
				scrollPane.setBounds(35, 390, 266, 92);
				Recoger_Datos_Panel.add(scrollPane);
				
				txtArea = new JTextArea();
				txtArea.setLineWrap(true);
				scrollPane.setViewportView(txtArea);
				
				Obrero = new JPanel();
				Obrero.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				Obrero.setBackground(Color.WHITE);
				Obrero.setBounds(12, 290, 664, 216);
				Recoger_Datos_Panel.add(Obrero);
				Obrero.setLayout(null);
				
				JLabel lblHabilidades = new JLabel("Habilidad(es):");
				lblHabilidades.setBounds(23, 43, 85, 16);
				Obrero.add(lblHabilidades);
				
				txtHabilidades = new JTextField();
				txtHabilidades.setColumns(10);
				txtHabilidades.setBounds(118, 40, 148, 22);
				Obrero.add(txtHabilidades);
				
				JButton btnAgregar = new JButton("Añadir otra habilidad");
				btnAgregar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						aux.add(txtHabilidades.getText());
						txtHabilidades.setText("");
					}
				});
				btnAgregar.setBackground(Color.WHITE);
				btnAgregar.setBounds(289, 40, 169, 22);
				Obrero.add(btnAgregar);
				
				JLabel lblExperienci = new JLabel("Experiencia Laboral:");
				lblExperienci.setBounds(23, 74, 122, 16);
				Obrero.add(lblExperienci);
				
				JLabel lblMiniLogo = new JLabel("");
				lblMiniLogo.setBounds(602, 153, 50, 50);
				Obrero.add(lblMiniLogo);
				lblMiniLogo.setIcon(new ImageIcon(Data_Clientes.class.getResource("/Img/MiniLogo.png")));
				
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnCancelar.setForeground(Color.WHITE);
				btnCancelar.setBackground(Color.RED);
				btnCancelar.setBounds(579, 509, 97, 25);
				Recoger_Datos_Panel.add(btnCancelar);
				
				JButton btnRegistrar = new JButton("Registrar");
				btnRegistrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Persona person = null;
						if(rdbtnObrero.isSelected()) {
							person = new Obrer0(txtNombre.getText(), txtApellido.getText(), txtCedula.getText(), cbxPais.getSelectedItem().toString(), txtTelefono.getText(), cbxEstadoC.getSelectedItem().toString(),
									txtCodigoZIP.getText(), cbxGenero.getSelectedItem().toString(), txtCedula.getText(), aux, txtArea.getText());
						}
						CrucialWork.getInstance().insertPerson(person);
						/*if(cbxGenero.getSelectedItem().toString().equalsIgnoreCase("Otros...")) {
							
							if(rdbtnObrero.isSelected() || txtNombre.getText().isEmpty() || 
									txtApellido.getText().isEmpty() ||  txtCedula.getText().isEmpty()  ||
									txtCodigoZIP.getText().isEmpty() || txtTelefono.getText().isEmpty() || cbxEstadoC.getSelectedItem().toString().equalsIgnoreCase("<Seleccione>") ||
									txtOtros.getText().equalsIgnoreCase("<Genero>") || txtOtros.getText().isEmpty()) {
								if(txtArea.getText().isEmpty()) {
									JOptionPane.showMessageDialog(null, "Faltan campos por completar.");
								}
							}else {
								p =  new Universitario(txtNombre.getText(),txtApellido.getText(),txtCedula.getText(),
										cbxPais.getSelectedItem().toString(),txtTelefono.getText(),cbxEstadoC.getSelectedItem().toString(),
										txtCodigoZIP.getText(),cbxGenero.getSelectedItem().toString(),null, "Ing. Sistema");
								
							}
							if(rdbtnUniversitario.isSelected()  || txtNombre.getText().isEmpty() || 
									txtApellido.getText().isEmpty() ||  txtCedula.getText().isEmpty()  ||
									txtCodigoZIP.getText().isEmpty() || txtTelefono.getText().isEmpty() || cbxEstadoC.getSelectedItem().toString().equalsIgnoreCase("<Seleccione>") ||
									txtOtros.getText().equalsIgnoreCase("<Genero>") || txtOtros.getText().isEmpty()) {
								
								if(txtUniversidad.getText().isEmpty() || cbxCarrera.getSelectedItem().toString().equalsIgnoreCase("<Seleccione su carrera>")) {
									JOptionPane.showMessageDialog(null, "Faltan campos por completar.");
								}
							}
							if(rdbtnTecnico.isSelected() || txtNombre.getText().isEmpty() || 
									txtApellido.getText().isEmpty() ||  txtCedula.getText().isEmpty()  ||
									txtCodigoZIP.getText().isEmpty() || txtTelefono.getText().isEmpty() || cbxEstadoC.getSelectedItem().toString().equalsIgnoreCase("<Seleccione>") ||
									txtOtros.getText().equalsIgnoreCase("<Genero>") || txtOtros.getText().isEmpty()) {
								if(txtArea.getText().isEmpty()) {
									JOptionPane.showMessageDialog(null, "Faltan campos por completar.");
								}
							}
						
						}else {
							if(rdbtnObrero.isSelected() || txtNombre.getText().isEmpty() || 
									txtApellido.getText().isEmpty() ||  txtCedula.getText().isEmpty()  ||
									txtCodigoZIP.getText().isEmpty() || txtTelefono.getText().isEmpty() || cbxEstadoC.getSelectedItem().toString().equalsIgnoreCase("<Seleccione>") ||
									cbxGenero.getSelectedItem().toString().equalsIgnoreCase("<Seleccione>")) {
								if(txtArea.getText().isEmpty()) {
									JOptionPane.showMessageDialog(null, "Faltan campos por completar.");
								}
							}
							if(rdbtnUniversitario.isSelected()  || txtNombre.getText().isEmpty() || 
									txtApellido.getText().isEmpty() ||  txtCedula.getText().isEmpty()  ||
									txtCodigoZIP.getText().isEmpty() || txtTelefono.getText().isEmpty() || cbxEstadoC.getSelectedItem().toString().equalsIgnoreCase("<Seleccione>") ||
									cbxGenero.getSelectedItem().toString().equalsIgnoreCase("<Seleccione>")) {
								
								if(txtUniversidad.getText().isEmpty() || cbxCarrera.getSelectedItem().toString().equalsIgnoreCase("<Seleccione su carrera>")) {
									JOptionPane.showMessageDialog(null, "Faltan campos por completar.");
								}
							}
							if(rdbtnTecnico.isSelected() || txtNombre.getText().isEmpty() || 
									txtApellido.getText().isEmpty() ||  txtCedula.getText().isEmpty()  ||
									txtCodigoZIP.getText().isEmpty() || txtTelefono.getText().isEmpty() || cbxEstadoC.getSelectedItem().toString().equalsIgnoreCase("<Seleccione>") ||
									cbxGenero.getSelectedItem().toString().equalsIgnoreCase("<Seleccione>")) {
								if(txtArea.getText().isEmpty()) {
									JOptionPane.showMessageDialog(null, "Faltan campos por completar.");
								}
							}
						}
						CrucialWork.getInstance().insertPerson(p);
						//Menu_Persona m = new Menu_Persona();
						//m.setVisible(true);
						//dispose();
						
					}*/
					}
				});
				btnRegistrar.setBackground(SystemColor.text);
				btnRegistrar.setForeground(Color.BLACK);
				btnRegistrar.setBounds(470, 509, 97, 25);
				Recoger_Datos_Panel.add(btnRegistrar);
				
				Universidad = new JPanel();
				Universidad.setBackground(Color.WHITE);
				Universidad.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				Universidad.setBounds(12, 290, 664, 216);
				Recoger_Datos_Panel.add(Universidad);
				Universidad.setLayout(null);
				
				JLabel lblIdioma = new JLabel("Idioma(s):");
				lblIdioma.setBounds(23, 43, 85, 16);
				Universidad.add(lblIdioma);
				
				txtIdioma = new JTextField();
				txtIdioma.setBounds(118, 40, 148, 22);
				Universidad.add(txtIdioma);
				txtIdioma.setColumns(10);
				
				JButton btnAgregarId = new JButton("Agregar otro idioma");
				btnAgregarId.setBackground(Color.WHITE);
				btnAgregarId.setBounds(289, 40, 169, 22);
				Universidad.add(btnAgregarId);
				
				JLabel lblUniversidad = new JLabel("Universidad:");
				lblUniversidad.setBounds(23, 110, 85, 16);
				Universidad.add(lblUniversidad);
				
				txtUniversidad = new JTextField();
				txtUniversidad.setVisible(false);
				txtUniversidad.setBounds(118, 107, 148, 22);
				Universidad.add(txtUniversidad);
				txtUniversidad.setColumns(10);
				
				JLabel lblCarrera = new JLabel("Carrera:");
				lblCarrera.setBackground(Color.WHITE);
				lblCarrera.setBounds(23, 176, 85, 16);
				Universidad.add(lblCarrera);
				
				cbxCarrera = new JComboBox();
				cbxCarrera.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione su carrera>", "Dirección Empresarial", "Administración Hotelera", "Arquitectura", "Comunicación Social", "Derecho", "Diseño", "Interiorismo", "Ecología y Gestión Ambiental", "Economía", "Educación", "Estomatología", "Filosofía", "Gestión Financiera", "Editorial", "Ingeniería Civil", "Ingeniería Mecánica", "Ingeniería Eléctrica", "Ingeniería Industrial", "Ingeniería Mecatrónica", "Ingeniería en Sistemas y Computación", "Ingeniería Telemática", "Medicina", "Marketing", "Nutrición y Dietética", "Psicología", "Terapia", "Física", "Trabajo Social"}));
				cbxCarrera.setBounds(118, 173, 180, 22);
				Universidad.add(cbxCarrera);
				
				JLabel lblMiniLogo_1 = new JLabel("");
				lblMiniLogo_1.setIcon(new ImageIcon(Data_Clientes.class.getResource("/Img/MiniLogo.png")));
				lblMiniLogo_1.setBounds(602, 153, 50, 50);
				Universidad.add(lblMiniLogo_1);
				
				Tecnico = new JPanel();
				Tecnico.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				Tecnico.setBackground(Color.WHITE);
				Tecnico.setBounds(12, 290, 664, 216);
				Recoger_Datos_Panel.add(Tecnico);
				Tecnico.setLayout(null);
				
				JLabel lblArea = new JLabel("Area(s):");
				lblArea.setBounds(23, 43, 85, 16);
				Tecnico.add(lblArea);
				
				txtAreas = new JTextField();
				txtAreas.setBounds(118, 40, 148, 22);
				Tecnico.add(txtAreas);
				txtAreas.setColumns(10);
				
				JButton btnAgregarA = new JButton("Agregar otra área");
				btnAgregarA.setBackground(Color.WHITE);
				btnAgregarA.setBounds(289, 40, 169, 22);
				Tecnico.add(btnAgregarA);
				
				JLabel lblExperiencia = new JLabel("Experiencia Laboral:");
				lblExperiencia.setBounds(23, 74, 122, 16);
				Tecnico.add(lblExperiencia);
				
				JLabel lblMiniLogo_Tecnico = new JLabel("");
				lblMiniLogo_Tecnico.setIcon(new ImageIcon(Data_Clientes.class.getResource("/Img/MiniLogo.png")));
				lblMiniLogo_Tecnico.setBounds(602, 153, 50, 50);
				Tecnico.add(lblMiniLogo_Tecnico);
				
				JLabel lblAVISO = new JLabel("* llenar obligatorio");
				lblAVISO.setForeground(new Color(255, 0, 0));
				lblAVISO.setFont(new Font("Tahoma", Font.PLAIN, 10));
				lblAVISO.setBounds(579, 42, 97, 16);
				Recoger_Datos_Panel.add(lblAVISO);
				
				cbxEstadoC = new JComboBox();
				cbxEstadoC.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Casado/a", "Soltero/a"}));
				cbxEstadoC.setBounds(361, 154, 148, 22);
				Recoger_Datos_Panel.add(cbxEstadoC);
			}
		}
	}
}
