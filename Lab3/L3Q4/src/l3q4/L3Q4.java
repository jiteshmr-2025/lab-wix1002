/*
Write a simple two players dice game. Each player will roll the dice twice and the
player with the highest score wins the game
*/
package l3q4;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author jites
 */
public class L3Q4 {

    public static void main(String[] args) {
        // Setup objects and variables
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        String inputs;
        int d1p1 = 0, d1p2 = 0, d2p1 = 0, d2p2 = 0;
        int dice1, dice2;
        
        // Player 1
        System.out.print("Player 1, roll your dice by pressing Enter: ");
        inputs = input.nextLine();
        
        if(inputs.isEmpty()){
            d1p1 = random.nextInt(1, 7);
            System.out.printf("Dice 1: %d%n", d1p1);
        }
        
        System.out.print("Player 1, roll your next dice by pressing Enter: ");
        inputs = input.nextLine();
        
        if(inputs.isEmpty()){
            d2p1 = random.nextInt(1, 7);
            System.out.printf("Dice 2: %d%n", d2p1);
        }
        
        // Player 2
        System.out.print("Player 2, roll your dice by pressing Enter: ");
        inputs = input.nextLine();
        
        if(inputs.isEmpty()){
            d1p2 = random.nextInt(1, 7);
            System.out.printf("Dice 1: %d%n", d1p2);
        }
        
        System.out.print("Player 2, roll your next dice by pressing Enter: ");
        inputs = input.nextLine();
        
        if(inputs.isEmpty()){
            d2p2 = random.nextInt(1, 7);
            System.out.printf("Dice 2: %d%n", d2p2);
        }
        
        // Dice total
        dice1 = d1p1 + d2p1;
        dice2 = d1p2 + d2p2;
        
        // Compare dice total
        if (dice1 > dice2){
            System.out.println("Player 1 wins.");
        }
        
        else if (dice1 < dice2){
            System.out.println("Player 2 wins.");
        }
        
        else {
            System.out.println("Tie");
        }
    }
    
}
