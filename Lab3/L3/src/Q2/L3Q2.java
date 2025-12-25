/*
Generate a random integer within 0 to 5 and display the integer in word.
* 2 is two.
*/
package Q2;
import java.util.Random;
        
/**
 *
 * @author jites
 */
public class L3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int numRandom = random.nextInt(1, 6); // bound is exclusive
        switch (numRandom){
            case 1 -> System.out.println("1 is one.");
            case 2 -> System.out.println("2 is two.");
            case 3 -> System.out.println("3 is three.");
            case 4 -> System.out.println("4 is four.");
            default -> System.out.println("5 is five.");
        }
    }
    
}
