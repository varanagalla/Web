/**
 * 
 */
package com.cci.core;

/**
 * @author vpsrini
 *
 */
public class Queue<T> {
	
	public Queue(){
		this(1);
	}
	
	public Queue(int initialCapacity){
		
	}
	
	public Queue(T[] elements){
		for(T element : elements){
			this.enQueue(element);
		}
	}
	
	public void enQueue(T element){
		
	}
	
	public T dequeue(){
		return null;
	}
	
	public boolean isEmpty(){
		return false;
	}
	
	public void display(){
		
	}

}
