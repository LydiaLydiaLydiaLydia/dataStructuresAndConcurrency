package LydiasVersion;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Lab01Q01 {
    public static void main(String[] args) {
        //Question 1
        List<String> my_list = new LinkedList<>();
        //(i)
        my_list.addLast("Kay");
        my_list.add("Jay");
        my_list.addLast("May");
        my_list.addLast("Fay");

        //System.out.println(my_list);

        //(ii)
        ListIterator<String> it = my_list.listIterator();
        it.next();
        it.next();
        it.next();
        it.add("Ray");


        //System.out.println(my_list);

        //(iii)
        //using the list.remove() method:
        //my_list.remove("Jay");

        //using the iterator.remove() method
        it.previous();
        it.previous();
        it.previous();
        it.remove();

        //System.out.println(my_list);

        //(iv)
        it = my_list.listIterator();
        System.out.println("List from the beginning: ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("List from the end: ");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }

        //(v)
        my_list.add("Kay");
        //using the enhanced for loop
        System.out.println("After adding duplicate elements: ");
        for (String s : my_list) {
            System.out.println(s);
        }
    }

}
