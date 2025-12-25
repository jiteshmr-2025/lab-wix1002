/*
The class allows the customer to open the saving
account with their name, IC or passport number and the deposit amount. The class
consists of deposit method and withdraws method. Besides, the class can display the
current balance. 
 */
package Q2;

/**
 *
 * @author jites
 */
public class BankAccount {
    String name;
    String ic;
    int deposit;
    
    int balance = 0;
    
    // Create constructor class again
    public BankAccount (String accountName, String accountIC, int accountDeposit){
        name = accountName;
        ic = accountIC;
        deposit = accountDeposit;
    }
    
    public void depositMoney(){
        balance += deposit;
        System.out.println("Money has been deposited.");
        System.out.printf("Money deposited: RM%d%n", deposit);
    }
    
    public void withdrawMoney(int withdraw){
        if (balance - withdraw > 5){
            balance -= withdraw;
            System.out.println("Money has been withdrawn.");
            System.out.printf("Money withdrawn: RM%d%n", withdraw);
        }
        else {
            System.out.println("You don't have enough balance.");
        }
    }
    
    public void checkBalance(){
        System.out.println("\n\n------ Account Balance ------");
        System.out.printf("Name\t\t\t\t: %s%n", name);
        if (!ic.matches("[0-9]+")){
            System.out.printf("Passport Number: %s%n", ic);
        }
        else {
            System.out.printf("Identification Number(IC)\t: %s%n", ic);
        }
        System.out.printf("Balance\t\t\t\t: RM%s%n", balance);
        
    }
}
