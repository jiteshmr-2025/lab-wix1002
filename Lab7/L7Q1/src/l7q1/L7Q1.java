/*
Write a program that store the table below in a binary file name coursename.dat.
Then, ask the users to enter a course code. The program will display the course name
from coursename.dat.
 */
package l7q1;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

import java.util.Scanner;

/**
 *
 * @author jites
 */
public class L7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        String[][] data = {{"WXES1116", "Programming I"}, {"WXES1115", "Data Structure"}, {"WXES1110", "Operating System"}, {"WXES1112", "Computing Mathematics I"}};

        // Writing the binary file.
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("coursename.dat"));

            outputStream.writeObject(data);

            outputStream.close();
        } catch (IOException e) {
            System.out.println("Problem with file output.");
        }

        System.out.print("Please input a course code: ");
        String check = input.nextLine();
        boolean found = false;

        // Reading from the binary file.
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("coursename.dat"));

            String[][] outputData = (String[][]) inputStream.readObject();

            for (String[] outputData1 : outputData) {
                if (check.equals(outputData1[0])) {
                    System.out.printf("Course found: %s%n", outputData1[1]);
                    found = true;
                    break;
                }
            }
            
            if (!found){
                System.out.println("No course found. Change the course code.");
            }

            inputStream.close();
        } catch (IOException e) {
            System.out.println("Problem with file reading.");
        }

    }
}
