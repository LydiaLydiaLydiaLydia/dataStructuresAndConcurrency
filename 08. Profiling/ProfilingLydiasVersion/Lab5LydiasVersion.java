package ProfilingLydiasVersion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Lab5LydiasVersion {
    public static void main(String[] args) {
        
        List<String> arrList = new ArrayList();
        List<String> linkList = new LinkedList();
        int listSize = 10; // 10 is first value, then 100, etc

        int reps = 100000;  // you may need to experiment with value for reps

        //populate both lists with contents of a data file
        try {   // The name of the file which we will read from
            //String filename = "words_alpha.txt"; //file in project folder
            String filename = "C:\\Users\\t00222338\\Desktop\\words_alpha.txt"; //can have file in any folder

            // Prepare to read from the file, using a Scanner object
            File file = new File(filename);
            Scanner in = new Scanner(file);

            for (int i = 0; i < listSize; i++){
                // Read one string from the file
                String str = in.nextLine();

                // add str to ArrayList and LinkedList
                arrList.add(str);
                linkList.add(str);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        // generate random numbers to use as indices for get method
        // same random numbers used for ArrayList and LinkedList
        int [] randomNos = generateRandomNos(listSize, reps);

        // call testGetForArrayList, testGetForLinkedList to time get() for ArrayList and LinkedList.
        long startTime = System.currentTimeMillis();
        testGetForArrayList(arrList, randomNos);
        long endTime = System.currentTimeMillis();
        long duration = endTime-startTime;
        System.out.println(duration);

        startTime = System.currentTimeMillis();
        testGetForLinkedList(linkList, randomNos);
        endTime = System.currentTimeMillis();
        duration = endTime-startTime;
        System.out.println(duration);
    }

    public static void testGetForArrayList(List list, int[] randomNos) {
        testGetForList(list, randomNos);
    }

    public static void testGetForLinkedList(List list, int [] randomNos){
        testGetForList(list, randomNos);
    }

    public static void testGetForList(List list, int []randomNos) {
        // call get on list multiple times
        for (int i = 0; i < randomNos.length; i++){
            list.get(randomNos[i]);
        }
    }

    public static int [] generateRandomNos(int listSize, int reps){
        Random random = new Random();
        int [] randomNos = new int [reps];

        for(int i = 0; i < reps; i++) {
            randomNos[i] = random.nextInt(listSize);
        }
        return randomNos;
    }
}