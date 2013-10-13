/**
 * 
 */
package com.vara.algorithm.tutorial.test;

/**
 * @author vpsrini
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Vara";
		
		//int[] vals = new int['c'];
		
		char[] namechars = name.toCharArray();
		
		System.out.println(namechars);
		
		int R = name.length();
		
		int[] inverse = new int[Character.MAX_VALUE];
		int[] indices = new int[R];
		
		System.out.println("Indices array length : "+inverse.length);
		
		for(int c = 0; c < R ; c++){
			System.out.println(namechars[c] + "\t" + (int)namechars[c]);
			
			inverse[namechars[c]] = c;
			
			indices[c] = (int)namechars[c];
		}
		
		//Display indices
		/*for(int c=0; c < R;c++){
			System.out.println(indices[c]);
		}*/
		
		//Display characters
		for(int c=0; c < R; c++){
			System.out.println(indices[c] + "\t" + (char)indices[c]);
		}
		
		//System.out.println(indices);

	}

}
