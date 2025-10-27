/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l1q4_extended;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.PieStyler;
/**
 *
 * @author jites
 */
public class L1Q4_Extended {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PieChart chart = new PieChartBuilder().width(800).height(600).title("TOTAL SALES OF PRODUCT A (JAN – JUN 2016)").build();
        
        chart.getStyler().setLegendVisible(false);
        chart.getStyler().setPlotContentSize(.7);
        chart.getStyler().setStartAngleInDegrees(90);
        chart.getStyler().setLegendVisible(true);              // Show legend
        chart.getStyler().setLabelType(PieStyler.LabelType.Value);

        // Series
        chart.addSeries("January 2016", 2500);
        chart.addSeries("February 2016", 1600);
        chart.addSeries("March 2016", 2000);
        chart.addSeries("April 2016", 2700);
        chart.addSeries("May 2016", 3200);
        chart.addSeries("June 2016", 800);

        // Show it
        new SwingWrapper<>(chart).displayChart();
    }
    
}
