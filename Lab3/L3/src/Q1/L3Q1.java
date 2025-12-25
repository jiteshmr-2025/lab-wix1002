/*
Write a program that stimulates a simple calculator. It reads two integers and a
character. If the character is a +, the sum is printed; if it is a -, the difference is
printed; if is a *, the multiplication is printed; if it is a /, the quotient is printed; and if
it is a %, the remainder is printed. (Use the String.charAt(0) to return the character)
*/
package Q1;

// Imports
import java.util.Scanner;

/**
 *
 * @author jites
 */
public class L3Q1 {

    public static void main(String[] args) {
        // Setup imports and variables
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        
        // User inputs
        System.out.print("Enter two integer number: ");
        String inputLine = input.nextLine();
        System.out.print("Enter the operand: ");
        Character operand = input.next().charAt(0);
        
        // Seperating the two integers
        String[] numberAsString = inputLine.split("\\s+");
        
        if(numberAsString.length == 2){
            num1 = Integer.parseInt(numberAsString[0]);
            num2 = Integer.parseInt(numberAsString[1]);
        }
        
        else{
            System.out.println("Error, please use a space in between.");
        }
        
//        if (operand.equals('+')) {
//            System.out.printf("%d %s %d = %d", num1, operand, num2, (num1 + num2));
//        } else if(operand.equals('-')){
//            System.out.printf("%d %s %d = %d", num1, operand, num2, (num1 - num2));
//        }
//        else if(operand.equals('*')){
//            System.out.printf("%d %s %d = %d", num1, operand, num2, (num1 * num2));
//        }
//        else if(operand.equals('/')){
//            System.out.printf("%d %s %d = %d", num1, operand, num2, (num1 / num2));
//        }
//        else if(operand.equals('%')){
//            System.out.printf("%d %s %d = %d", num1, operand, num2, (num1 % num2));
//        }
//        else{
//            System.out.println("Error.");
//        }

        // Switch case for operands (more better, rule switch)
        switch (operand) {
            case '+' -> System.out.printf("%d %s %d = %d", num1, operand, num2, (num1 + num2));
            case '-' -> System.out.printf("%d %s %d = %d", num1, operand, num2, (num1 - num2));
            case '*' -> System.out.printf("%d %s %d = %d", num1, operand, num2, (num1 * num2));
            case '/' -> System.out.printf("%d %s %d = %d", num1, operand, num2, (num1 / num2));
            case '%' -> System.out.printf("%d %s %d = %d", num1, operand, num2, (num1 % num2));
            default -> System.out.println("Error.");
        }
    }
}
