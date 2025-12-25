/*
Define a class Game. The class has a constructor that accept player name. Besides,
the class contains a method move that roll the dice. Create a Tester class to test the
program with two players and the player that reach 100 or more win the game
 */
package Q5;

import java.util.Random;
/**
 *
 * @author jites
 */
public class Game {
    Random random = new Random();
    
    public String name;
    private int dice;
    
    public Game(String name){
        this.name = name;
    }
    
    public void setDice(int dice){
        this.dice += dice;
    }
    
    public int getDice(){
        return dice;
    }
    
    public void roll(int num){
        System.out.printf("%s%n", name);
        System.out.printf("Round %d%n", num);
        int rolled = random.nextInt(1, 7);
        setDice(rolled);
        
        System.out.printf("Dice: %d%n", rolled);
        System.out.printf("Total Dice: %d%n%n", getDice());
    }
}
