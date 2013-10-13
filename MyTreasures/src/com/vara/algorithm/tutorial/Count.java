/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * @author vpsrini
 *
 */
public class Count {

	public void displayCount(String alphabet, String s){
		Alphabet alpha = new Alphabet(alphabet);
		int[] indices = alpha.toIndices(s);
		int[] count = new int[alpha.R()];
		
		//System.out.println(alpha.toChars(indices));
		//System.out.println(alpha.lgR());
		int i = 0;
		for(int index : indices){
			
			if(alpha.contains(s.charAt(i))){
				count[index] ++; 
			}	
			i++;
		}
		
		//This is display part.
		for(int ix=0; ix < alpha.R(); ix++){
			System.out.println(alpha.toChar(ix) + "\t" + count[ix]);
		}
	}
	
}
