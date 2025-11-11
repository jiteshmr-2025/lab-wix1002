/*
Write a program that randomly generate the seven day work hours (1-8 hours) for N
employee. Then, display the work hours in seven days and the total hours for each
employee.
 */
package l5q3;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author jitesh
 */
public class L5Q3 {
    public static void main(String[] args) {
        // Setup object import
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        // Generate a 2D array -> [[1, 2, 5, 4, 3, 2, 7], -> Refers to employee 1 and later can add all the work hours depending on employee]
        System.out.print("How many employees do you have: ");
        int employee = input.nextInt();
        
        // Setup array and vafiables
        int[][] employees = new int[employee][7];
        int sum = 0;
        
        for (int i = 0; i < employee; i++){
            sum = 0;
            System.out.printf("Employee %d: ", i + 1);
            for (int j = 0; j < 7; j++){
                int rand = random.nextInt(1, 9);
                employees[i][j] = rand;
                System.out.print(" " + rand);
                sum += rand;
            }
            System.out.printf("--> %d%n", sum);
        }
        
    }
    
}
