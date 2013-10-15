/**
 * 
 */
package com.cci.core;

/**
 * @author vpsrini
 *
 */
public class Node {
	
	public Node next = null;
	private String data = null;
	public Node(){
		
	}
	public Node(String data){
		this.data = data;
	}
	
	public String get(){
		return data;
	}
	
	public void set(String data){
		this.data = data;
	}
	
}
