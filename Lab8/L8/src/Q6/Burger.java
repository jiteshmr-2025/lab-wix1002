/*
You operate several burger stalls distributed throughout town. Each burger stall has
an ID and the number of burger sold for the day. The class consists of a constructor to
initialize the instance variables and a sold method that increment the number of
burger sold by parameter value. The class also contains a variable and method that
tracks the total number of burgers sold in all stalls. Display the total burger sold by
each stall and the total number of burgers sold in all stalls
 */
package Q6;

/**
 *
 * @author jites
 */
public class Burger {
    private String id;
    private int numOfBurgers;
    public static int totalBurgers = 0;
    
    public Burger(String id, int numOfBurgers){
        this.id = id;
        this.numOfBurgers = numOfBurgers;
        totalBurgers += this.numOfBurgers;
        System.out.printf("Stall %s sold %d burgers initally.%n", this.id, this.numOfBurgers);
    }
    
    public void sold(int numOfBurgersSold){
        this.numOfBurgers += numOfBurgersSold;
        totalBurgers += numOfBurgersSold;
        
        System.out.printf("Stall %s sold another %d more burgers.%n", this.id, numOfBurgersSold);
    }
    
    public static void totalSales(){
        System.out.printf("Total of burgers through all stalls: %d burgers.%n", totalBurgers);
    }
}
