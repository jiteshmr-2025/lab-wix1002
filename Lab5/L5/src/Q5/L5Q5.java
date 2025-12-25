/*
Write a program that generates 20 random integers within the range from 0 to 100.
Sort the array in descending order. Then, accepts an integer input from the user. Then,
search the array using this number. Compare the performance of linear search and
binary search

This program assumes that the user knows the array printed.
*/
package Q5;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author jites
 */
public class L5Q5 {
    public static void main(String[] args) {
        
        // Setup object imports and arrays
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int[] arr1 = new int[20];
        
        // Adding values to the matrix
        System.out.println("A list of 20 random integers from 0 - 100: ");
        for (int i = 0; i < arr1.length; i++){
            int rand = random.nextInt(0, 101);
            arr1[i] = rand;
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        
        // Array in descending order
        Arrays.sort(arr1);
        int[] arr2 = new int[20];
        for (int i = arr1.length - 1; i >= 0; i--){
            arr2[19 - i] = arr1[i];
        }
        System.out.println("Array in descending order: ");
        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        
        // Entering an integer
        System.out.print("Enter a number to search: ");
        int key = input.nextInt();
        
        // Linear search
        int linearLooped = 0;
        for (int i = 0; i < arr2.length; i++){
            if (key == arr2[i]){
                System.out.printf("%d found.%n", key);
                break;
            }
            linearLooped++;
        }
        System.out.printf("Linear search: %d loop(s)%n", linearLooped);
        
        
        // Binary search
        int binaryLooped = 0;
        int low = 0;
        int high = arr2.length - 1;
        
        while (low <= high){
            int middle = low + (high - low) / 2;
            if (key == arr2[middle]){
                System.out.printf("%d found.%n", key);
                break;
            }
            else if (key > middle){
                high = middle - 1;
            }
            else {
                low = middle + 1;
            }
            binaryLooped++;
        }
        System.out.printf("Binary search: %d loop(s)%n", binaryLooped);
    }
    
}
