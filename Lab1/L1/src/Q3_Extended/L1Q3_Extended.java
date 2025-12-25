/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q3_Extended;
import java.util.Scanner;
/**
 *
 * @author jites
 */
public class L1Q3_Extended {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Get input lines from user
        Scanner input = new Scanner(System.in);
        System.out.print("How many lines do you want to print: ");
        int lines = input.nextInt();
        
        String[] shape = new String[lines + 1];
        
        int factor = 2;
        for (int j = 0; j <= lines; j++){
            shape[j] = " ".repeat(lines - j) + "*".repeat(factor * j + 1);
        }
        
        for (int i = 0; i <= lines; i++){
            System.out.println(shape[i]);
        }
    }
    
}
