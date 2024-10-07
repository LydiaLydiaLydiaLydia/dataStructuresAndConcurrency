// package com.company;

import java.util.LinkedList;
import java.util.ListIterator;

/**
   This program demonstrates the LinkedList class.
*/
public class LinkedListDemo
{  
   public static void main(String[] args)
   {  
      LinkedList<String> staff = new LinkedList<String>();
      //From stack overflow: as LinkedList implements both the Deque and the Queue interface,
      //it has both the add and addLast methods which do exactly the same thing.
      //add(E) is from the Queue interface and addLast(E) is from the Deque interface
      staff.add("Diana");
      staff.add("Harry");
      staff.addLast("Romeo");
      staff.addLast("Tom"); //DHRT

      //staff.addFirst("Sam");//SDHRT
      staff.add(0, "Sam");


 
      String name1 = staff.getFirst();//S
      String name2 = staff.getLast();//T
      staff.removeFirst();//DHRT
      
      // | in the comments indicates the iterator position

      ListIterator<String> iterator = staff.listIterator(); // |DHRT
      iterator.next(); // D|HRT
      iterator.next(); // DH|RT

      // Add more elements after second element
      
      iterator.add("Juliet"); // DHJ|RT
      iterator.add("Nina"); // DHJN|RT

      iterator.next(); // DHJNR|T

      // Remove last traversed element 

      iterator.remove(); // DHJN|T
     
      // Print all elements

      System.out.println(name1);
      System.out.println(name2);
      System.out.println(staff);
      System.out.println("Expected: [Diana, Harry, Juliet, Nina, Tom]");
      // Process all the elements

      //using iterator to process the contents of a linked list
      iterator = staff.listIterator();
      while (iterator.hasNext()){
         String name = iterator.next();
         System.out.println(name+"...");
      }

      //the enhanced for loop uses an iterator behind the scenes
      for (String s : staff){
         System.out.println(s+"---");
      }
   }
}
