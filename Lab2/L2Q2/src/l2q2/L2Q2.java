/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q2;
import java.util.Scanner;
/**
 *
 * @author jites
 */
public class L2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("== MONTHLY CAR LOAN REPAYMENT CALCULATOR ==");
        System.out.print("Please input the price of the car: RM ");
        double P = input.nextDouble();
        System.out.print("Please input the down payment of the car: RM ");
        double D = input.nextDouble();
        System.out.print("Please input the interest rate in %: ");
        double R = input.nextDouble();
        System.out.print("Please input the loan duration in year: ");
        double Y = input.nextDouble();
        
        double M = (P - D) * (1 + R*Y/100) / (Y*12);
        System.out.printf("Monthly repayment: RM %.2f", M);
    }
    
}
