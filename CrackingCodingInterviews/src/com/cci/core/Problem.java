/**
 * 
 */
package com.cci.core;

/**
 * @author vpsrini
 *
 */
public abstract class Problem {
	
	/**
	 * This method illustrates the solution for the given problem.
	 */
	public abstract void solve();
	
	/**
	 * This method displays the solution to the standard output.
	 */
	public abstract void showResults();
	
	public void execSolution(){
		this.solve();
		this.showResults();
	}

}
