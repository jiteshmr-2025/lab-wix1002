package Q4_Extended;

import java.util.Scanner;

public class L4Q4_Extended {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the year and the first day of the year
        System.out.print("Please input the year: ");
        int year = input.nextInt();
        System.out.print("Please input the first day of the year (0=Su, 1=Mo, ... 6=Sa): ");
        int firstDayOfYear = input.nextInt(); // This is the starting day for Jan 1
        System.out.print("Please input month (1-12): ");
        int month = input.nextInt();

        // 1. Correct leap year calculation
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        
        // 2. Calculate the first day of the *target month*
        // We start with the first day of Jan 1
        int firstDayOfMonth = firstDayOfYear;
        
        // Loop from January (m=1) up to the month *before* our target
        for (int m = 1; m < month; m++) {
            // Add the number of days in month 'm' to our offset
            int daysInCurrentMonth = 0;
            
            daysInCurrentMonth = switch (m) {
                case 2 -> isLeap ? 29 : 28;
                case 4, 6, 9, 11 -> 30;
                default -> 31;
            }; // Special case for February
            // April, June, Sept, Nov
            // Jan, Mar, May, Jul, Aug, Oct, Dec
            
            // Add the days and use modulo 7 to find the new starting day
            firstDayOfMonth = (firstDayOfMonth + daysInCurrentMonth) % 7;
        }
        
        // 3. Get the name and total days for the *target month*
        String monthName = "";
        int daysInMonth = 0;

        switch (month) {
            case 1 -> {
                monthName = "January"; daysInMonth = 31;
            }
            case 2 -> {
                monthName = "February"; daysInMonth = isLeap ? 29 : 28;
            }
            case 3 -> {
                monthName = "March"; daysInMonth = 31;
            }
            case 4 -> {
                monthName = "April"; daysInMonth = 30;
            }
            case 5 -> {
                monthName = "May"; daysInMonth = 31;
            }
            case 6 -> {
                monthName = "June"; daysInMonth = 30;
            }
            case 7 -> {
                monthName = "July"; daysInMonth = 31;
            }
            case 8 -> {
                monthName = "August"; daysInMonth = 31;
            }
            case 9 -> {
                monthName = "September"; daysInMonth = 30;
            }
            case 10 -> {
                monthName = "October"; daysInMonth = 31;
            }
            case 11 -> {
                monthName = "November"; daysInMonth = 30;
            }
            case 12 -> {
                monthName = "December"; daysInMonth = 31;
            }
            default -> {
                System.out.println("Invalid month."); return;
            }
        }
        
        // --- End of new logic ---

        // 4. Print the calendar
        System.out.printf("%n%s %d%n", monthName, year);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("\tSu\tMo\tTu\tWe\tTh\tFr\tSa");
        System.out.println("----------------------------------------------------------------------------------");

        // 5. Fix for printing the initial spaces
        for (int i = 0; i < firstDayOfMonth; i++) {
            System.out.print("\t");
        }

        // 6. Fix for looping the correct number of days
        for (int i = 1; i <= daysInMonth; i++) {
            System.out.printf("\t%d", i);

            // 7. Fix for printing newlines
            // If the day we just printed (i) plus its offset (firstDayOfMonth)
            // is a multiple of 7, it means it's a Saturday. Print a newline.
            if ((i + firstDayOfMonth) % 7 == 0) {
                System.out.println();
            }
        }
        
        // Print one final newline if the month doesn't end on a Saturday
        if ((daysInMonth + firstDayOfMonth) % 7 != 0) {
             System.out.println();
        }
    }
}