/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q1;
import java.util.Scanner;
/**
 *
 * @author jites
 */
public class L2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Farenheit(F): ");
        double farenheit = sc.nextDouble();
        double celsius = (farenheit - 32) / 1.8; 
        System.out.printf("The temperature in Celsius is: %.2f Degree Celsius", celsius);
    }
}
