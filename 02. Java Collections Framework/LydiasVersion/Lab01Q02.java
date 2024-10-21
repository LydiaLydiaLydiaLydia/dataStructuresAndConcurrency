package LydiasVersion;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Lab01Q02 {
    public static void main(String[] args) {
        //Question 2

        //Hash Set
        Set<String> my_hash_set = new HashSet<String>();
        my_hash_set.add("Kay");
        my_hash_set.add("Jay");
        my_hash_set.add("May");
        my_hash_set.add("Ray");
        my_hash_set.add("Fay");
        //System.out.println(my_hash_set);
        try{
            my_hash_set.add("Kay");
        }catch(Exception e){
            System.out.println(e);
        }
        //I was expecting an exception to be thrown but it just ignores
        // it

        //TreeSet
        TreeSet<String> my_tree_set = new TreeSet<String>();
        my_tree_set.add("Kay");
        my_tree_set.add("Jay");
        my_tree_set.add("May");
        my_tree_set.add("Ray");
        my_tree_set.add("Fay");
        try{
            my_tree_set.add("Kay");
        }
        catch(Exception e){
            System.out.println(e);
        }


        //Part 1
        System.out.println("Output for the HashSet implementation: ");
        Iterator<String> it = my_hash_set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //Part 2
        System.out.println("Output for the TreeSet implementation: ");
        it = my_tree_set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
