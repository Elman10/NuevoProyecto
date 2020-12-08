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

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Correo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tbCorreo;
	private JTextField textField;
	public static DefaultTableModel modelo;
	public static Object[] fila;

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
				JLabel lblCorreo = new JLabel("Buscar bandeja por cedula:");
				lblCorreo.setBounds(12, 13, 170, 16);
				Buscar.add(lblCorreo);
			}
			
			textField = new JTextField();
			textField.setBounds(193, 10, 116, 22);
			Buscar.add(textField);
			textField.setColumns(10);
			
			JButton btnNewButton = new JButton("Buscar");
			btnNewButton.setBounds(321, 9, 97, 25);
			Buscar.add(btnNewButton);
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
			btnAceptar.setBounds(437, 489, 97, 25);
			contentPanel.add(btnAceptar);
		}
		{
			JButton btnCancelar = new JButton("Cancelar");
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
