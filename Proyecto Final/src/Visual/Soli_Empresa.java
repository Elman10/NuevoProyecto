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

import Logico.CrucialWork;
import Logico.SolicitudDeEmpresa;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Soli_Empresa extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtRNC;
	private JTextField txtSalario;
	private JTextField txtCantidad;
	private JComboBox cbxPreferencia;
	private JCheckBox chckbxSi;
	private JCheckBox chckbxNo;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			Soli_Empresa dialog = new Soli_Empresa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Soli_Empresa(String RNC) {
		setUndecorated(true);
		setBounds(100, 100, 623, 470);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(Soli_Empresa.class.getResource("/Img/BarraVertical.png")));
			lblNewLabel.setBounds(583, -11, 40, 559);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(Soli_Empresa.class.getResource("/Img/BarraInferiorr.png")));
			lblNewLabel_1.setBounds(-69, 430, 716, 40);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBackground(Color.WHITE);
			panel.setBounds(12, 13, 559, 404);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNewLabel_2 = new JLabel("Solicitud de la Empresa:");
				lblNewLabel_2.setFont(new Font("Arial Black", Font.ITALIC, 17));
				lblNewLabel_2.setBounds(12, 13, 234, 44);
				panel.add(lblNewLabel_2);
			}
			{
				JLabel lblRNC = new JLabel("RNC de la Empresa: ");
				lblRNC.setBounds(43, 63, 119, 22);
				panel.add(lblRNC);
			}
			{
				txtRNC = new JTextField();
				txtRNC.setText(RNC);
				txtRNC.setBackground(Color.WHITE);
				txtRNC.setEditable(false);
				txtRNC.setBounds(198, 63, 174, 22);
				panel.add(txtRNC);
				txtRNC.setColumns(10);
			}
			{
				JLabel lblPreferencia = new JLabel("Preferencia:");
				lblPreferencia.setBounds(43, 135, 119, 22);
				panel.add(lblPreferencia);
			}
			{
				cbxPreferencia = new JComboBox();
				cbxPreferencia.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Obrero", "Universitario", "Técnico"}));
				cbxPreferencia.setBounds(198, 135, 174, 22);
				panel.add(cbxPreferencia);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("Salario mínimo:");
				lblNewLabel_3.setBounds(43, 207, 119, 22);
				panel.add(lblNewLabel_3);
			}
			{
				txtSalario = new JTextField();
				txtSalario.setColumns(10);
				txtSalario.setBounds(198, 207, 174, 22);
				panel.add(txtSalario);
			}
			{
				JLabel lblNewLabel_4 = new JLabel("Cantidad de Empleados:");
				lblNewLabel_4.setBounds(43, 279, 150, 22);
				panel.add(lblNewLabel_4);
			}
			{
				txtCantidad = new JTextField();
				txtCantidad.setColumns(10);
				txtCantidad.setBounds(198, 279, 174, 22);
				panel.add(txtCantidad);
			}
			{
				JButton btnSolicitar = new JButton("Solicitar");
				btnSolicitar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						SolicitudDeEmpresa em = null;
						if(chckbxSi.isSelected()) {
							em = new SolicitudDeEmpresa(txtRNC.getText(),CrucialWork.getInstance().buscarEmpresa(txtRNC.getText()),cbxPreferencia.getSelectedItem().toString(),txtCantidad.getText(),txtSalario.getText(),false,true);
						}else if(chckbxNo.isSelected()) {
							em = new SolicitudDeEmpresa(txtRNC.getText(),CrucialWork.getInstance().buscarEmpresa(txtRNC.getText()),cbxPreferencia.getSelectedItem().toString(),txtCantidad.getText(),txtSalario.getText(),false,false);
						}
						CrucialWork.getInstance().insertSoliEmpresa(em);
						dispose();
					}
				});
				btnSolicitar.setBackground(Color.WHITE);
				btnSolicitar.setBounds(438, 179, 97, 25);
				panel.add(btnSolicitar);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					dispose();
					}
				});
				btnCancelar.setForeground(Color.WHITE);
				btnCancelar.setBackground(Color.RED);
				btnCancelar.setBounds(438, 215, 97, 25);
				panel.add(btnCancelar);
			}
			{
				JLabel lblNewLabel_5 = new JLabel("Disponibilidad para Viajar:");
				lblNewLabel_5.setBounds(43, 351, 162, 16);
				panel.add(lblNewLabel_5);
			}
			
			chckbxSi = new JCheckBox("Si");
			chckbxSi.setBackground(Color.WHITE);
			chckbxSi.setBounds(232, 347, 57, 25);
			panel.add(chckbxSi);
			
			chckbxNo = new JCheckBox("No");
			chckbxNo.setBackground(Color.WHITE);
			chckbxNo.setBounds(315, 347, 57, 25);
			panel.add(chckbxNo);
		}
	}
}
