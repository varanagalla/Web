/**
 * 
 */
package com.cci.arrays.and.strings.test;

import com.cci.arrays.and.strings.Problem1;
import com.cci.arrays.and.strings.Problem3;
import com.cci.arrays.and.strings.Problem4;
import com.cci.arrays.and.strings.Problem5;
import com.cci.arrays.and.strings.Problem6;
import com.cci.core.Problem;



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
		Problem1 problem1 = new Problem1("Vara", 256);
		execSolution(problem1);
		
		//Problem3.
		Problem3 problem3 = new Problem3("marav", "varam", 256);
		execSolution(problem3);
		
		//Problem4.
		Problem4 problem4 = new Problem4("Mr Vara Prasad Sir      ");
		execSolution(problem4);
		
		//Problem5.
		Problem5 problem5 = new Problem5("abbccccdddaatt");
		execSolution(problem5);
		
		//Problem6.
		int[][] source = new int[][]{
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		Problem6 problem6 = new Problem6(source,4);
		execSolution(problem6);
		
	}
	
	private static void execSolution(Problem problem){
		problem.solve();
		problem.showResults();
	}

}
