/*
Write a simple two players dice game. Each player will take turns to roll a dice. The
first players that reach more than 100 points win the game. If the player rolls a 6, the
player will score 6 points and has the chance to roll again.
 */
package Q5;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author jites
 */
public class L4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String inputs;
        int p1 = 0;
        int p2 = 0;
        int sum1 = 0, sum2 = 0;
        int round = 1;

        while (sum1 <= 100 || sum2 <= 100) {
            System.out.printf("Round %d%n", round);
            do {
                System.out.print("Player 1, roll your dice by pressing Enter: ");
                inputs = input.nextLine();

                if (inputs.isEmpty()) {
                    p1 = random.nextInt(1, 7);
                    System.out.printf("Dice 1: %d%n", p1);
                }
                sum1 += p1;
            } while (p1 == 6);

            do {
                System.out.print("Player 2, roll your dice by pressing Enter: ");
                inputs = input.nextLine();

                if (inputs.isEmpty()) {
                    p2 = random.nextInt(1, 7);
                    System.out.printf("Player 2: %d%n", p2);
                }
                sum2 += p2;
            } while (p2 == 6);
            round++;
        }
        if (sum1 > sum2){
            System.out.printf("%nPlayer 1 wins with a score of %d.", sum1);
        }
        else{
            System.out.printf("%nPlayer 2 wins with a score of %d.", sum2);
        }
    }

}
