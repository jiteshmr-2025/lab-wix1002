/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

import java.util.Random;

/**
 *
 * @author jites
 */
public class Number {

    // Defining the random class
    Random random = new Random();
    int numOfInt;
    int bound;

    // Constructor to make sure instance values are now used in the class?
    public Number(int index, int arrayBound) {
        numOfInt = index;
        bound = arrayBound;
    }
    
    public Number(){
        numOfInt = 10;
        bound = 100;
    }
    
    public Number(int index){
        numOfInt = index;
        bound = 100;
    }
    
    public void displayInfo(){
        // Assigning numbers to the array and printing
        System.out.println("Elements in the array: ");
        int[] num = new int[numOfInt];
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(0, bound);
            System.out.print(num[i] + " ");
        }
        System.out.println("");
        
        // Finding out the even number, the prime number, the maximum number, the minimum number, the average, the square number.
        System.out.print("Even numbers: ");
        for (int i = 0; i < num.length; i++){
            if (num[i] % 2 == 0){
                System.out.print(num[i] + " ");
            }
        }
        System.out.println();
        
        System.out.print("Prime numbers: ");
        outerLoop:
        for (int i = 0; i < num.length; i++){
            for (int j = 2; i < Math.sqrt(num[i]); j++){
                if (num[i] / j % 2 == 0){
                    continue outerLoop;
                }
            }
            System.out.print(num[i] + " ");
        }
        System.out.println();
        
        int max = num[0];
        int min = num[0];
        int sum = 0;
        for (int i = 0; i < num.length; i++){
            if (num[i] > max){
                max = num[i];
            }
            if (num[i] < min){
                min = num[i];
            }
            sum += num[i];
            
        }
        System.out.printf("Maximum number: %d%n", max);
        System.out.printf("Minimum number: %d%n", min);
        System.out.printf("Average: %d%n", sum / num.length);
        
        System.out.println("Square number arrays: ");
        for (int i = 0; i < num.length; i++){
            System.out.printf("%d ", num[i] * num[i]);
        }
        System.out.println("\n\n");
    }
}
