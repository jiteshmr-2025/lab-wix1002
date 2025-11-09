/*
Write a program that generates the first n prime number. n is an random integer
within 0 to 100
 */
package l4q8;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author jites
 */
public class L4Q8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(101); // random integer between 0 and 100 inclusive
        System.out.println("n = " + n);

        if (n == 0) {
            System.out.println("No primes to generate.");
            return;
        }

        List<Integer> primes = new ArrayList<>();
        int candidate = 2; // first prime

        while (primes.size() < n) {
            if (isPrime(candidate)) primes.add(candidate);
            candidate++;
        }

        System.out.println("First " + n + " prime(s):");
        for (int i = 0; i < primes.size(); i++) {
            System.out.print(primes.get(i));
            if (i < primes.size() - 1) System.out.print(", ");
        }
        System.out.println();
    }

    // Returns true if x is prime (efficient enough for this range)
    private static boolean isPrime(int x) {
        if (x < 2) return false;
        if (x == 2) return true;
        if (x % 2 == 0) return false;
        int limit = (int) Math.sqrt(x);
        for (int i = 3; i <= limit; i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }
    
}
