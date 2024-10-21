package LydiasVersion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class La01Q03HashSet {
    public static void main(String[] args) {
        String fileName = "C:/Users/t00222338/Desktop/hamlet1.txt";
        HashSet hamset = new HashSet();
        try {
            Scanner in = new Scanner(new File(fileName));
            while (in.hasNextLine()) {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                    String word = lineParser.next();
                    hamset.add(word);
                }
                lineParser.close();
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try{
            FileWriter writer = new FileWriter(fileName, true);
            writer.write("Each word from the tree set: \n");
            Iterator<String> iterator = hamset.iterator();
            while (iterator.hasNext()) {
                String word = iterator.next();
                writer.write(word + " ");
            }
            writer.write("\nThe size of the hash set is " + hamset.size() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
