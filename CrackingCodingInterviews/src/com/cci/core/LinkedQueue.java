/**
 * 
 */
package com.cci.core;

/**
 * @author vpsrini
 *
 */
public class LinkedQueue<T> implements IQueue<T> {

	LinkedList<T> source = null;
	
	public LinkedQueue(){
		this.source = new LinkedList<T>();
	}
	
	@Override
	public void enqueue(T element) {
		source.add(element);
	}

	@Override
	public T dequeue() {
		return source.removeFirst();
	}

	@Override
	public int length() {
		return source.length();
	}

	@Override
	public void display() {
		this.source.display();
	}

	@Override
	public boolean isEmpty() {
		return this.length() == 0;
	}

}
