/*
Write a program that calculates the total commission receives based on the table
below. The program will accept the sales volume and calculate the commission.
Display the commission in two decimal places
*/
package Q3;
import java.util.Scanner;
/**
 *
 * @author jites
 */
public class L3Q3 {

    public static void main(String[] args) {
        // Setup variables
        double commision;
        
        // Setup scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the sales volume: ");
        double sales = input.nextDouble();
        
        // Range comparison code to find the commision
        if (sales <= 100){
            commision = 0.05 * sales;
            System.out.printf("Your commision is: %.2f%n", commision);
        }
        else if(sales > 100 && sales <= 500){
            commision = 0.075 * sales;
            System.out.printf("Your commision is: %.2f%n", commision);
        }
        else if(sales > 500 && sales <= 1000){
            commision = 0.1 * sales;
            System.out.printf("Your commision is: %.2f%n", commision);
        }
        else{
            commision = 0.125 * sales;
            System.out.printf("Your commision is: %.2f%n", commision);
        }
    }
    
}
