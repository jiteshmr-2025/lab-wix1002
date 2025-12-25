/*
Define a class name WeightCalculator. The class has an input method that accepts the
user’s age and height. Besides, the class consists a method that calculating the
recommend weight with this formula
recommend weight = (height – 100 + age / 10) * 0.9
The class will display the user’s age, height and the recommend weight. Create a
Tester class to test the program.
 */
package Q3;

import java.util.Scanner;
/**
 *
 * @author jites
 */
public class WeightCalculator {
    Scanner sc = new Scanner(System.in);
    public int age;
    public int height;
    public double weight;
    
    public void input(){
        System.out.print("Please input your age: ");
        age = sc.nextInt();
        System.out.print("Please input your height (in cm): ");
        height = sc.nextInt();
    }
    
    public void calcWeight(){
        weight = ((height - 100 + age / 10) * 0.9);
    }
    
    public void displayInfo(){
        input();
        calcWeight();
        System.out.println("------- User Report -------");
        System.out.printf("Age\t\t\t: %d%n", age);
        System.out.printf("Height\t\t\t: %d%n", height);
        System.out.printf("Recommended Weight\t: %.2f%n", weight);
    }
}


