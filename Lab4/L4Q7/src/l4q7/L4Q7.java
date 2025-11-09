/*
Write a program that used to calculate mortgage loan. The program will create the
amortization table with equal total payment plan. The following are the formula and
the sample output.
 */
package l4q7;

import java.util.Scanner;

/**
 *
 * @author jites
 */
public class L4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Setup imports and variables
        Scanner input = new Scanner(System.in);
        double sumInt = 0;
        
        // Setup inputs
        System.out.print("Enter principal amount: ");
        double P = input.nextDouble();
        System.out.print("Enter interest in %: ");
        double i = input.nextDouble();
        System.out.print("Enter total number of month(s): ");
        double N = input.nextDouble();
        
        // Printing
        System.out.println("Month\t\tMonthly Payment\t\tPrincipal\tInterest\tUnpaid Balance\t\tTotal Interest");
        
        // Calculations?
        double M = (P * (i / (12 * 100))) / (1 - Math.pow(1 + (i / (12 * 100)), -N));
        for (int n = 1; n <= N; n++){
            double C = M * Math.pow(1 + (i / (12 * 100)), -(1 + N - n));
            double L = M - C;
            double R = (L / (i / (12 * 100))) - C;
            
            sumInt += L;
            
            System.out.printf("%d\t\t%.2f\t\t\t%.2f\t\t%.2f\t\t%.2f\t\t\t%.2f%n", n, M, C, L, R, sumInt);
        }
        
    }
    
}
