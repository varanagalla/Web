/**
 * 
 */
package com.vara.core;

import com.vara.core.domain.Link;

/**
 * @author vpsrini
 *
 */
public class LinkedList {
	private Link first;

	/**
	 * @return the first
	 */
	public Link getFirst() {
		return first;
	}

	/**
	 * @param first the first to set
	 */
	public void setFirst(Link first) {
		this.first = first;
	}
	
	public void insertFirst(Link link){
		link.setNext(this.first);
		this.first = link;
	}
	
	public Link deleteFirst(){
		Link temp = this.first;
		this.first = temp.getNext();
		return temp;
	}
	
	public boolean isEmpty(){
		return this.first == null;
	}
	
	public Link findLink(int id){
		Link current = this.first;
		while(current.getId()  != id){
			if(current.getNext() == null){
				break;
			}
			else{
				current = current.getNext();
			}
		}
		return current;
	}
	
	public Link deleteLink(int id){
		Link current = this.getFirst();
		Link previous = null;
		while(current.getId() != id){
			if(current.getNext() == null){
				break;
			}
			else{
				previous = current;
				current = current.getNext();
			}
		}
		if(current.equals(this.first)){
			this.first = current.getNext();
		}
		else{
			previous.setNext(current.getNext());
		}
		return current;
	}
	
	
	
}
