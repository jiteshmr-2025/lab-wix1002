/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q4_Extended;

import java.util.Random;

/**
 *
 * @author jites
 */
public class L5Q4_Extended {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrix = {
            {1, 5, 7},
            {3, 6, 9},
            {5, 3, 8}
        };
        int[][] rotatedMatrix = new int[3][3];
        int[][] fullRotation = new int[3][3];
        
        // 90 degrees
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                rotatedMatrix[2 - i][j] = matrix[j][i];
                /*
                1 5 7 ----> assume i = 0, j = 0, thus the 1 will be moved to i = 2, j = 0
                3 6 9
                5 3 8 
                */
            }
        }
        
        // 180 degrees
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                fullRotation[2 - i][2 - j] = matrix[i][j];
                /*
                1 5 7 ----> assume i = 0, j = 0, i = 2, j = 2 || i = 0, j = 1, i = 2, j = 1
                3 6 9 ----> assume i = 1, j = 0, i = 1, j = 1 || i = 1, j = 1, i = 1, j = 1
                5 3 8 ----> assume i = 2, j = 0, i = 0, j = 0 || i = 2, j = 1, i = 0, j = 1
                */
            }
        }
        
        
        // Printing
        // 90 degrees
        System.out.println("\n90 degrees");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\n180 degrees");
        // 180 degrees
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(fullRotation[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
