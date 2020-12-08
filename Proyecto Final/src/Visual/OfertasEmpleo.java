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
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class OfertasEmpleo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable tbOfertas;

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
		
		tbOfertas = new JTable();
		scrollPane.setViewportView(tbOfertas);
		
	}
}
