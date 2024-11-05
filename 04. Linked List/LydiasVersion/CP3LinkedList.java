package LydiasVersion;

import java.util.NoSuchElementException;
//singly linked list with first reference only 

/**
A linked list is a sequence of links with efficient
element insertion and removal. This class 
contains a subset of the methods of the standard
java.util.LinkedList class.
*/

public class CP3LinkedList<E> {
     private class Node {
		public E data;
		public Node next;
		public Node prev;
	}
	private Node first;
	 private Node last;
		
	/** 
    	Constructs an empty linked list.
	*/
	public CP3LinkedList()
	{  
		first = null;
		last = null;
	}
 
	/**
 	Adds an element to the front of the linked list.
 	@param element the element to add
	 */
	public void addFirst(E element)
	{  
		Node newLink = new Node();
		newLink.data = element;
		if (first == null){
			last = newLink;
		}else{
			first.prev = newLink;
		}
		newLink.next = first;
		first = newLink;
	}

	public E getFirst() {
		if (first == null)
			throw new NoSuchElementException();
		return first.data;
	}

	public E removeFirst() {
		if (first == null)
			throw new NoSuchElementException();
		E element = first.data;
		first = first.next;
		return element;
	}

	public void print(){
           //outputs the data on the list
		Node current = first;
		while (current != null){
			System.out.println(current.data);
			current = current.next;
		}
	}

	//1. Write a method size with the following header that calculates the size of the list. The header is:
	public int size(){
		int size = 0;
		Node current = first;
		while (current != null){
			size ++;
			current = current.next;
		}
		return size;
	}

	//2. Write a contains() method that checks if the list contains a particular value. What is the header for the
	// method?
	public boolean contains(E element){
		Node current = first;
		while (current != null){
			if (current.data.equals(element)){
				return true;
			}
			current = current.next;
		}
		return false;
	}

	//4. Adding the addLast method
	//I have had to add a CP3LinkedList class attribute of 'private Node last', and a
	// conditional to check if the Node is the first node added to an empty list in the
	// addFirst method, in order to assign a Node to 'last'
	//5. Turning it into a doubly linked list, I added the Node class attribute 'public Node
	// prev' and in addLast method, the line 'newLink.prev = last'
	public void addLast(E element){
		Node newLink = new Node();
		newLink.data = element;
		if(last == null){
			first = newLink;
		}else{
			last.next = newLink;
		}
		newLink.prev = last;
		last = newLink;
	}

}
