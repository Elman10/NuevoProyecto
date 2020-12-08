package Visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import Logico.Empresa;

public class PerfilEmpresa extends JDialog {

	private JPanel contentPane;
	private JTextField txtRNC;
	private JTextField txtPais;
	private JTextField txtZIP;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtAreaWork;
	private JButton btnCancelar;
	private JButton btnCV;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			PerfilEmpresa dialog = new PerfilEmpresa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public PerfilEmpresa(Empresa e) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 813, 519);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Menu_Empresa.class.getResource("/Img/BarraVertical.png")));
		lblNewLabel.setBounds(0, -45, 40, 529);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Menu_Empresa.class.getResource("/Img/BarraInferiorr.png")));
		lblNewLabel_1.setBounds(0, 0, 795, 42);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new TitledBorder(null, "Datos de la Empresa", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(52, 55, 731, 404);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("New label");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 44));
		lblNombre.setBounds(254, 28, 454, 64);
		panel.add(lblNombre);
		
		JPanel AceraDe = new JPanel();
		AceraDe.setBorder(new TitledBorder(null, "Acerca de", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		AceraDe.setBackground(Color.WHITE);
		AceraDe.setBounds(28, 114, 670, 123);
		panel.add(AceraDe);
		AceraDe.setLayout(null);
		
		txtRNC = new JTextField();
		txtRNC.setBackground(Color.WHITE);
		txtRNC.setEditable(false);
		txtRNC.setBounds(66, 30, 116, 22);
		AceraDe.add(txtRNC);
		txtRNC.setColumns(10);
		
		txtPais = new JTextField();
		txtPais.setBackground(Color.WHITE);
		txtPais.setEditable(false);
		txtPais.setBounds(214, 30, 235, 22);
		AceraDe.add(txtPais);
		txtPais.setColumns(10);
		
		txtZIP = new JTextField();
		txtZIP.setBackground(Color.WHITE);
		txtZIP.setEditable(false);
		txtZIP.setBounds(485, 30, 116, 22);
		AceraDe.add(txtZIP);
		txtZIP.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setEditable(false);
		txtDireccion.setColumns(10);
		txtDireccion.setBackground(Color.WHITE);
		txtDireccion.setBounds(214, 65, 235, 22);
		AceraDe.add(txtDireccion);
		
		txtTelefono = new JTextField();
		txtTelefono.setEditable(false);
		txtTelefono.setColumns(10);
		txtTelefono.setBackground(Color.WHITE);
		txtTelefono.setBounds(485, 65, 116, 22);
		AceraDe.add(txtTelefono);
		
		txtAreaWork = new JTextField();
		txtAreaWork.setEditable(false);
		txtAreaWork.setColumns(10);
		txtAreaWork.setBackground(Color.WHITE);
		txtAreaWork.setBounds(66, 65, 116, 22);
		AceraDe.add(txtAreaWork);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setForeground(Color.WHITE);
		btnCancelar.setBackground(Color.RED);
		btnCancelar.setBounds(597, 366, 122, 25);
		panel.add(btnCancelar);
		
		//for(Empresa e : CrucialWork.getInstance().getE()) {
			txtRNC.setText(e.getRnc_Empresa());
			txtPais.setText(e.getPais());
			txtAreaWork.setText(e.getAreaDeTrabajo());
			txtDireccion.setText(e.getDireccion());
			txtTelefono.setText(e.getNumero_Telefono());
			txtZIP.setText(e.getCodPostal());
       		lblNombre.setText(e.getNombreEmpresa());
       		
       		btnCV = new JButton("Enviar CV");
       		btnCV.addActionListener(new ActionListener() {
       			public void actionPerformed(ActionEvent e) {
       				
       			}
       		});
       		btnCV.setBounds(456, 366, 129, 25);
       		panel.add(btnCV);
			
		//}
	}

}
