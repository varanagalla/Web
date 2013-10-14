/**
 * 
 */
package com.cci.arrays.and.strings;

import com.cci.core.Problem;

/**
 * Problem : Write a method to perform basic string compression using the counts of repeated characters.
 * 			 If the compressed string would not become smaller than the original string, 
 * 			 your method should return original string.
 * @author vpsrini
 *
 */
public class Problem5 extends Problem {
	
	private String source = null;
	private String result = null;
	
	public Problem5(String source){
		this.source = source;
	}

	/* (non-Javadoc)
	 * @see com.cci.core.Problem#solve()
	 */
	@Override
	public void solve() {
		char[] chars = source.toCharArray();
		int len = source.length();
		int count = 1;
		StringBuilder sb = new StringBuilder(2*len);
		int ci = 0;
		for(ci=0; ci < len-1; ci++){
			if(chars[ci] == chars[ci+1]){
				count++;
			}else{
				sb.append(chars[ci]).append(count);
				count = 1;
			}
		}
		sb.append(chars[ci]).append(count);
		result = sb.toString();
		if(source.length() < result.length()){
			result = source;
		}
	}

	/* (non-Javadoc)
	 * @see com.cci.core.Problem#showResults()
	 */
	@Override
	public void showResults() {
		System.out.println(result);
	}

}
