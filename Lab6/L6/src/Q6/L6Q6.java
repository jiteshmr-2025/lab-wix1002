/*
Write a Java method that determine whether a number is a palindromic prime and
another method that determine whether a number is emirp (the number is a prime
number and the reverse also a prime number and is not palindromic prime). Then,
write a Java program to use the methods to display the first 20 palindromic prime and
emirp.
 */
package Q6;

/**
 *
 * @author jites
 */
public class L6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Palindromic Prime
        int i = 0;
        int j = 0;
        
        System.out.print("\nPalindromic Prime: ");
        for (int a = 2; i < 20; a++) {
            int temp = a;
            int reversedNum = 0;

            while (temp != 0) {
                int digit = temp % 10;
                reversedNum = reversedNum * 10 + digit;
                temp /= 10;
            }

            if (palindromicPrime(a, reversedNum)) {
                System.out.printf("%d ", a);
                i++;
            }
        }
        
        System.out.print("\nEMIRP: ");
        for (int a = 2; j < 20; a++) {
            int temp = a;
            int reversedNum = 0;

            while (temp != 0) {
                int digit = temp % 10;
                reversedNum = reversedNum * 10 + digit;
                temp /= 10;
            }

            if (emirp(a, reversedNum)) {
                System.out.printf("%d ", a);
                j++;
            }
        }
    }

    public static boolean palindromicPrime(int a, int reversedNum) {
        if (reversedNum != a) {
            return false; // not a palindrome
        }
        for (int i = 2; i * i <= a; i++) {
            // If the number is divisible by 'i', it's not prime
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean emirp(int a, int reversedNum) {
        if (reversedNum != a) {
            for (int i = 2; i * i <= a; i++) {
                // If the number is divisible by 'i', it's not prime
                if (a % i == 0) {
                    return false;
                }
            }
            for (int i = 2; i * i <= reversedNum; i++) {
                // If the number is divisible by 'i', it's not prime
                if (reversedNum % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
