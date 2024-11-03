package LydiasVersion.DocExercises;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
public class DiagramofLinkedListfromjavaapi {
    public static void main(String[] args) {
        List<String> names = new LinkedList();

        names.add("Diana");
        names.add("Harry");
        names.add("Romeo");

        //names.addFirst("Sam");

        //names.add("Sam");

        ListIterator<String> iterator = names.listIterator(); // |DHR
        iterator.next(); // D|HR
        iterator.next(); // DH|R
        iterator.add("Juliet");// DHJ|R
        iterator.previous();
        iterator.remove();

        System.out.println(names);
    }
}
