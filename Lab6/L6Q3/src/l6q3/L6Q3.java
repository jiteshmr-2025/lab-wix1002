/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l6q3;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author jites
 */
public class L6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        
        int[] num = new int[10];
        for (int i = 0; i < 10; i++){
            num[i] = random.nextInt(0, 10);
            System.out.printf("%d ", num[i]);
        }
        System.out.println("");
        int[] reversedInteger = reverseInt(num);
        for (int i = 0; i < 10; i++){
            System.out.printf("%d ", reversedInteger[i]);
        }
    }
    
    /**
     *
     * @param num
     * @return
     */
    public static int[] reverseInt(int[] num){
        int[] reversedNum = new int[10];
        for (int i = 0; i < 10; i++){
            reversedNum[i] = num[9 - i];
        }
        
        return reversedNum;
    }
    
}
