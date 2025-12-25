/*
Write a program that rotates 90 degrees clockwise a 3 by 3 matrix
 */
package Q4;
import java.util.Random;
/**
 *
 * @author jites
 */
public class L5Q4 {
    public static void main(String[] args) {
        // Setup object imports and array
        Random random = new Random();
        int[][] matrix = {
            {1, 5, 7},
            {3, 6, 9},
            {5, 3, 8}
        };
        
        // Transpose
        int[][] tempMatrix = new int[3][3];
        int[][] transposedMatrix = new int[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                tempMatrix[j][i] = matrix[i][j];
            }
        }
        
        // Change the column 3 to column 1 and the column 1 to column 3
        for (int i = 0; i < 3; i++){
            transposedMatrix[i][2] = tempMatrix[i][0];
            transposedMatrix[i][0] = tempMatrix[i][2];
            transposedMatrix[i][1] = tempMatrix[i][1];
        }
        
        // Printing the transposed matrix
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
