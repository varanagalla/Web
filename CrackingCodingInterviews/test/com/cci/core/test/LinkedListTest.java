/**
 * 
 */
package com.cci.core.test;

import com.cci.core.LinkedList;

/**
 * @author vpsrini
 *
 */
public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] elements = new String[] { "1", "2", "3" };
		LinkedList ll = new LinkedList(elements);
		ll.display();
		ll.remove("3");
		ll.display();
		ll.remove("1");
		ll.display();
		ll.remove("2");
		ll.display();
		System.out.println("LinkedList empty?? " + ll.isEmpty());
		ll.add("10");
		ll.add("20");
		ll.display();
	}

}
