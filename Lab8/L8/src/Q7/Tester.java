/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q7;

/**
 *
 * @author jites
 */
public class Tester {

    public static void main(String[] args) {
        // 1. You buy a book for RM 15.50
        Money bookPrice = new Money(15.50);

        // 2. You buy a pen for RM 4.20
        Money penPrice = new Money(4.20);

        // 3. THIS is where the add method is used!
        // The program needs to sum them up to get the total bill.
        Money totalBill = bookPrice.add(penPrice);

        // 4. Print the breakdown for the TOTAL bill
        System.out.println("Total Bill Breakdown:");
        totalBill.printBreakdown();

        // 5. You pay with RM 50. THIS is where subtract is used!
        Money payment = new Money(50.00);
        Money change = payment.subtract(totalBill);

        System.out.println("Change Breakdown:");
        change.printBreakdown();
    }
}
