/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q2;
import java.util.Scanner;

/**
 *
 * @author jites
 */
public class L6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please input the size of the triangle and diamond you want to print: ");
        int h = input.nextInt();
        
        // Triangle
        for (int i = 1; i <= h; i++){
            multiPrint(i, '*');
            System.out.println("");
        }
        
        // Diamond
        // Upper half
        for (int i = 1; i <= h; i++){
            multiPrint(h - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println("");
        }
        // Lower half
        for (int i = h - 1; i >= 1; i--){
            multiPrint(h - i, ' ');
            multiPrint(2 * i - 1, '*');
            System.out.println("");
        }
    }
    
    public static void multiPrint(int n, char c){
        for (int i = 0; i < n; i++){
            System.out.print(c);
        }
    }
    
}
