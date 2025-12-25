/*
Define a class Fraction. The class has an input method that accepts the numerator and
the denominator from the user. Use the mutator method to set the numerator and
denominator and the accessor method to get the value of numerator and denominator.
This class also has a method to display the fraction reduced to lowest terms. (find the
greatest common divisor for the numerator and denominator. Create a Tester class to
test the program.)
 */
package Q4;

import java.util.Scanner;

/**
 *
 * @author jites
 */
public class Fraction {
    Scanner sc = new Scanner(System.in);
    private int numerator;
    private int denominator;
    
    
    public void input(){
        System.out.print("Please input the numerator: ");
        int userNumerator = sc.nextInt();
        System.out.print("Please input the denominator: ");
        int userDenominator = sc.nextInt();
        
        setNumerator(userNumerator);
        setDenominator(userDenominator);
    }
    
    public static int gcdRecursive(int a, int b) {
        // Base case: if b is 0, a is the GCD
        if (b == 0) {
            return a;
        }
        // Recursive step: call the function with b and the remainder of a / b
        return gcdRecursive(b, a % b);
    }
    
    public void displayLowestFraction(){
        int userNumerator = getNumerator();
        int userDenominator = getDenominator();
        System.out.println("Original Fraction.");
        System.out.printf("%d / %d %n", userNumerator, userDenominator);
        
        int gcd = 0;
        if (userNumerator > userDenominator){
            gcd = gcdRecursive(userNumerator, userDenominator);
            userNumerator /= gcd;
            userDenominator /= gcd;
        }
        else if (userNumerator < userDenominator){
            gcd = gcdRecursive(userDenominator, userNumerator);
            userNumerator /= gcd;
            userDenominator /= gcd;
        }
        
        System.out.println("Reduced Fraction.");
        System.out.printf("%d / %d%n", userNumerator, userDenominator);
    }
    
    // Mutator methods to set the instance variables to the method
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }
    
    public void setDenominator(int denominator){
        if (denominator == 0){
            System.out.println("Error. Denominators cannot have 0. Changing to 1.");
            this.denominator = 1;
        }
        else {
            this.denominator = denominator;
        }
    }
    
    // Accessor methods to return the instance variables
    public int getNumerator(){
        return numerator;
    }
    
    public int getDenominator(){
        return denominator;
    }
}
