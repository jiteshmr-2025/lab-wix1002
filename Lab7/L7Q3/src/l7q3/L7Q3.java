/*
Write the statements that replace each line of a text file with its reverse and save it to
a new text file name reverse.txt
 */
package l7q3;
import java.io.*;
/**
 *
 * @author jites
 */
public class L7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            StringBuilder str = new StringBuilder();
            BufferedReader br = new BufferedReader(new FileReader("forward.txt"));
            BufferedWriter brWrite = new BufferedWriter(new FileWriter("reverse.txt"));
            
            String line;
            
            while ((line = br.readLine()) != null){
                for (int i = 0; i < line.length(); i++){
                    str.append(line.charAt(line.length() - i - 1));
                }
                brWrite.write(str.toString());
                brWrite.newLine();
                str.delete(0, str.length());
            }
            br.close();
            brWrite.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    
}
