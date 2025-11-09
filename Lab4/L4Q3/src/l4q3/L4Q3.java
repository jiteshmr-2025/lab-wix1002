/*
Write a program that calculates the minimum, maximum, average and standard
deviation (s) of the exam score in a subject. The program will accepts the score and
quit if negative score is enter. A sample output is given below.
*/
package l4q3;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author jites
 */
public class L4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        int minNum = 99;
        int maxNum = 0;
        double sumSquared = 0;
        double sum = 0;
        int i = 0;
        
        do {
            System.out.print("Enter a score [negative score to quit]: ");
            num = input.nextInt();
            
            if (num >= 0){
                if (num < minNum){
                    minNum = num;
                }

                if (num > maxNum){
                    maxNum = num;
                }

                sum += num;
                sumSquared += Math.pow(num, 2);
                i++;
            }
            
            
        }
        while (num >= 0);
        
        double variance = (sumSquared - (Math.pow(sum, 2) / i)) / (i - 1);
        System.out.printf("%.1f%n", variance);
        System.out.printf("Minimum number: %d%n", minNum);
        System.out.printf("Maximum number: %d%n", maxNum);
        System.out.printf("Average score: %.2f%n", (sum / i));
        
        double sd = Math.sqrt(variance);
        System.out.printf("Standard deviation: %.2f%n", sd);
    }
}
    
