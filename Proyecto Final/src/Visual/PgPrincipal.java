package Visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;



public class PgPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PgPrincipal frame = new PgPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PgPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(PgPrincipal.class.getResource("/Img/Logo_CW.png")));
		setResizable(false);
		setTitle("CRUCIAL WORK");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1070, 750);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmIniSesion = new JMenuItem("Iniciar Sesión");
		mntmIniSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login log = new Login();
				log.setVisible(true);
				dispose();
			}
		});
		menuBar.add(mntmIniSesion);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(517, 85, 8, 534);
		panel.add(separator);
		
		JButton btnSolicitar = new JButton("Solicitar");
		btnSolicitar.setBackground(Color.WHITE);
		btnSolicitar.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		btnSolicitar.setBounds(164, 500, 163, 39);
		panel.add(btnSolicitar);
		
		JButton btnAgregar = new JButton("Añadir Empresa");
		btnAgregar.setBackground(Color.WHITE);
		btnAgregar.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
		btnAgregar.setBounds(729, 500, 163, 39);
		panel.add(btnAgregar);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(PgPrincipal.class.getResource("/Img/PgPrincipal_Model2.png")));
		lblFondo.setBounds(0, 0, 1054, 705);
		panel.add(lblFondo);
	}
}
