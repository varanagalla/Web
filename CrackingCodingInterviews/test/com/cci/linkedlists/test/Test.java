/**
 * 
 */
package com.cci.linkedlists.test;

import com.cci.core.LinkedList;
import com.cci.linkedlists.Problem1;
import com.cci.linkedlists.Problem2;
import com.cci.linkedlists.Problem3;

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
		
		//Problem2.
		String[] elements2 = new String[]{"F","O","L","L","O","W","U","P"};
		LinkedList source2 = new LinkedList(elements2);
		Problem2 problem2 = new Problem2(source2,2);
		problem2.execSolution();
		
		//Problem3.
		String[] elements3 = new String[]{"a","b","c","d","e"};
		LinkedList source3 = new LinkedList(elements3);
		Problem3 problem3 = new Problem3(source3, "c");
		problem3.execSolution();
	}

}
