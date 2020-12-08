package Visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import Logico.CrucialWork;
import java.awt.Toolkit;

public class GraficoBarra extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private  JPanel panel;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			GraficoBarra dialog = new GraficoBarra();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GraficoBarra() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(GraficoBarra.class.getResource("/Img/MiniLogo.png")));
		
		 setTitle("DATOS DE LA PAGINA :)");
	        setSize(708,476);
	        setLocationRelativeTo(null);
	       // setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setVisible(true);
	        init();
	}
	private void init() {
        panel = new JPanel();
        panel.setBackground(Color.RED);
        getContentPane().add(panel);
        // Fuente de Datos
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(CrucialWork.ob, "Obreros", "Obreros");
        dataset.setValue(CrucialWork.uni, "Universitarios", "Universitarios");
        dataset.setValue(CrucialWork.tec, "Técnicos", "Tecnicos");
        // Creando el Grafico
        JFreeChart chart = ChartFactory.createBarChart3D
        ("TIPOS DE PERSONAS EMPLEADAS","TIPO", "CANTIDAD", 
        dataset, PlotOrientation.VERTICAL, true,true, false);
        chart.setBackgroundPaint(Color.white);
        chart.getTitle().setPaint(Color.black); 
        CategoryPlot p = chart.getCategoryPlot(); 
        p.setRangeGridlinePaint(Color.red); 
        // Mostrar Grafico
        ChartPanel chartPanel = new ChartPanel(chart);
        panel.add(chartPanel);
    }

}
