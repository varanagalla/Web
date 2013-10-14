/**
 * 
 */
package com.cci.linkedlists.test;

import com.cci.core.LinkedList;
import com.cci.linkedlists.Problem1;

/**
 * @author vpsrini
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Problem1.
		String[] elements = new String[]{"F","O","L","L","O","W","U","P"};
		LinkedList source = new LinkedList(elements);
		Problem1 problem1 = new Problem1(source,true);
		problem1.execSolution();
	}

}
