/*
Write a program that used to create Pascal Triangle in the square matrix. The program
will accept an integer from the users and use the integer to create the Pascal Triangle.
 */
package Q6;

import java.util.Scanner;

/**
 *
 * @author jites
 */
public class L5Q6 {

    public static void main(String[] args) {
        // Setup object imports
        Scanner input = new Scanner(System.in);

        // Setup variables
        System.out.print("Enter the number of row of Pascal's Triangle to generate: ");
        int rows = input.nextInt();
        int cols = rows;

        // Setup array
        int[][] pascal = new int[rows][cols];
        /*
        1 0 0 0 0 0  --> basically pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j]
        1 1 0 0
        1 2 1 
        1 3 3
        1 4 6
        1 5 10
         */
        
        // Setting up the first row and last number
        for (int i = 0; i  < rows; i++){
            pascal[i][0] = 1;
        }
        pascal[rows - 1][cols - 1] = 1;

        // Finishing up the Pascal's triangle
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }
        
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++) {
                System.out.print(pascal[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
