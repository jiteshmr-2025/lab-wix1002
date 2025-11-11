/*
ask user for integer
ask user for range
show multiples in said range
 */
package l4q1_extended;
import java.util.Scanner;
/**
 *
 * @author jites
 */
public class L4Q1_Extended {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Accept integer from user
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        
        System.out.print("Please input the starting range: ");
        int start = input.nextInt();
        
        System.out.print("Please input the end range: ");
        int fin = input.nextInt();
        
        System.out.print("The mutiples are: ");
        for (int i = start; i <= fin; i++){
            if (i % num == 0){
                System.out.print(i + " ");
            }
        }
    }
    
}
