/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q1;
import java.util.Scanner;
/**
 *
 * @author jites
 */
public class L6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please input the number of triangular numbers: ");
        int a = input.nextInt();
        triangularNumber(a);
    }
    
    /**
     * @param a the number of times to loop the code
     */
    public static void triangularNumber(int a){
        int num = 0;
        for (int i = 1; i <= a; i++){
            num += i;
        }
        System.out.printf("The triangular number value is: %d%n", num);
    }
}
