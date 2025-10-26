/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l1q4;

/**
 *
 * @author jites
 */
public class L1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Data
        String[] months = {"January", "February", "March", "April", "May", "June"};
        int[] sales = {2500, 1600, 2000, 2700, 3200, 80};

        // Print title
        System.out.println("TOTAL SALES OF PRODUCT A (JAN–JUN 2016)");
        System.out.println("=========================================");
        System.out.println();

        // Find the maximum sales value (for scaling)
        int max = 0;
        for (int s : sales) {
            if (s > max) max = s;
        }

        // Print bar chart
        for (int i = 0; i < months.length; i++) {
            // Scale bar length to a maximum of 50 stars
            int barLength = (int) ((sales[i] / (double) max) * 50);

            System.out.printf("%-10s | ", months[i]);
            for (int j = 0; j < barLength; j++) {
                System.out.print("*");
            }
            System.out.printf(" (%d)\n", sales[i]);
        }
    }
    
}
