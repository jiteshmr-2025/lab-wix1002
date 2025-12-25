/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q6;

/**
 *
 * @author jites
 */
public class Tester {
    public static void main(String[] args) {
        Burger a = new Burger("01", 100);
        Burger b = new Burger("02", 2000);
        
        a.sold(100);
        b.sold(100);
        
        Burger.totalSales();
    }
}
