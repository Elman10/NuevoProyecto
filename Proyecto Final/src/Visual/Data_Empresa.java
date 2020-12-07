package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.border.TitledBorder;

import Logico.CrucialWork;
import Logico.Empresa;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Data_Empresa extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtRNC;
	private JTextField txtZIP;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JComboBox cbxPais;
	private JComboBox cbxArea;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			Data_Empresa dialog = new Data_Empresa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Data_Empresa() {
		setUndecorated(true);
		setBounds(100, 100, 574, 416);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(Data_Empresa.class.getResource("/Img/BarraVertical.png")));
			lblNewLabel.setBounds(533, -13, 40, 621);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(Data_Empresa.class.getResource("/Img/BarraInferiorr.png")));
			lblNewLabel_1.setBounds(-16, 0, 828, 40);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Datos de la Empresa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBackground(Color.WHITE);
			panel.setBounds(12, 53, 499, 313);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNombre = new JLabel("*Nombre de la Empresa:");
				lblNombre.setBounds(41, 46, 144, 22);
				panel.add(lblNombre);
			}
			{
				txtNombre = new JTextField();
				txtNombre.setBounds(197, 46, 228, 22);
				panel.add(txtNombre);
				txtNombre.setColumns(10);
			}
			{
				JLabel lblNewLabel_2 = new JLabel("*RNC de la empresa:");
				lblNewLabel_2.setBounds(41, 83, 144, 22);
				panel.add(lblNewLabel_2);
			}
			{
				txtRNC = new JTextField();
				txtRNC.setColumns(10);
				txtRNC.setBounds(197, 83, 228, 22);
				panel.add(txtRNC);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("*País:");
				lblNewLabel_3.setBounds(41, 118, 56, 22);
				panel.add(lblNewLabel_3);
			}
			
			cbxPais = new JComboBox();
			cbxPais.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bisáu", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo", "República Democrática del Congo", "República Dominicana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue"}));
			cbxPais.setBounds(197, 118, 228, 22);
			panel.add(cbxPais);
			
			JLabel lblZIP = new JLabel("*Código ZIP:");
			lblZIP.setBounds(41, 153, 144, 22);
			panel.add(lblZIP);
			
			txtZIP = new JTextField();
			txtZIP.setColumns(10);
			txtZIP.setBounds(197, 153, 228, 22);
			panel.add(txtZIP);
			
			JLabel lblDirrecion = new JLabel("*Dirección:");
			lblDirrecion.setBounds(41, 188, 144, 22);
			panel.add(lblDirrecion);
			{
				txtDireccion = new JTextField();
				txtDireccion.setColumns(10);
				txtDireccion.setBounds(197, 188, 228, 22);
				panel.add(txtDireccion);
			}
			{
				JLabel lblTelefono = new JLabel("*Telefono:");
				lblTelefono.setBounds(41, 223, 144, 22);
				panel.add(lblTelefono);
			}
			{
				txtTelefono = new JTextField();
				txtTelefono.setColumns(10);
				txtTelefono.setBounds(197, 223, 228, 22);
				panel.add(txtTelefono);
			}
			{
				JLabel lblArea = new JLabel("*Área de trabajo:");
				lblArea.setBounds(41, 258, 144, 22);
				panel.add(lblArea);
			}
			{
				cbxArea = new JComboBox();
				cbxArea.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Obrero", "Universitario", "Técnico"}));
				cbxArea.setBounds(197, 258, 228, 22);
				panel.add(cbxArea);
			}
		}
		{
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				dispose();
				}
			});
			btnCancelar.setBackground(Color.RED);
			btnCancelar.setForeground(Color.WHITE);
			btnCancelar.setBounds(414, 377, 97, 25);
			contentPanel.add(btnCancelar);
		}
		{
			JButton btnRegistrar = new JButton("Registrar");
			btnRegistrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Empresa emp = new Empresa(txtNombre.getText(),txtRNC.getText(),cbxPais.getSelectedItem().toString(),
							txtZIP.getText(),txtDireccion.getText(),cbxArea.getSelectedItem().toString(),txtTelefono.getText(),txtRNC.getText());
					CrucialWork.getInstance().insertEmpresa(emp);
					Menu_Empresa me = new Menu_Empresa(emp);
					me.setVisible(true);
					dispose();
				}
			});
			btnRegistrar.setBackground(Color.WHITE);
			btnRegistrar.setBounds(305, 378, 97, 25);
			contentPanel.add(btnRegistrar);
		}
	}
}
