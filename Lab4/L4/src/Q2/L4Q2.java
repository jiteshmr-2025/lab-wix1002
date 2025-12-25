/*
Write a program that accepts an integer n from user and then sum the following
series.
1 + (1+2) + (1+2+3) + … + (1+2+3+…+n)
*/
package Q2;
import java.util.Scanner;

/**
 *
 * @author jites
 */
public class L4Q2 {
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
