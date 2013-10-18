/**
 * 
 */
package com.cci.core;

/**
 * @author vpsrini
 *
 */
public interface IQueue<T> {
	
	public void enqueue(T element);
	
	public T dequeue();
	
	public int length();
	
	public void display();

}
