/**
 * 
 */
package com.lco.test;

import com.lco.probs.Solution;

/**
 * @author vpsrini
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution solution = new Solution();
		String[] tokens = new String[] {"3","-4", "+" };
		System.out.println("Result : " + solution.evalRPN(tokens));
		
		
	}

}
