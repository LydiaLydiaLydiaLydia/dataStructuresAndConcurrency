package LydiasVersion;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
public class DiagramofLinkedListfromjavaapi {
    public static void main(String[] args) {
        List<String> names = new LinkedList();

        names.add("Diana");
        names.add("Harry");
        names.add("Romeo");

        names.addFirst("Sam");

        names.add("Sam");

        System.out.println(names);
    }
}
