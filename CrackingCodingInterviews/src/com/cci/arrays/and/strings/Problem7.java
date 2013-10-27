/**
 * 
 */
package com.cci.arrays.and.strings;

import com.cci.core.Problem;

/**
 * Problem: Reverse the words in a sentence.
 * @author vpsrini
 *
 */
public class Problem7 extends Problem {

	private String source = null;
	private StringBuilder reverseStr = null;
	
	public Problem7(String source){
		this.source = source;
	}
	
	/* (non-Javadoc)
	 * @see com.cci.core.Problem#solve()
	 */
	@Override
	public void solve() {
		reverseStr = new StringBuilder(source.length());
		this.reverseWords(reverseStr, source);
	}
	
	private void reverseWords(StringBuilder reverseStr, String str){
		int spInd = str.indexOf(" ");
		if(spInd == -1){
			reverseStr.append(str).append(" ");
			return;
		}
		this.reverseWords(reverseStr, str.substring(spInd+1));
		reverseStr.append(str.substring(0, spInd)).append(" ");
	}

	/* (non-Javadoc)
	 * @see com.cci.core.Problem#showResults()
	 */
	@Override
	public void showResults() {
		System.out.println(reverseStr.toString());
	}

}
