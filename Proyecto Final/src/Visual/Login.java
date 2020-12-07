package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import Logico.CrucialWork;
import Logico.Persona;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Login extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCedula;
	private JTextField txtContrasegna;
	private JTextField txtRNC;
	private JTextField txtContra;
	private JPanel Empresa;
	private JPanel Cliente;
	private JRadioButton rdbtnEmpresa;
	private JRadioButton rdbtnPersona;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the dialog.
	 */
	public Login() {
		setUndecorated(true);
		setBounds(100, 100, 518, 415);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		contentPanel.setBackground(SystemColor.controlLtHighlight);
		contentPanel.setBounds(0, 0, 518, 415);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			Cliente = new JPanel();
			Cliente.setBounds(12, 66, 494, 197);
			Cliente.setBackground(SystemColor.controlLtHighlight);
			Cliente.setBorder(new TitledBorder(null, "Iniciar Sesion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(Cliente);
			Cliente.setLayout(null);
			
			JLabel lblCedula = new JLabel("Cédula:");
			lblCedula.setFont(new Font("Arial Black", Font.ITALIC, 18));
			lblCedula.setBounds(59, 68, 88, 26);
			Cliente.add(lblCedula);
			
			txtCedula = new JTextField();
			txtCedula.setBounds(196, 68, 183, 26);
			Cliente.add(txtCedula);
			txtCedula.setColumns(10);
			
			JLabel lblContrasea = new JLabel("Contraseña:");
			lblContrasea.setFont(new Font("Arial Black", Font.ITALIC, 18));
			lblContrasea.setBounds(59, 118, 125, 26);
			Cliente.add(lblContrasea);
			
			txtContrasegna = new JTextField();
			txtContrasegna.setColumns(10);
			txtContrasegna.setBounds(196, 118, 183, 26);
			Cliente.add(txtContrasegna);
			
			JLabel lblAviso = new JLabel("**la contraseña es la cedula");
			lblAviso.setForeground(Color.RED);
			lblAviso.setBackground(Color.RED);
			lblAviso.setFont(new Font("Tahoma", Font.PLAIN, 9));
			lblAviso.setBounds(179, 168, 125, 16);
			Cliente.add(lblAviso);
		}
		
		rdbtnPersona = new JRadioButton("Persona");
		rdbtnPersona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Empresa.setVisible(false);
				Cliente.setVisible(true);
				rdbtnPersona.setSelected(true);
				rdbtnEmpresa.setSelected(false);
			}
		});
		rdbtnPersona.setSelected(true);
		rdbtnPersona.setBackground(SystemColor.controlLtHighlight);
		rdbtnPersona.setBounds(63, 24, 127, 25);
		contentPanel.add(rdbtnPersona);
		
		rdbtnEmpresa = new JRadioButton("Empresa");
		rdbtnEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Empresa.setVisible(true);
				Cliente.setVisible(false);
				rdbtnPersona.setSelected(false);
				rdbtnEmpresa.setSelected(true);
			}
		});
		rdbtnEmpresa.setBackground(SystemColor.controlLtHighlight);
		rdbtnEmpresa.setBounds(288, 24, 127, 25);
		contentPanel.add(rdbtnEmpresa);
		
		Empresa = new JPanel();
		Empresa.setBackground(SystemColor.controlLtHighlight);
		Empresa.setBorder(new TitledBorder(null, "Iniciar Sesi\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Empresa.setBounds(12, 66, 494, 197);
		contentPanel.add(Empresa);
		Empresa.setLayout(null);
		
		JLabel lblRNC = new JLabel("RNC:");
		lblRNC.setFont(new Font("Arial Black", Font.ITALIC, 18));
		lblRNC.setBounds(59, 68, 88, 26);
		Empresa.add(lblRNC);
		
		JLabel lblContra = new JLabel("Contraseña:");
		lblContra.setFont(new Font("Arial Black", Font.ITALIC, 18));
		lblContra.setBounds(59, 118, 125, 26);
		Empresa.add(lblContra);
		
		txtRNC = new JTextField();
		txtRNC.setBounds(196, 68, 183, 26);
		Empresa.add(txtRNC);
		txtRNC.setColumns(10);
		
		txtContra = new JTextField();
		txtContra.setBounds(196, 118, 183, 26);
		Empresa.add(txtContra);
		txtContra.setColumns(10);
		
		JLabel lblAvisso = new JLabel("**la contraseña es el RNC");
		lblAvisso.setForeground(Color.RED);
		lblAvisso.setBounds(179, 168, 125, 16);
		Empresa.add(lblAvisso);
		
		JButton btnLogin = new JButton("Iniciar Sesión");
		btnLogin.addActionListener(new ActionListener() {   // LOGIN COMPLETO, NO TOCAR CHICOS :)
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPersona.isSelected()) {
				if(CrucialWork.getInstance().login(txtCedula.getText(), txtContrasegna.getText()) != null) {
					Menu_Persona mn = new Menu_Persona(CrucialWork.getInstance().login(txtCedula.getText(), txtContrasegna.getText()));
					mn.setVisible(true);
					dispose();
				}
				else if(txtCedula.getText().isEmpty() && txtContrasegna.getText().isEmpty())
					JOptionPane.showMessageDialog(null, "Complete todos los campos.", "ERR0R404", JOptionPane.ERROR_MESSAGE);
				else if(CrucialWork.getInstance().login(txtCedula.getText(), txtContrasegna.getText()) == null)
					JOptionPane.showMessageDialog(null, "Cédula o Contraseña incorrecta(s) ", "ERR0R404", JOptionPane.ERROR_MESSAGE);
				}else if(rdbtnEmpresa.isSelected()) {
					if(CrucialWork.getInstance().loggin(txtRNC.getText(), txtContra.getText()) != null) {
						Menu_Empresa me = new Menu_Empresa(CrucialWork.getInstance().loggin(txtRNC.getText(),txtContra.getText()));
						me.setVisible(true);
						dispose();
					}else if(txtRNC.getText().isEmpty() && txtContra.getText().isEmpty()) 
						JOptionPane.showMessageDialog(null, "Complete todos los campos.", "ERR0R404", JOptionPane.ERROR_MESSAGE);
					else if(CrucialWork.getInstance().loggin(txtRNC.getText(), txtContra.getText()) == null)
						JOptionPane.showMessageDialog(null, "RNC o Contraseña incorrecta(s) ", "ERR0R404", JOptionPane.ERROR_MESSAGE);
				}
				 
			}
		});
		btnLogin.setBackground(SystemColor.menu);
		btnLogin.setBounds(170, 293, 169, 25);
		contentPanel.add(btnLogin);
		
		JButton btnReg = new JButton("Crear Cuenta/Empresa");
		btnReg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PgPrincipal main = new PgPrincipal();
				main.setVisible(true);
				dispose();
			}
		});
		btnReg.setBackground(SystemColor.menu);
		btnReg.setBounds(170, 331, 169, 25);
		contentPanel.add(btnReg);
	}
}
