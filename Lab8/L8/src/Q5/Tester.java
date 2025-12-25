/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author jites
 */
public class Tester {
    public static void main(String[] args) {
        Game player_a = new Game("Jitesh");
        Game player_b = new Game("Lukesh");
        int i = 1, j = 1;
        
        while (true){
            player_a.roll(i);
            i++;
            
            if (player_a.getDice() >= 100){
                System.out.printf("%s wins.", player_a.name);
                break;
            }
            player_b.roll(j);
            j++;
            
            if (player_b.getDice() >= 100){
                System.out.printf("%s wins.", player_b.name);
                break;
            }
        }
    }
}
