/**
 * 
 */
package com.cci.core;

/**
 * @author vpsrini
 *
 */
public class Node<T> {
	
	public Node<T> next = null;
	private T data = null;
	public Node(){
		
	}
	public Node(T data){
		this.data = data;
	}
	
	public T get(){
		return data;
	}
	
	public void set(T data){
		this.data = data;
	}
	
}
