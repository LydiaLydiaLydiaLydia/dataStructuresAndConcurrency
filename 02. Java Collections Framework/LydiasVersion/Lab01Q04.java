package LydiasVersion;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;

public class Lab01Q04 {
    public static void main(String[] args) {
        String fileName = "C:/Users/t00222338/Desktop/hamlet.txt";
        Map<String, Integer> hamMap = new HashMap<String, Integer>();
        int lineNumber = 1;
        try {
            Scanner in = new Scanner(new File(fileName));
            while (in.hasNextLine()) {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                    String word = lineParser.next();
                    hamMap.put(word, lineNumber);
                    lineNumber++;
                }
                lineParser.close();
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("The set of words along with their most recent line appearance: ");
        Set<String> keySet = hamMap.keySet();
        for (String key : keySet) {
            System.out.println(key + " : " + hamMap.get(key));
        }

        //using an ArrayList to store the line numbers
        Map<String, List> hamletMapArray = new HashMap<>();
        lineNumber = 1;
        try {
            Scanner in = new Scanner(new File(fileName));
            while (in.hasNextLine()) {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                    String word = lineParser.next();
                    if (hamletMapArray.containsKey(word)) {
                        hamletMapArray.get(word).add(lineNumber);
                    }else{
                        List<Integer> lineList = new ArrayList<>();
                        lineList.add(lineNumber);
                        hamletMapArray.put(word, lineList);
                    }
                    lineNumber++;
                }
                lineParser.close();
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("\nThe words in the excerpt and the lines they occurred in (ArrayList version)");
        System.out.println(hamletMapArray);

        //using a set to store the line numbers
        Map<String, Set> hamletMapSet = new HashMap<>();
        lineNumber = 1;
        try {
            Scanner in = new Scanner(new File(fileName));
            while (in.hasNextLine()) {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                    String word = lineParser.next();
                    if (hamletMapSet.containsKey(word)) {
                        hamletMapSet.get(word).add(lineNumber);
                    }else{
                        Set<Integer> lineList = new HashSet<>();
                        lineList.add(lineNumber);
                        hamletMapSet.put(word, lineList);
                    }
                    lineNumber++;
                }
                lineParser.close();
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("\nThe words in the excerpt and the lines they occurred in (HashSet version)");
        System.out.println(hamletMapSet);

        //performing a search on the Map for a key value
        //looking for the word 'to'
        if (hamletMapSet.containsKey("to")) {
            System.out.println("\nThe map contains the word you were looking for, the word appears at line(s):");
            System.out.println(hamletMapArray.get("to"));
        }
        System.out.println("\nUsing .get() to search for a word that isn't there: ");
        System.out.println(hamletMapArray.get("aubergine"));


    }
}
