/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;
/**
 *
 * @author jites
 */
public class Tester {
    public static void main(String[] args){
        BankAccount a = new BankAccount("Jitesh", "061029021059", 100);
        a.depositMoney();
        a.withdrawMoney(10);
        a.checkBalance();
    }
}
