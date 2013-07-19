/**
 * 
 */
package com.vara.algorithm.tutorial.test;

import com.vara.algorithm.tutorial.VaraLinkedList;

/**
 * @author VaraPrasad_Nagalla
 *
 */
public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VaraLinkedList vl = new VaraLinkedList();
		vl.addLast("A");
		vl.addLast("B");
		vl.addLast("C");
		vl.addLast("D");
		
		
		while(!vl.isEmpty()){
			//Stack implementation.
			System.out.print(vl.remove() + "\t");
			
			//Queue implementation.
			//System.out.print(vl.removeLast() + "\t");
		}
	}

}
