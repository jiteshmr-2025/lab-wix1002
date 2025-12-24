/*
Write a program that display the number of characters, words and lines in a text file.
Assume that each word is separated by one space character.
 */
package l7q4;
import java.io.*;

/**
 *
 * @author jites
 */
public class L7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("hmm.txt"));
            
            String line;
            int lineCount = 0;
            int wordCount = 0;
            int charCount = 0;
            while ((line = br.readLine()) != null){
                charCount += line.length();
                String[] seperated = line.split("\\s+");
                for (int i = 0; i < seperated.length; i++){
                    if (!seperated[i].matches("[0-9]+")){
                        wordCount++;
                    }
                }
                lineCount++;
            }
            
            System.out.printf("Total number of words: %d%n", wordCount);
            System.out.printf("Total number of characters: %d%n", charCount);
            System.out.printf("Total number of lines: %d%n", lineCount);
            br.close();
        }
        catch (IOException e){
        }
    }
    
}
