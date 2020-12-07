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

public class Solicitudes extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	public Solicitudes() {
		setBounds(100, 100, 686, 494);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Solicitudes.class.getResource("/Img/BarraInferiorr.png")));
		lblNewLabel.setBounds(0, 0, 668, 40);
		contentPanel.add(lblNewLabel);
		
		JPanel Tabla = new JPanel();
		Tabla.setBounds(139, 53, 517, 381);
		contentPanel.add(Tabla);
		
		JPanel Buscador = new JPanel();
		Buscador.setBounds(10, 53, 117, 381);
		contentPanel.add(Buscador);
	}
}
