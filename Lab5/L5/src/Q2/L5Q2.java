/*
Write a program that generates 10 non-duplicate random integers within the range
from 0 to 20.
 */
package Q2;

import java.util.Random;
import java.util.HashSet;
/**
 *
 * @author jites
 */
public class L5Q2 {

    public static void main(String[] args) {
        // Setup object imports/variables
        Random random = new Random();
        HashSet<Integer> values = new HashSet<>();
        int targetValues = 10;
        
        while (values.size() < targetValues) {
            int num = random.nextInt(21);
            values.add(num);
        }
        System.out.println("10 Unique numbers generated: " + values);
    }
}
