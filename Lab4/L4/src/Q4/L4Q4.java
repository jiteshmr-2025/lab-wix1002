/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q4;

import java.util.Scanner;

/**
 *
 * @author jites
 */
public class L4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean leap;
        int firstDayOfMay = 0;
        int firstDayOfAugust = 0;
        Scanner input = new Scanner(System.in);

        // Get the year and the first day of the year
        System.out.print("Please input the year: ");
        int year = input.nextInt();
        System.out.print("Please input the first day of the year: ");
        int day = input.nextInt();

        // Find out if year is a leap year to define the days
        leap = year % 4 == 0 && year % 100 != 0;

        // Now if leap year -> has 366 days, not leap year -> has 365 days
        // We find out how to build May's calendar based on the leap year and the switch cases
        System.out.printf("%nMay %d%n", year);
        System.out.println("\tSu\tMo\tTu\tWe\tTh\tFr\tSa");

        if (leap) {
            firstDayOfMay = (day + 121) % 7;

        }
        if (!leap) {
            firstDayOfMay = (day + 120) % 7;

        }
        String skip = "\txx".repeat(firstDayOfMay - 1);
        System.out.print(skip);
        for (int i = 1; i <= 31; i++) {
            System.out.printf("\t%d", i);
            firstDayOfMay++;
            if (i <= 7 && firstDayOfMay % 8 == 0) {
                System.out.println();
                firstDayOfMay = 0;
            }
            if (i > 8 && firstDayOfMay % 7 == 0) {
                System.out.println();
                firstDayOfMay = 0;
            }
        }
        
        // We now do the same for August
        System.out.printf("%n%nAugust %d%n", year);
        System.out.println("\tSu\tMo\tTu\tWe\tTh\tFr\tSa");

        if (leap) {
            firstDayOfAugust = (day + 213) % 7;

        }
        if (!leap) {
            firstDayOfAugust = (day + 212) % 7;

        }
        String skip_2 = "\txx".repeat(firstDayOfAugust - 1);
        System.out.print(skip_2);
        for (int i = 1; i <= 31; i++) {
            System.out.printf("\t%d", i);
            firstDayOfAugust++;
            if (i <= 7 && firstDayOfAugust % 8 == 0) {
                System.out.println();
                firstDayOfAugust = 0;
            }
            if (i > 8 && firstDayOfAugust % 7 == 0) {
                System.out.println();
                firstDayOfAugust = 0;
            }
        }
    }
}
