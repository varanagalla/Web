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
	
	/*public LinkedQueue(int initCap){
		this.source = new LinkedList<T>(initCap);
	}*/
	
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

}
