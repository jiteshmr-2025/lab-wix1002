/*
Define class money. The class is used to calculate the number of note and coins for a
given amount of money. The available notes are RM100, RM50, RM10, RM5 and
RM1. The available coins are 50 cent, 20 cent, 10 cent and 5 cent. The class needs to 
round up the amount according to the table below. The class also contains addition
and subtraction method to add or subtract two objects.
 */
package Q7;

/**
 *
 * @author jites
 */
public class Money {
    private int totalCents;
    
    public Money(double amount){
        setAmount(amount);
    }
    
    public void setAmount(double amount){
        int cents = (int) Math.round(amount * 100);
        
        // 2. Apply "Swedish Rounding" logic using Modulo (%)
        int remainder = cents % 5;
        
        switch (remainder) {
            case 1 -> cents -= 1;      // Round down 11 -> 10
            case 2 -> cents -= 2;      // Round down 12 -> 10
            case 3 -> cents += 2;      // Round up 13 -> 15
            case 4 -> cents += 1;      // Round up 14 -> 15
            default -> {
            }
        }
        // If remainder is 0 (e.g. 10, 15, 20), do nothing.

        this.totalCents = cents;
    }
    
    public Money add(Money otherMoney){
        double newTotal = (this.totalCents + otherMoney.totalCents) / 100.00;
        return new Money(newTotal);
    }
    
    public Money subtract(Money otherMoney){
        double newTotal = (this.totalCents - otherMoney.totalCents) / 100.00;
        return new Money(newTotal);
    }
    
    public void printBreakdown() {
        // Work with a temporary copy so we don't lose the actual total
        int currentAmount = this.totalCents; 
        
        System.out.printf("Total Rounded Amount: RM %.2f%n", (currentAmount / 100.0));
        System.out.println("---------------------------");

        // 1. Calculate Notes (10000 cents = RM100)
        int num100 = currentAmount / 10000;
        currentAmount %= 10000; // Remove the RM100s from the total

        int num50 = currentAmount / 5000;
        currentAmount %= 5000;

        int num10 = currentAmount / 1000;
        currentAmount %= 1000;

        int num5 = currentAmount / 500;
        currentAmount %= 500;

        int num1 = currentAmount / 100;
        currentAmount %= 100;

        // 2. Calculate Coins
        int cent50 = currentAmount / 50;
        currentAmount %= 50;

        int cent20 = currentAmount / 20;
        currentAmount %= 20;

        int cent10 = currentAmount / 10;
        currentAmount %= 10;

        int cent5 = currentAmount / 5;
        // No remainder check needed here because we already rounded to nearest 5c

        // 3. Print Results
        System.out.println("RM 100 : " + num100);
        System.out.println("RM 50  : " + num50);
        System.out.println("RM 10  : " + num10);
        System.out.println("RM 5   : " + num5);
        System.out.println("RM 1   : " + num1);
        System.out.println("50 sen : " + cent50);
        System.out.println("20 sen : " + cent20);
        System.out.println("10 sen : " + cent10);
        System.out.println("5 sen  : " + cent5 + "\n");
    }
}
