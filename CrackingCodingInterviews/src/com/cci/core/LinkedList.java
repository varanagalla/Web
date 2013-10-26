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
	
	//Object[] elements = null;
	private Node<T> head = null;
	
	public LinkedList(){
		this.head = new Node<T>();
	}
	
	/*public LinkedList(int initialCapacity){
		this.head = new Node<T>();
		//this.elements = new Object[initialCapacity];
	}*/
	
	public LinkedList(T[] elements){
		//this.elements = elements;
		this.head = new Node<T>();
		for(T element : elements){
			this.add(element);
		}
	}
	
	public void add(T element){
		//this.ensureCapacity();
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
		//this.shrinkCapacity();
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
		Node<T> node = head.next;
		int size = 0;
		while(node != null){
			size++;
			node = node.next;
		}
		return size;
	}
	
	public void addFirst(T element){
		Node<T> node = new Node<T>(element);
		node.next = head.next;
		head.next = node;
	}
	
	public T removeFirst(){
		if(isEmpty()){
			return null;
		}
		Node<T> node = head.next;
		head.next = node.next;
		return node.get();
	}
	
	private Node<T> reverse(Node<T> node, Node<T> revHead){
		if(node.next == null){
			revHead.next = node;
			return node;
		}
		Node<T> reverse = this.reverse(node.next, revHead);
		reverse.next = node;
		node.next = null;
		return node;
	}
	
	public void reverse(){
		if(isEmpty()){
			return;
		}
		Node<T> revHead = new Node<T>();
		this.reverse(head.next, revHead);
		this.head = revHead;
	}
	
	/*private void ensureCapacity(){
		if(length() >= elements.length){
			int size = 2*length() + 1;
			Object[] extendedArray = new Object[size];
			System.arraycopy(elements, 0, extendedArray, 0, length());
			this.elements = extendedArray;
			System.out.println("Linkedlist size entended to : "+size);
		}
	}
	
	private synchronized void shrinkCapacity(){
		if(length() < elements.length/2){
			int size = elements.length/2;
			Object[] shrinkedArray = new Object[size];
			System.arraycopy(elements, 0, shrinkedArray, 0, length());
			this.elements = shrinkedArray;
			System.out.println("Stack capacity shrinked to "+size);
		}
	}*/
	
}


