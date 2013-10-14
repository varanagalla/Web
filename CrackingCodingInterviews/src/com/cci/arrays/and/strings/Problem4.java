/**
 * 
 */
package com.cci.arrays.and.strings;

import com.cci.core.Problem;

/**
 * Problem: Write a method to replace all spaces in a string with '%20'.
 * 			You may assume that the string has sufficient space to hold additional characters.
 * @author vpsrini
 *
 */
public class Problem4 extends Problem {
	
	private String source = null;
	
	public Problem4(String source){
		this.source = source;
	}

	/* (non-Javadoc)
	 * @see com.cci.core.Problem#solve()
	 */
	@Override
	public void solve() {
		char[] chars = source.toCharArray();
		int sourcelen = chars.length;
		for(int index=0; index < sourcelen; index++){
			if(chars[index] == ' '){
				chars[index] = '%';
				this.shiftRight(chars, index, 2);
				chars[index+1] = '2';
				chars[index+2] = '0';
			}
		}
		source = new String(chars);
	}
	
	/**
	 * This method shifts the characters to the right by "shiftBy" positions.
	 * @param chars
	 * @param start
	 * @param shiftBy
	 */
	private void shiftRight(char[] chars,int start, int shiftBy){
		int sourcelen = chars.length;
		for(int i=0; i<shiftBy; i++){
			for(int index = sourcelen-1; index > start; index --){
				chars[index] = chars[index-1];
			}
		}	
	}

	/* (non-Javadoc)
	 * @see com.cci.core.Problem#showResults()
	 */
	@Override
	public void showResults() {
		System.out.println(source);
	}

}
