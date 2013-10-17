/**
 * 
 */
package com.cci.core;

/**
 * This is a Basic implementation of a Linked List.
 * @author vpsrini
 *
 */
public class LinkedList<T> {
	
	T[] elements = null;
	private Node<T> head = null;
	
	public LinkedList(){
		this.head = new Node<T>();
	}
	
	public LinkedList(T[] elements){
		this.elements = elements;
		this.head = new Node<T>();
		for(T element : elements){
			this.add(element);
		}
	}
	
	public void add(T element){
		Node<T> node = new Node<T>(element);
		Node<T> n = head;
		while(n.next != null){
			n = n.next;
		}
		n.next = node;
	}
	
	public T remove(T element){
		if(isEmpty()){
			return null;
		}
		Node<T> n = head;
		T val = null;
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
	
	public Node<T> getHead(){
		return head;
	}
	
	public void display(){
		LinkedListIterator<T> iterator = new LinkedListIterator<T>(this);
		System.out.print("HEAD --> ");
		while(iterator.hasNext()){
			System.out.print(iterator.next().get() + " --> ");
		}
		System.out.println("END");
	}
	
	public void padMe(T padWith, int padNo){
		Node<T> node = null;
		while(padNo > 0){
			node = head.next;
			Node<T> padNode = new Node<T>(padWith);
			padNode.next = node;
			head.next = padNode;
			padNo --;
		}
	}
	public int length(){
		return elements.length;
	}
}


