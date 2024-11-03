package LydiasVersion.DocExercises;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class JavaLinkedListExercises {
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<String>();
        words.addLast("abc");
        words.addLast("def");
        words.addLast("ghi");
        words.addFirst("012");
        //System.out.println(words.getLast());
        //System.out.println(words.pop());
        //System.out.print(words.removeLast());
        //System.out.print(words.removeFirst());
        //System.out.print(words.removeLast());

        for(String name: words){
            System.out.println(name + "egg");
        }

        ListIterator<String> itty = words.listIterator();
        itty.add("heya");
        System.out.println(itty.next());

        LinkedList<String> myLList = new LinkedList<String>();
        myLList.add("Mary");
        myLList.add("John");
        myLList.add("Sue");
        ListIterator<String> iterator = myLList.listIterator();
        iterator.next();
        iterator.next();
        iterator.add("Robert");
        iterator.previous();
        iterator.previous();
        iterator.remove();
        System.out.println(myLList);

    }
}
