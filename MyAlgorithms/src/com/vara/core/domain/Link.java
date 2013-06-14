/**
 * 
 */
package com.vara.core.domain;

/**
 * @author vpsrini
 *
 */
public class Link {
	private int id;
	private String name;
	private Link next;
	
	public Link(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the next
	 */
	public Link getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(Link neext) {
		this.next = neext;
	}
	
	public void display(){
		System.out.println("Id :: "+this.id + " Name :: "+this.name);
	}
	
	public boolean equals(Object anotherLink){
		return this.id == ((Link) anotherLink).getId();
	}
}
