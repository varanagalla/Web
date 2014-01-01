/**
 * 
 */
package com.lco.prob1.test;

import com.lco.prob1.Solution;

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
