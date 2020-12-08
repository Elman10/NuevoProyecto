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
import javax.swing.border.TitledBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import Logico.CrucialWork;



public class PgPrincipal extends JFrame {

	private JPanel contentPane;
	private static int suma = 0;
	private JPanel Graficos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					suma = CrucialWork.ob+CrucialWork.tec+CrucialWork.uni;
					
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
		setBounds(100, 100, 1366, 768);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(673, 49, 665, 622);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnAgregar = new JButton("AÑADIR EMPRESA");
		btnAgregar.setForeground(Color.WHITE);
		btnAgregar.setBounds(211, 176, 234, 53);
		panel_1.add(btnAgregar);
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Data_Empresa de = new Data_Empresa();
				de.setVisible(true);
				dispose();
			}
		});
		btnAgregar.setBackground(Color.RED);
		btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel = new JLabel("¡AÑADE TU EMPRESA CON NOSOTROS!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 31));
		lblNewLabel.setBounds(23, 27, 610, 93);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("¡ES GRATISS!");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1.setBounds(235, 100, 186, 53);
		panel_1.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(23, 325, 630, 7);
		panel_1.add(separator);
		
		JButton btnSolicitar = new JButton("SOLICITAR");
		btnSolicitar.setForeground(Color.WHITE);
		btnSolicitar.setBounds(211, 499, 234, 53);
		panel_1.add(btnSolicitar);
		btnSolicitar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Data_Clientes dt = new Data_Clientes();
				dt.setVisible(true);
				dispose();
			}
		});
		btnSolicitar.setBackground(Color.RED);
		btnSolicitar.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel_2 = new JLabel("¡SOLICITA EMPLEO CON NOSOTROS!");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 31));
		lblNewLabel_2.setBounds(34, 349, 588, 75);
		panel_1.add(lblNewLabel_2);
		
		JLabel label = new JLabel("¡ES GRATISS!");
		label.setFont(new Font("Tahoma", Font.BOLD, 26));
		label.setBounds(235, 430, 186, 53);
		panel_1.add(label);
		
		Graficos = new JPanel();
		Graficos.setBackground(Color.WHITE);
		Graficos.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Graficos.setBounds(52, 49, 609, 622);
		panel.add(Graficos);
		Graficos.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("DATOS SOBRE LA COMPAÑIA");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblNewLabel_6.setBounds(46, 40, 508, 67);
		Graficos.add(lblNewLabel_6);
		
		JButton btnGraficos = new JButton("VER DATOS");
		btnGraficos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GraficoBarra gb = new GraficoBarra();
				gb.setVisible(true);
				
			}
		});
		btnGraficos.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnGraficos.setBackground(Color.RED);
		btnGraficos.setForeground(Color.WHITE);
		btnGraficos.setBounds(210, 169, 181, 67);
		Graficos.add(btnGraficos);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 323, 585, 2);
		Graficos.add(separator_1);
		
		JLabel lblNewLabel_7 = new JLabel("¿TIENES UNA CUENTA?\r\n");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 38));
		lblNewLabel_7.setBounds(75, 349, 451, 75);
		Graficos.add(lblNewLabel_7);
		
		JLabel lbliniciaSesion = new JLabel("¡INICIA SESION!");
		lbliniciaSesion.setHorizontalAlignment(SwingConstants.CENTER);
		lbliniciaSesion.setFont(new Font("Tahoma", Font.BOLD, 32));
		lbliniciaSesion.setBounds(115, 419, 370, 75);
		Graficos.add(lbliniciaSesion);
		
		JButton btnIniciarSesion = new JButton("INICIAR SESION");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login log = new Login();
				log.setVisible(true);
				dispose();
			}
		});
		btnIniciarSesion.setForeground(Color.WHITE);
		btnIniciarSesion.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnIniciarSesion.setBackground(Color.RED);
		btnIniciarSesion.setBounds(115, 492, 370, 67);
		Graficos.add(btnIniciarSesion);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(PgPrincipal.class.getResource("/Img/BarraVertical.png")));
		lblNewLabel_3.setBounds(0, 0, 40, 744);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(PgPrincipal.class.getResource("/Img/BarraInferiorr.png")));
		lblNewLabel_4.setBounds(32, 0, 1026, 40);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(PgPrincipal.class.getResource("/Img/BarraInferiorr.png")));
		lblNewLabel_5.setBounds(1055, 0, 295, 40);
		panel.add(lblNewLabel_5);
		
		
		 
	}
	
}
