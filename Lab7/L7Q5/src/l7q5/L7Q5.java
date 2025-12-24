/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l7q5;

import java.io.*;

/**
 *
 * @author jites
 */
public class L7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.dat"))) {
            int record = inputStream.readInt();
            System.out.println(record);
            String[] name = new String[record];
            int[] age = new int[record];
            char[] gender = new char[record];
            while (true) {
                try {
                    for (int i = 0; i < record; i++) {
                        name[i] = inputStream.readUTF();
                        age[i] = inputStream.readInt();
                        gender[i] = inputStream.readChar();
                    }

                    // Sort the list
                    for (int i = 0; i < record - 1; i++) {
                        int minIndex = i;
                        for (int j = i + 1; j < record; j++) {
                            if (name[j].compareToIgnoreCase(name[minIndex]) < 0) {
                                minIndex = j;
                            }
                        }
                        
                        // Swaps. (might be an easier way to do this but wtv)
                        String temp = name[minIndex];
                        name[minIndex] = name[i];
                        name[i] = temp;
                        int temp2 = age[minIndex];
                        age[minIndex] = age[i];
                        age[i] = temp2;
                        char temp3 = gender[minIndex];
                        gender[minIndex] = gender[i];
                        gender[i] = temp3;

                    }
                    
                    for (int i = 0; i < record; i++){
                        System.out.printf("Name: %s Age: %d Gender: %c%n", name[i], age[i], gender[i]);
                    }
                } catch (EOFException e) {
                    break;
                }
            }

        } catch (IOException e) {

        }
    }

}
