package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Logico.CorreoPersona;
import Logico.CrucialWork;
import Logico.Empresa;
import Logico.Persona;
import Logico.SolicitudEmpleo;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Correo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tbCorreo;
	public static DefaultTableModel modelo;
	public static Object[] fila;
	private JLabel lblNombre;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			Correo dialog = new Correo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Correo(String cedula) {
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
		{
			JPanel Buscar = new JPanel();
			Buscar.setBackground(Color.WHITE);
			Buscar.setBounds(10, 53, 666, 106);
			contentPanel.add(Buscar);
			Buscar.setLayout(null);
			{
				lblNombre = new JLabel("");
				lblNombre.setFont(new Font("Tahoma", Font.BOLD, 24));
				lblNombre.setBounds(12, 13, 366, 56);
				Buscar.add(lblNombre);
			}
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 172, 664, 304);
			contentPanel.add(scrollPane);
			{
				modelo = new DefaultTableModel();
				String[] columns = {"RNC","Preferencia"};
				modelo.setColumnIdentifiers(columns);
				tbCorreo = new JTable();
				scrollPane.setViewportView(tbCorreo);
				tbCorreo.setModel(modelo);
			}
		}
		{
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CrucialWork.getInstance().buscarSolicitud(cedula);
					SolicitudEmpleo se = null;
					se.setEstado(true);
				}
			});
			btnAceptar.setBounds(437, 489, 97, 25);
			contentPanel.add(btnAceptar);
		}
		{
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CrucialWork.getInstance().buscarSolicitud(cedula);
					SolicitudEmpleo se = null;
					se.setEstado(false);
				}
			});
			btnCancelar.setBounds(546, 489, 97, 25);
			contentPanel.add(btnCancelar);
		}
		CargarTabla(cedula);
		
		
	}

	private void CargarTabla(String cedula) {
		ArrayList<CorreoPersona>aux = new ArrayList<CorreoPersona>();
		modelo.setRowCount(0);
		fila = new Object[modelo.getColumnCount()];
		//aux.add(CrucialWork.getInstance().buscarCorreo(cedula));
		for(CorreoPersona cp : CrucialWork.getInstance().getCorreo()) {
			if(cp != null) {
				fila[0] = cp.getEmpresa().getRnc_Empresa();
				fila[1] = cp.getEmpresa().getNombreEmpresa();
			}
			modelo.addRow(fila);
		}
		
	}
}
