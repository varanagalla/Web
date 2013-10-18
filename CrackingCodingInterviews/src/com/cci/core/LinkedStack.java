/**
 * 
 */
package com.cci.core;

/**
 * @author vpsrini
 *
 */
public class LinkedStack<T> implements IStack<T>{
	private LinkedList<T> source = null;
	
	public LinkedStack(){
		this.source = new LinkedList<T>();
	}
	
	@Override
	public void push(T element) {
		source.addFirst(element);
	}

	@Override
	public T pop() {
		return source.removeFirst();
	}

	@Override
	public T peek() {
		return source.getHead().next.get();
	}

	@Override
	public boolean isEmpty() {
		return source.isEmpty();
	}

	@Override
	public void display() {
		source.display();
	}

	@Override
	public int length() {
		return source.length();
	}
	
	

}
