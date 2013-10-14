/**
 * 
 */
package com.cci.arrays.and.strings;

import com.cci.core.Problem;

/**
 * Problem : Given two strings, write a method to decide if one is a permutation of other.
 * @author vpsrini
 *
 */
public class Problem3 extends Problem {
	
	private String s1 = null;
	private String s2 = null;
	private boolean permutated = false;
	private int radix = 0;
	
	public Problem3(String s1, String s2, int radix){
		this.s1 = s1;
		this.s2 = s2;
		this.radix = radix;
	}

	/*
	 * **********************************************************************
	 * ************************		Notes 		*****************************
	 * **********************************************************************
	 * Two given strings are permutation of each other if and only if they satisfy
	 * the following
	 * 	(*)	-	Both should have the same length.
	 *  (*) - 	Count of individual characters should match.
	 */
	/* (non-Javadoc)
	 * @see com.cci.core.Problem#solve()
	 */
	@Override
	public void solve() {
		int count[] = new int[radix];
		if(s1.length() == s2.length()){
			char[] chars1 = s1.toCharArray();
			for(char c : chars1){
				count[c]++;
			}
			char[] chars2 = s2.toCharArray();
			for(char c : chars2){
				if(--count[c] < 0){
					return;
				}
			}
			this.permutated = true;
		}
		
	}

	/* (non-Javadoc)
	 * @see com.cci.core.Problem#showResults()
	 */
	@Override
	public void showResults() {
		System.out.println("The given strings "+s1+" and "+s2+" permutations of each other?" + permutated);
	}

}
