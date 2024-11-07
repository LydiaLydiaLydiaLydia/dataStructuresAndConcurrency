package RecursionLydiasVersion;

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
		Node current = first;
		while (current != null){
			System.out.println(current.data);
			current = current.next;
		}
	}

	//Lab 4 Question 5
	public void printRecursive(){
		printSub(first);
	}
	private void printSub(Node head){
		if(head == null){
			return;
		}else{
			System.out.println(head.data);
			printSub(head.next);
		}
	}

	//Lab 04 Question 5
	public void printRecursiveBackwards(){
		printSubBackwards(last);
	}
	private void printSubBackwards(Node tail){
		if(tail == null){
			return;
		}else{
			System.out.println(tail.data);
			printSubBackwards(tail.prev);
		}
	}

	public int size(){
		int size = 0;
		Node current = first;
		while (current != null){
			size ++;
			current = current.next;
		}
		return size;
	}

	//Lab 4 Question 2
	private int sizeSub(Node head){
		if(head == null){
			return 0;
		}else{
			return 1 + sizeSub(head.next);
		}
	}
	public int sizeRecursive(){
		return sizeSub(first);
	}

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
