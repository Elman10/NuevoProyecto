package Visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Logico.CrucialWork;
import Logico.Obrer0;
import Logico.SolicitudDeEmpresa;
import Logico.SolicitudEmpleo;
import Logico.Tecnic0;
import Logico.Universitario;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OfertasEmpleo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tbOfertas;
	public static DefaultTableModel modelo;
	public static Object[] fila;
	private String temp;


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
	public OfertasEmpleo() {
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
					
					temp = (String) modelo.getValueAt(seleccion, 0);
				}else {
					
				}
			}
		});
		
		scrollPane.setViewportView(tbOfertas);
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
