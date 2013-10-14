/**
 * 
 */
package com.cci.arrays.and.strings;

import com.cci.core.Problem;

/**
 * Problem: Implement an algorithm to determine if a string has all unique characters.
 * 			what if you cannot use additional data structures?
 * @author vpsrini
 *
 */
public class Problem1 extends Problem{
	
	private String source = null;
	private boolean hasUniqChars = false;
	private int radix = 0;
	
	public Problem1(String source, int radix){
		this.source = source;
		this.radix = radix;
	}
	
	public void solve(){
		char[] chars = source.toCharArray();
		boolean[] flags = new boolean[radix];
		
		//If the source length is more than radix you should have repeated characters for sure.
		if(chars.length > radix){
			return;
		}
		
		for(char c : chars){
			if(flags[c]){
				return;
			}
			flags[c] = true;
		}
		this.hasUniqChars = true;
	}
	
	public void showResults(){
		System.out.println("The given string " + source + " has unique charcters? " + hasUniqChars);
	}

}
