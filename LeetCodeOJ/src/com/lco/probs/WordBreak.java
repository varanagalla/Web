/**
 * 
 */
package com.lco.probs;

import java.util.Set;

/**
 * @author vpsrini
 *
 */
public class WordBreak {
	public boolean wordBreak(String s, Set<String> dict) {
		
		if(s == null || dict == null || dict.size() == 0){
			return false;
		}
		
		int length = s.length();
		String subStr = null;
		boolean[] wFound = new boolean[length+1];
		wFound[0]=true;
		for(int i=1; i <= length; i++){
			//System.out.println("I :: "+i);
			for(int j=0; j<=i; j++){
				subStr = s.substring(j, i);
				//System.out.print(subStr);
				//System.out.print("\t");
				if(dict.contains(subStr) && wFound[j]){
					wFound[i] = true;
				}
			}
			//System.out.println();
		}
		return wFound[length];
    }
}
