package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Logico.CorreoEmpresa;
import Logico.CrucialWork;
import Logico.Obrer0;
import Logico.SolicitudDeEmpresa;
import Logico.Tecnic0;
import Logico.Universitario;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CorreoE extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tbSolis;
	public static DefaultTableModel modelo;
	public static Object[] fila;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			CorreoE dialog = new CorreoE();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CorreoE(String RNC) {
		setBounds(100, 100, 706, 581);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(Correo.class.getResource("/Img/BarraInferiorr.png")));
			lblNewLabel.setBounds(0, 0, 688, 40);
			contentPanel.add(lblNewLabel);
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 134, 664, 346);
		contentPanel.add(scrollPane);
		
		modelo = new DefaultTableModel();
		String[] columns = {"Cedula","Nombre","Area"};
		modelo.setColumnIdentifiers(columns);
		tbSolis = new JTable();
		scrollPane.setViewportView(tbSolis);
		tbSolis.setModel(modelo);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SolicitudDeEmpresa se = null;
				se = CrucialWork.getInstance().buscarSolicitudE(RNC);
				se.setEstado(true);
				
			}
		});
		btnAceptar.setBounds(459, 496, 97, 25);
		contentPanel.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SolicitudDeEmpresa se = null;
				se = CrucialWork.getInstance().buscarSolicitudE(RNC);
				dispose();
			}
		});
		btnCancelar.setBounds(568, 496, 97, 25);
		contentPanel.add(btnCancelar);
		
		
		CargarTabla(RNC);
	}

	private void CargarTabla(String RNC) {
		ArrayList<CorreoEmpresa>aux = new ArrayList<CorreoEmpresa>();
		modelo.setRowCount(0);
		fila = new Object[modelo.getColumnCount()];
		aux.add(CrucialWork.getInstance().buscarCorreoE(RNC));
		for(CorreoEmpresa ce : aux) {
			if(ce != null) {
				fila[0] = ce.getPersona().getCedula();
				fila[1] = ce.getPersona().getNombre()+" "+ce.getPersona().getApellido();
				if(ce.getPersona() instanceof Obrer0) {
					fila[2] = "Obrero";
				}else if(ce.getPersona() instanceof Universitario) fila[2] = "Universitario"; 
				else if(ce.getPersona() instanceof Tecnic0) fila[2] = "Tecnico";
				modelo.addRow(fila);
			}
			
		}
		
	}

}
