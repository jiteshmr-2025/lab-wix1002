/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q5;

import java.util.Scanner;
import java.util.regex.*;
import java.util.*;

/**
 *
 * @author jites
 */
@SuppressWarnings("empty-statement")
public class L6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c;
        int num = 0;
        // TODO code application logic here
        // First print the statements
        do {
            System.out.println("Enter negative number to quit.");
            String game = input.nextLine().trim();
            Matcher m = Pattern.compile("-?\\d+").matcher(game);  // -? allows negative numbers
            List<Integer> numbers = new ArrayList<>();

            while (m.find()) {
                numbers.add(Integer.parseInt(m.group()));
            }

            // Access numbers
            int a = numbers.get(0);  // 5
            int b = numbers.get(1);  // 8
            c = numbers.get(2);  // -50

            num = multiply(a, b, c) ? num + 1 : num;
        } while (c > 0);

        // After all the loops finished
        System.out.printf("Your score is %d%n", num);
    }

    public static boolean multiply(int a, int b, int c) {
        return a * b == c;
    }

}
