package Visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import Logico.CrucialWork;
import Logico.Obrer0;
import Logico.SolicitudDeEmpresa;
import Logico.SolicitudEmpleo;
import Logico.Tecnic0;
import Logico.Universitario;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class OfertasEmpleo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tbOfertas;
	public static DefaultTableModel modelo;
	public static Object[] fila;
	private String temp;
	private JTextField txtCedula;
	private JButton btnVerPerfil;


	/**
	 * Launch the application.
	 */
	/*ublic static void main(String[] args) {
		try {
			OfertasEmpleo dialog = new OfertasEmpleo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public OfertasEmpleo(String cedula) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(OfertasEmpleo.class.getResource("/Img/MiniLogo.png")));
		setBounds(100, 100, 786, 602);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel Buscador = new JPanel();
		Buscador.setBorder(new TitledBorder(null, "Filtros de Busqueda", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		Buscador.setBackground(Color.WHITE);
		Buscador.setBounds(604, 53, 152, 263);
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Solicitudes.class.getResource("/Img/BarraInferiorr.png")));
		lblNewLabel.setBounds(0, 0, 768, 40);
		contentPanel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 53, 565, 489);
		contentPanel.add(scrollPane);
		
		modelo = new DefaultTableModel();
		String[] columns = {"RNC", "Tipo de empleado", "Salaro Minimo","Disp. viaje", "Estado de solicitud"};
		modelo.setColumnIdentifiers(columns);
		tbOfertas = new JTable();
		tbOfertas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int seleccion = tbOfertas.getSelectedRow();
				if(seleccion != -1) {
					btnVerPerfil.setEnabled(true);
					temp = (String) modelo.getValueAt(seleccion, 0);
				}else {
					btnVerPerfil.setEnabled(false);
				}
			}
		});
		tbOfertas.setModel(modelo);
		scrollPane.setViewportView(tbOfertas);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos Personales", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(604, 329, 152, 159);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		txtCedula = new JTextField();
		txtCedula.setEditable(false);
		txtCedula.setText(cedula);
		txtCedula.setBackground(Color.WHITE);
		txtCedula.setBounds(12, 27, 128, 22);
		panel.add(txtCedula);
		txtCedula.setColumns(10);
		
		btnVerPerfil = new JButton("Ver Perfil");
		btnVerPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PerfilEmpresa pe = new PerfilEmpresa(CrucialWork.getInstance().buscarEmpresa(temp),cedula);
				pe.setVisible(true);
			}
		});
		btnVerPerfil.setEnabled(false);
		btnVerPerfil.setForeground(Color.WHITE);
		btnVerPerfil.setBackground(Color.RED);
		btnVerPerfil.setBounds(614, 501, 130, 25);
		contentPanel.add(btnVerPerfil);
		CargarTabla();
		
	}
	private void CargarTabla() {
		modelo.setRowCount(0);
		fila = new Object[modelo.getColumnCount()];
		for(SolicitudDeEmpresa e : CrucialWork.getInstance().getSde()) {
			if(e != null) {
				fila[0] = e.getId();
				fila[1]= e.getTipoDeEmpleado();
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
