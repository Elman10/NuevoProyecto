package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

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
import Logico.Empresa;
import Logico.SolicitudDeEmpresa;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import java.awt.Toolkit;

public class MisSolisEmp extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tbSolis;
	private JLabel lblNombreEmp;
	private JLabel lblRNC;
	private JLabel lblTipo;
	private JLabel lblTelefono;
	public static DefaultTableModel modelo;
	public static Object[] fila;
	private ArrayList<SolicitudDeEmpresa> soli = new ArrayList<SolicitudDeEmpresa>();

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			MisSolisEmp dialog = new MisSolisEmp();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MisSolisEmp(String RNC) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MisSolisEmp.class.getResource("/Img/MiniLogo.png")));
		setBounds(100, 100, 786, 559);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(MisSolisEmp.class.getResource("/Img/BarraInferiorr.png")));
			lblNewLabel.setBounds(0, 0, 768, 40);
			contentPanel.add(lblNewLabel);
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Datos de la Empresa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBackground(Color.WHITE);
			panel.setBounds(541, 53, 215, 446);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNewLabel_1 = new JLabel("Nombre de la Empresa:");
				lblNewLabel_1.setBounds(12, 50, 154, 16);
				panel.add(lblNewLabel_1);
			}
			{
				lblNombreEmp = new JLabel("New label");
				lblNombreEmp.setBounds(12, 76, 191, 16);
				panel.add(lblNombreEmp);
			}
			{
				lblRNC = new JLabel("New label");
				lblRNC.setBounds(12, 168, 191, 16);
				panel.add(lblRNC);
			}
			{
				lblTipo = new JLabel("New label");
				lblTipo.setBounds(12, 260, 191, 16);
				panel.add(lblTipo);
			}
			{
				lblTelefono = new JLabel("New label");
				lblTelefono.setBounds(12, 352, 191, 16);
				panel.add(lblTelefono);
			}
			{
				JLabel lblRnc = new JLabel("RNC:");
				lblRnc.setBounds(12, 139, 154, 16);
				panel.add(lblRnc);
			}
			{
				JLabel lblTipoDeEmpresa = new JLabel("Tipo de Empresa:");
				lblTipoDeEmpresa.setBounds(12, 231, 154, 16);
				panel.add(lblTipoDeEmpresa);
			}
			{
				JLabel lblTelefono_1 = new JLabel("Telefono:");
				lblTelefono_1.setBounds(12, 323, 154, 16);
				panel.add(lblTelefono_1);
			}
			
			ArrayList<Empresa> e = new ArrayList<Empresa>();
			e.add(CrucialWork.getInstance().buscarEmpresa(RNC));
			for(Empresa emp : e) {
				if(emp != null) {
					lblNombreEmp.setText(emp.getNombreEmpresa());
					lblRNC.setText(emp.getRnc_Empresa());
					lblTipo.setText(emp.getAreaDeTrabajo());
					lblTelefono.setText(emp.getNumero_Telefono());
				}
			}
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			scrollPane.setBounds(10, 53, 519, 446);
			contentPanel.add(scrollPane);
			{
				modelo = new DefaultTableModel();
				String[] columns = {"RNC","Preferencia","Salario Minimo","Disp. Viaje","Estado"};
				modelo.setColumnIdentifiers(columns);
				tbSolis = new JTable();
				scrollPane.setViewportView(tbSolis);
				tbSolis.setModel(modelo);
				CargarTabla(RNC);
			}
		}
	}

	private void CargarTabla(String RNC) {
		modelo.setRowCount(0);
		fila = new Object[modelo.getColumnCount()];
		soli.add(CrucialWork.getInstance().buscarSolicitudE(RNC));
		for(SolicitudDeEmpresa e : soli) {
			if( e != null) {
				fila[0] = e.getId();
				fila[1] = e.getTipoDeEmpleado();
				fila[2] = e.getSalarioMinimo();
				if(e.isDispViaje() != false) {
					fila[3] = "Si";
				}else fila[3] = "No";
				if(e.isEstado() != false) {
					fila[4] = "Aceptado";
				}else fila[4] = "Pendiente";
				modelo.addRow(fila);
			}
		}
		
	}

}
