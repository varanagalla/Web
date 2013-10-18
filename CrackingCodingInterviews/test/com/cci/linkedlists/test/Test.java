/**
 * 
 */
package com.cci.linkedlists.test;

import com.cci.core.LinkedList;
import com.cci.linkedlists.Problem1;
import com.cci.linkedlists.Problem2;
import com.cci.linkedlists.Problem3;
import com.cci.linkedlists.Problem4;
import com.cci.linkedlists.Problem5;
import com.cci.linkedlists.Problem6;

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
		LinkedList<String> source = new LinkedList<String>(elements);
		Problem1 problem1 = new Problem1(source,true);
		problem1.execSolution();
		
		//Problem2.
		String[] elements2 = new String[]{"F","O","L","L","O","W","U","P"};
		LinkedList<String> source2 = new LinkedList<String>(elements2);
		Problem2 problem2 = new Problem2(source2,2);
		problem2.execSolution();
		
		//Problem3.
		String[] elements3 = new String[]{"a","b","c","d","e"};
		LinkedList<String> source3 = new LinkedList<String>(elements3);
		Problem3 problem3 = new Problem3(source3, "c");
		problem3.execSolution();
		
		//Problem4.
		Integer[] elements4 = new Integer[]{ 10, 19, 8, 17, 6 };
		LinkedList<Integer> source4 = new LinkedList<Integer>(elements4);
		Problem4 problem4 = new Problem4(source4, 17);
		problem4.execSolution();
		
		//Problem5.
		Integer[] elements5 = new Integer[]{7,1,6};
		Integer[] elements6 = new Integer[]{5,9};
		LinkedList<Integer> source5 = new LinkedList<Integer>(elements5);
		LinkedList<Integer> source6 = new LinkedList<Integer>(elements6);
		Problem5 problem5 = new Problem5(source5, source6,2);
		problem5.execSolution();
		
		//Problem6
		String[] elements7 = new String[]{"1", "2", "2", "2"}; 
		LinkedList<String> source7 = new LinkedList<String>(elements7);
		Problem6 problem6 = new Problem6(source7);
		problem6.execSolution();
		
	}

}
