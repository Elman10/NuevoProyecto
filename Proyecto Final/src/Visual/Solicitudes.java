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
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import Logico.CrucialWork;
import Logico.Obrer0;
import Logico.SolicitudEmpleo;
import Logico.Tecnic0;
import Logico.Universitario;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class Solicitudes extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tbOfertas;
	public static DefaultTableModel modelo;
	public static Object[] fila;
	private ArrayList<SolicitudEmpleo> aux = new ArrayList<SolicitudEmpleo>();
	private JTextField txtRNC;
	private JButton btnPerfil;
	private String temp;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			Solicitudes dialog = new Solicitudes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Solicitudes(String RNC) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Solicitudes.class.getResource("/Img/MiniLogo.png")));
		setBounds(100, 100, 786, 602);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Solicitudes.class.getResource("/Img/BarraInferiorr.png")));
		lblNewLabel.setBounds(0, 0, 768, 40);
		contentPanel.add(lblNewLabel);
		
		JPanel Buscador = new JPanel();
		Buscador.setBorder(new TitledBorder(null, "Filtros de Busqueda", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		Buscador.setBackground(Color.WHITE);
		Buscador.setBounds(10, 53, 152, 263);
		contentPanel.add(Buscador);
		Buscador.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo:");
		lblNewLabel_1.setBounds(12, 45, 56, 16);
		Buscador.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Obrero", "Universitario", "Tecnico"}));
		comboBox.setBounds(12, 74, 128, 22);
		Buscador.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Disp. Viaje:");
		lblNewLabel_2.setBounds(12, 131, 104, 16);
		Buscador.add(lblNewLabel_2);
		
		JCheckBox chckbxSi = new JCheckBox("Si");
		chckbxSi.setBackground(Color.WHITE);
		chckbxSi.setBounds(12, 161, 56, 25);
		Buscador.add(chckbxSi);
		
		JCheckBox chckbxNo = new JCheckBox("No");
		chckbxNo.setBackground(Color.WHITE);
		chckbxNo.setBounds(72, 161, 56, 25);
		Buscador.add(chckbxNo);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Ambas");
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.setBounds(12, 191, 67, 25);
		Buscador.add(chckbxNewCheckBox);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnBuscar.setBounds(12, 225, 128, 25);
		Buscador.add(btnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(174, 53, 582, 434);
		contentPanel.add(scrollPane);
		
		modelo = new DefaultTableModel();
		String[] columns = {"Cedula","Tipo","Salario Minimo","Disp. Viaje","Estado de la Solicitud"};
		modelo.setColumnIdentifiers(columns);
		tbOfertas = new JTable();
		tbOfertas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int seleccion = tbOfertas.getSelectedRow();
				if(seleccion != -1) {
					btnPerfil.setEnabled(true);
					temp = (String) modelo.getValueAt(seleccion, 0);
				}else btnPerfil.setEnabled(false);
			}
		});
		tbOfertas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tbOfertas.setBackground(Color.WHITE);
		scrollPane.setViewportView(tbOfertas);
		tbOfertas.setModel(modelo);
		
		btnPerfil = new JButton("Ver Perfil");
		btnPerfil.setEnabled(false);
		btnPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContratarPersona mn = new ContratarPersona(CrucialWork.getInstance().buscarPersona(temp),RNC);
				mn.setVisible(true);
			}
		});
		btnPerfil.setBounds(659, 517, 97, 25);
		contentPanel.add(btnPerfil);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Datos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 329, 152, 158);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		txtRNC = new JTextField();
		txtRNC.setBackground(Color.WHITE);
		txtRNC.setEditable(false);
		txtRNC.setText(RNC);
		txtRNC.setBounds(12, 28, 128, 22);
		panel.add(txtRNC);
		txtRNC.setColumns(10);
		
		CargarTabla();

		
	}

	private void CargarTabla() {
		modelo.setRowCount(0);
		fila = new Object[modelo.getColumnCount()];
		for(SolicitudEmpleo e : CrucialWork.getInstance().getSe()) {
			if(e != null) {
				fila[0] = e.getId();
				if(e.getPersona() instanceof Obrer0) {
					fila[1] = "Obrero";
				}else if(e.getPersona() instanceof Universitario) {
					fila[1] = "Universitario";
				}else if(e.getPersona() instanceof Tecnic0) {
					fila[1] = "Tecnico";
				}
				fila[2] = e.getSalarioMinimo();
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
