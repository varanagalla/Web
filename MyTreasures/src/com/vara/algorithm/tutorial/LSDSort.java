/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * @author vpsrini
 *
 */
public class LSDSort {
	
	private String[] source = null;
	private int fixLen = 0;
	
	public LSDSort(String[] source){
		this.source = source;
		fixLen = source[0].length();
	}
	/**
	 * This method performs LeastSignificantDigit(LSD) sort algorithm.
	 * This will do the sort in 4 steps same as key index counting for 
	 * each index of fixed length string (RIGHT to LEFT).
	 * - for each index of the fixed length string
	 * 		(*) Compute the frequency count.
	 * 		(*) Start index for r+1 = frequency count(r) + frequency count < r.
	 * 		(*) Distribute data records as per the start index computed in 2nd step.
	 * 		(*) Copy the distributed records back in the source.
	 */
	public void performSort(){
		//Each element in source array contains EXTENDED_ASCII characters.
		int R = 256;
		
		int sourcelen = source.length;
		String[] aux = new String[sourcelen];
		
		//from RIGHT to left of each index execute key indexing count.
		for(int wi=(fixLen-1); wi >= 0; wi--){
			//Compute the frequency 
			int[] count = new int[R+1];
			for (int index=0; index < sourcelen; index++){
				count[source[index].charAt(wi) + 1]++;
			}
			
			//Transform data to indices
			for(int r=0; r < R; r++){
				count[r+1] += count[r];
			}
			
			//Distribute data records
			for(int index=0; index < sourcelen; index++){
				aux[count[source[index].charAt(wi)]++] = source[index];
			}
			
			//Copy back
			for(int k=0; k < sourcelen; k++){
				source[k] = aux[k];
			}
		}
	}

}
