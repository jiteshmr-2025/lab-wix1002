/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q5;
import java.util.Random;
/**
 *
 * @author jites
 */
public class L2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rd = new Random();
        int rd1 = rd.nextInt(10001);
        System.out.printf("Random number: %d%n", rd1);
        
        // Making a digitsum
        int temp = rd1, sum = 0;
        while (temp > 0){
            sum += temp % 10;
            temp = temp / 10;
        }   
        System.out.printf("Sum of all the digits: %d%n", sum);
    }
    
}
