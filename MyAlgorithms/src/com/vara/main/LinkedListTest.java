/**
 * 
 */
package com.vara.main;

import com.vara.core.LinkedList;
import com.vara.core.domain.Link;

/**
 * @author vpsrini
 *
 */
public class LinkedListTest {
	
	public static void main(String[] args){
		LinkedList list = new LinkedList();
		list.insertFirst(new Link(1,"Vara"));
		list.insertFirst(new Link(2,"Keyur"));
		list.insertFirst(new Link(3,"Sai"));
		list.insertFirst(new Link(4,"LeoStint"));
		
		while(!list.isEmpty()){
			list.getFirst().display();
			list.deleteFirst();
		}
	}
}
