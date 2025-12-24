/*
The code below is used to read the contents of a Web page. Write the contents of the
Web page into a text file name index.htm.

 */
package l7q2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.net.URI;
import java.net.URL;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileWriter;

/**
 *
 * @author jites
 */
public class L7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            URL url = URI.create("https://fsktm.um.edu.my").toURL();
            
            try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                 BufferedWriter brWrite = new BufferedWriter(new FileWriter("index.htm"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    brWrite.write(line);
                    brWrite.newLine();
                    // Prints the HTML source
                }
            }

        } catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }
    }

}
