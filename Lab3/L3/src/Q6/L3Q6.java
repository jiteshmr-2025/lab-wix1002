/*
Write a program that asks users to enter the radius of a circle and a coordinate point
(x, y). Determine whether the point is inside or outside the circle centered at (0, 0).

Way to find:
Calculate the distance of the point from the centre,
    if lesser -> within circle
    if same -> circumference
    if more -> outside circle
*/
package Q6;
import java.util.Scanner;
/**
 *
 * @author jites
 */
public class L3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Setup imports and variables
        Scanner input = new Scanner(System.in);
        
        // Setup inputs
        System.out.print("Enter the radius of the circle with a similar format (x,y): ");
        String centre = input.next();
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        System.out.print("Enter a random coordinate point with a similar format, (x,y): ");
        String coords =  input.next();
        
        // String seperation from coordinates -> substring doesn't count spaces -> so make sure input doesn't have space
        String intCentre = centre.substring(1 ,(centre.length() - 1));
        String[] finalCentre = intCentre.split(",");
        
        int a = Integer.parseInt(finalCentre[0]);
        int b = Integer.parseInt(finalCentre[1]);
        
        String intCoords = coords.substring(1 ,(coords.length() - 1));
        String[] finalCoords = intCoords.split(",");
        
        int x = Integer.parseInt(finalCoords[0]);
        int y = Integer.parseInt(finalCoords[1]);
        
        // Code to calculate distance
        double dist = Math.pow(x - a, 2) + Math.pow(y - b, 2);
        
        // Comparing distance with radius
        if (dist > radius){
            System.out.println("The coordinates are outside of the circle.");
        }
        else if(radius > dist){
            System.out.println("The coordinates are inside the circle.");
        }
        
        else{
            System.out.println("The coordinates are on the circle");
        }
    }
    
}
