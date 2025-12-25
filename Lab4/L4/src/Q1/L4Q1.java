/*
Write a program that accepts an integer from user. Then, display its entire factors in
increasing order.
 */
package Q1;
import java.util.Scanner;
/**
 *
 * @author jites
 */
public class L4Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Accept integer from user
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        
        // Check for factors
        System.out.print("The factors are: ");
        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                System.out.printf("%d ", i);
            }
        }
    }
    
}
