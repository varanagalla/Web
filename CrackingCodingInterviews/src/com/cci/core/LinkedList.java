/**
 * 
 */
package com.cci.core;

/**
 * This is a Basic implementation of a Linked List.
 * @author vpsrini
 *
 */
public class LinkedList {
	
	String[] elements = null;
	private Node head = null;
	
	public LinkedList(){
		this.head = new Node();
	}
	
	public LinkedList(String[] elements){
		this.elements = elements;
		this.head = new Node();
		for(String element : elements){
			this.add(element);
		}
	}
	
	public void add(String element){
		Node node = new Node(element);
		Node n = head;
		while(n.next != null){
			n = n.next;
		}
		n.next = node;
	}
	
	public String remove(String element){
		if(isEmpty()){
			return null;
		}
		Node n = head;
		String val = null;
		while(n.next != null){
			if(element.equals(n.next.get())){
				val = n.next.get();
				n.next = n.next.next;
				break;
			}
			n = n.next;
		}
		return val;
	}
	
	public boolean isEmpty(){
		return head.next == null;
	}
	
	public Node getHead(){
		return head;
	}
	
	public void display(){
		LinkedListIterator iterator = new LinkedListIterator(this);
		System.out.print("HEAD --> ");
		while(iterator.hasNext()){
			System.out.print(iterator.next().get() + " --> ");
		}
		System.out.println("END");
	}
}


