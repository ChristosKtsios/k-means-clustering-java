
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class CreateScatterPlot extends JFrame {
    private List<Entry> data;
    private List<Cluster> clusters ;
    private Map<Cluster,List<Entry>> clusterElements;
    private static final long serialVersionUID = 6294689542092367723L;

    public CreateScatterPlot(String title,K_Means my_data) {
        super(title);
        this.clusters =my_data.getClusters();
        this.data = my_data.getData();
        this.clusterElements = my_data.getClusterElements();
        // Create dataset
        XYDataset dataset = createDataset();

        // Create chart
        JFreeChart chart = ChartFactory.createScatterPlot(
                "K-Means Clustering",
                "X-Axis", "Y-Axis", dataset);


        //Changes background color
        XYPlot plot = (XYPlot) chart.getPlot();
        plot.setBackgroundPaint(new Color(255, 228, 196));


        // Create Panel
        ChartPanel panel = new ChartPanel(chart);
        setContentPane(panel);
    }

    private XYDataset createDataset() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries series1 = new XYSeries("Centers");
        for(int j=0;j< clusters.size() ;j++){
            Cluster current_cluster = clusters.get(j);
            series1.add(current_cluster.getX_Center(),current_cluster.getY_Center());
        }
        dataset.addSeries(series1);
        for (Cluster groupName : clusterElements.keySet()) {
            XYSeries series = new XYSeries(groupName.getClusterNum());
            List<Entry> data = clusterElements.get(groupName);
            for (int i = 0; i < data.size(); i++) {
                Entry entry = data.get(i);
                series.add(entry.getX(), entry.getY());
            }
            dataset.addSeries(series);
        }
        return dataset;
    }
}

