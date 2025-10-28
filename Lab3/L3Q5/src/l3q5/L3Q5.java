/*
Cramer’s rule is used to solve the linear equations.
ax + by = e, cx + dy = f; x = (ed-bf)/(ad-bc) y=(af-ec)/(ad-bc)
Write a program that ask the user to enter a, b, c, d, e, f. and display the result of x
and y. If ad – bc is equal to 0. Display "The equation has no solution"
*/
package l3q5;
import java.util.Scanner;
/**
 *
 * @author jites
 */
public class L3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Setup imports and variables
        Scanner input = new Scanner(System.in);
        int a, b, c, d, e, f, x, y;
        
        // Setup inputs
        System.out.println("== CRAMER'S RULE CHECKER ==");
        System.out.print("Please input a ,b ,c ,d ,e ,f seperated by spaces: ");
        String inputs = input.nextLine();
        
        String[] numberAsString = inputs.split("\\s+");
        
        if(numberAsString.length == 6){
            a = Integer.parseInt(numberAsString[0]);
            b = Integer.parseInt(numberAsString[1]);
            c = Integer.parseInt(numberAsString[2]);
            d = Integer.parseInt(numberAsString[3]);
            e = Integer.parseInt(numberAsString[4]);
            f = Integer.parseInt(numberAsString[5]);
            
            x = (e*d-b*f)/(a*d-b*c);
            y = (a*f-e*c)/(a*d-b*c);
            
            
            if ((a * d - b * c) == 0){
                System.out.println("The equation has no solution");
            }
            else {
                System.out.printf("x: %d, y: %d%n", x, y);
            }
        }
        else {
            System.out.println("Please input your numbers again.");
        }
        
        
    }
    
}
