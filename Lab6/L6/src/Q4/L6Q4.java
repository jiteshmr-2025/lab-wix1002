/*
Euclidean Algorithm
Divide both integers, take the smallest integer and divide by the remainder until remainder is 0, the divisor is the GCD
 */
package Q4;

import java.util.Scanner;

/**
 *
 * @author jites
 */
public class L6Q4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input 2 integers followed by a space: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int gcd = euclidean(a, b);
        System.out.printf("The GCD for both %d and %d is: %d%n", a, b, gcd);
    }

    /**
     * Uses a technique called recursion, basically calling the method on itself to repeat the method until said value is achieved.
     * @param a
     * @param b
     * @return 
     */
    public static int euclidean(int a, int b) {
        if (b == 0){
            return a;
        }
        return euclidean(b, a % b);
    }

}
