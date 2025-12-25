/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q4;
import java.util.Scanner;
/**
 *
 * @author jites
 */
public class L2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int input = sc.nextInt();
        
        int hours = input / 3600;
        int minutes = (input % 3600) / 60;
        int seconds = input % 60;
        
        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds", input, hours, minutes, seconds);
    }
    
}
