/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q3;
import java.util.Random;
/**
 *
 * @author jites
 */
public class L2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        
        int random1 = random.nextInt(41) + 10;
        int random2 = random.nextInt(41) + 10;
        int random3 = random.nextInt(41) + 10;
        
        System.out.printf("Random numbers: %d, %d, %d%n", random1, random2, random3);
        System.out.printf("Sum = %d%n", (random1 + random2 + random3));
        System.out.printf("Average: %d%n", (random1 + random2 + random3)/ 2);
    }
    
}
