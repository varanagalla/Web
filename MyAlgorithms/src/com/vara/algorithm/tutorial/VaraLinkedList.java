/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * @author VaraPrasad_Nagalla
 *
 */
public class VaraLinkedList {
	
	private LinkNode head;	
	private LinkNode tail;
	
	public void add(String item){
		LinkNode newLink = new LinkNode(item);
		if(head == null){
			this.tail = newLink;
		}else{
			this.head.previous = newLink;
		}
		newLink.next = head;
		this.head = newLink;
	}
	
	public void addLast(String item){
		LinkNode newLink = new LinkNode(item);
		if(tail == null){
			this.head = newLink;
		}else{
			this.tail.next = newLink;
		}
		newLink.previous = tail;
		this.tail = newLink;
	}
	
	public String remove(){
		if(this.isEmpty()){
			throw new RuntimeException("Linked list is empty man...");
		}
		String value = this.head.data;
		this.head = this.head.next;
		if(this.head != null){
			this.head.previous = null;
		}else{
			this.tail = null;
		}
		return value;
	}
	
	public String removeLast(){
		if(this.isEmpty()){
			throw new RuntimeException("Linked list is empty man...");
		}
		String value = this.tail.data;
		this.tail = this.tail.previous;
		if(tail != null){
			this.tail.next = null;
		}else{
			this.head = null;
		}
		return value;
	}
	
	public boolean isEmpty(){
		return ((this.head == null) && (this.tail == null));
	}
	
	
	private class LinkNode{
		String data;
		LinkNode next;
		LinkNode previous;
		
		LinkNode(String data){
			this.data = data;
		}
		
		
	}

}


