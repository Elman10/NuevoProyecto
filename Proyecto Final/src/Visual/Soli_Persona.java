package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.SystemColor;

public class Soli_Persona extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCedula;
	private JTextField txtSalario;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			Soli_Persona dialog = new Soli_Persona();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Soli_Persona() {
		setUndecorated(true);
		setBounds(100, 100, 576, 455);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("\r\n");
			lblNewLabel.setIcon(new ImageIcon(Soli_Persona.class.getResource("/Img/BarraVertical.png")));
			lblNewLabel.setBounds(0, -19, 41, 550);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(Soli_Persona.class.getResource("/Img/BarraInferiorr.png")));
			lblNewLabel_1.setBounds(33, 0, 615, 41);
			contentPanel.add(lblNewLabel_1);
		}
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(53, 54, 510, 389);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Solicitud de Empleo:");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.ITALIC, 20));
		lblNewLabel_2.setBounds(12, 13, 234, 45);
		panel.add(lblNewLabel_2);
		
		JLabel lblCedula = new JLabel("Cédula:");
		lblCedula.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCedula.setBounds(53, 77, 76, 27);
		panel.add(lblCedula);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(194, 77, 135, 27);
		panel.add(txtCedula);
		txtCedula.setColumns(10);
		
		JLabel lblSalario = new JLabel("Salario mínimo:");
		lblSalario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSalario.setBounds(53, 181, 115, 27);
		panel.add(lblSalario);
		
		txtSalario = new JTextField();
		txtSalario.setBounds(194, 181, 135, 27);
		panel.add(txtSalario);
		txtSalario.setColumns(10);
		
		JLabel lblViaje = new JLabel("Disponibilidad de Viajar:");
		lblViaje.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblViaje.setBounds(53, 285, 189, 27);
		panel.add(lblViaje);
		
		JCheckBox chckbxSi = new JCheckBox("Sí");
		chckbxSi.setFont(new Font("Tahoma", Font.PLAIN, 17));
		chckbxSi.setBackground(Color.WHITE);
		chckbxSi.setBounds(247, 286, 57, 25);
		panel.add(chckbxSi);
		
		JCheckBox chckbxNo = new JCheckBox("No");
		chckbxNo.setBackground(Color.WHITE);
		chckbxNo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		chckbxNo.setBounds(308, 286, 57, 25);
		panel.add(chckbxNo);
		
		JButton btnSolicitar = new JButton("Solicitar");
		btnSolicitar.setBackground(SystemColor.inactiveCaptionBorder);
		btnSolicitar.setBounds(268, 351, 97, 25);
		panel.add(btnSolicitar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(SystemColor.inactiveCaptionBorder);
		btnCancelar.setBounds(377, 351, 97, 25);
		panel.add(btnCancelar);
	}
}
