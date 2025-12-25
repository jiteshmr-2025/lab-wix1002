/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q2_Extended;

import java.util.Scanner;

/**
 *
 * @author jites
 */
public class L4Q2_Extended {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        
        // Accept integer from user
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        
        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++){
                sum += j;
            }
        }
        System.out.printf("The series total is: %d%n", sum);
    }
    
}
