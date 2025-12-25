/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q_Extras;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author jites
 */
public class L2_Extras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Setting up imports
        Scanner input = new Scanner(System.in);
        Random rd = new Random();
        
        // User inputs
        System.out.println("=== RANDOM NUMBER GENERATOR ===");
        System.out.print("Please input the starting value of the random number generator (inclusive): ");
        int start = input.nextInt();
        System.out.print("Please input the ending value of the random number generator (inclusive): ");
        int finalNum = input.nextInt();
        
        // Random generator
        int rd1 = rd.nextInt(start, finalNum + 1);
        System.out.printf("The random number generated is: %d%n", rd1);
    }
    
}
