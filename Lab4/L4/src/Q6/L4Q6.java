/*
Write a program that generates a non-negative random integer. Display the number of
digits in the integer
 */
package Q6;

import java.util.Random;
/**
 *
 * @author jites
 */
public class L4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        
        int random1 = random.nextInt(0, Integer.MAX_VALUE);
        System.out.println(random1);
        double len = Math.ceil(Math.log10(random1 + 1));
        System.out.printf("%.0f%n",len);
    }
    
}
