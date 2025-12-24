/*
Write programs that merge data from two text files namely product.txt and
order.txt. (Please download the text file from the Web site.) The product.txt
contains the ProductID, ProductName, ProductPrice separated by comma. The
order.txt contains the OrderID, ProductID, OrderQuantiy separated by comma. You
program will display the ProductID, ProductName, OrderQuantity, PricePerUnit and
TotalPrice for each order. (You can use the String.split(), Integer.parseInt(String) and
Double.parseDouble(String))
 */
package l7q6;

import java.io.*;
import java.util.Scanner;
/**
 *
 * @author jites
 */
public class L7Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] productID = new String[7];
        String[] productName = new String[7];
        double[] productPrice = new double[7];
        
        int[] orderQuantity = new int[7];
        double[] totalPrice = new double[7];
        
        int i = 0;
        System.out.println("ProductID\tProductName\t\tOrderQuantity\tPricePerUnit\tTotalPrice");
        
        try {
            Scanner sp = new Scanner(new File("product.txt"));
            Scanner so = new Scanner(new File("order.txt"));

            while (sp.hasNextLine()){
                String data = sp.nextLine();
                String[] data_sampled = data.split("\\,+");   
                productID[i] = data_sampled[0];
                productName[i] = data_sampled[1];
                productPrice[i] = Double.parseDouble(data_sampled[2]);
                i++;
            }
            
            while (so.hasNextLine()){
                String data = so.nextLine();
                String[] data_sampled = data.split("\\,+");
                for (int k = 0; k < productID.length; k++){
                    if (productID[k].equals(data_sampled[1])){
                        orderQuantity[k] =  Integer.parseInt(data_sampled[2]);
                        totalPrice[k] = productPrice[k] * orderQuantity[k];
                        
                        System.out.printf("%s\t\t%s\t\t%d\t\t%.2f\t\t%.2f%n", productID[k], productName[k], orderQuantity[k], productPrice[k], totalPrice[k]);
                    }
                }
            }
        } catch (IOException e) {
        }

    }

}
