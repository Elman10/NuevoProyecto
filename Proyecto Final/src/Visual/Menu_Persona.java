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
import Logico.Persona;

import javax.swing.UIManager;
import javax.swing.JTextField;

public class Menu_Persona extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private int i = 0;
	//String[] aux = new String[CrucialWork.getInstance().getP().size()]();
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Menu_Persona(String cedula) {
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
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(12, 13, 798, 497);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblMiniLogo_1 = new JLabel("");
		lblMiniLogo_1.setIcon(new ImageIcon(Menu_Persona.class.getResource("/Img/MiniLogo.png")));
		lblMiniLogo_1.setBounds(12, 13, 50, 50);
		panel.add(lblMiniLogo_1);
		
		txtNombre = new JTextField();
		//txtNombre.setText(""+CrucialWork.getInstance().getP().get(i).getNombre());
		txtNombre.setBackground(Color.WHITE);
		txtNombre.setEditable(false);
		txtNombre.setBounds(512, 26, 249, 25);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
	}
}
