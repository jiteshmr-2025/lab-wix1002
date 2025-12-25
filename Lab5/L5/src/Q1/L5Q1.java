/*
Write a program to randomly generate N student scores (0-100). The program will
prompt the user to enter N students and store the score in an array. Then, the program
will display a list of score, the highest score, the lowest score and the average score.
 */
package Q1;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author jites
 */
public class L5Q1 {
    public static void main(String[] args) {
        // Setup object import
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        // Setup inputs
        System.out.print("Please input the number of students: ");
        int N = input.nextInt();
        int sum = 0;
        
        // Setup array
        int[] score  = new int[N];
        
        // Randomly generate scores
        for (int i = 0; i < N; i++){
            score[i] = random.nextInt(0, 101);
        }
        
        // Display score list
        for (int i = 0; i < N; i++){
            System.out.print(score[i] + " ");
        }
        
        // Sort the array, find max, find min, find avg
        Arrays.sort(score);
        System.out.printf("%nThe maximum of the array is %d", score[N - 1]);
        System.out.printf("%nThe minimum of the array is %d%n", score[0]);
        for (int i = 0; i < N; i++){
            sum += score[i];
        }
        System.out.printf("The average is: %d%n", sum / N);
    }
    
}
