/**
 * 
 */
package com.cci.core.test;


import java.util.Iterator;

import com.cci.core.LinkedBinarySearchTree;

/**
 * @author vpsrini
 *
 */
public class LinkedBinarySearchTreeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedBinarySearchTree<Integer> lbst = new LinkedBinarySearchTree<Integer>();
		lbst.add(57);
		lbst.add(90);
		lbst.add(42);
		lbst.add(11);
		lbst.add(31);
		lbst.add(66);
		
		System.out.println("Min :: "+lbst.findMin());
		System.out.println("Max :: "+lbst.findMax());
		
		System.out.println("In Order Display (See Below)");
		Iterator<Integer> lbstIter = lbst.inOrder();
		while(lbstIter.hasNext()){
			System.out.print(lbstIter.next() + "\t");
		}
		System.out.println();
		
		System.out.println("Level Order Display (See Below)");
		lbstIter = lbst.levelOrder();
		while(lbstIter.hasNext()){
			System.out.print(lbstIter.next() + "\t");
		}
		System.out.println();
	}

}
