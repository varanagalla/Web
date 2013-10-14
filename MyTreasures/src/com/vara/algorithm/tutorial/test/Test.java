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
		
		/*String name = "Vara";
		
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
		/*for(int c=0; c < R; c++){
			System.out.println(indices[c] + "\t" + (char)indices[c]);
		}
		
		//System.out.println(indices);*/
		
		System.out.println(100&99);
		
		int a = 10;
		
		System.out.println(a << 2);
		
		int hash = 100;
		System.out.println("100 >>> 20 = "+(hash >>> 20));
		System.out.println("100 >>> 12 = "+(hash >>> 12));
		System.out.println("((100 >>> 20) ^ (100 >>> 12)) = "+ ((hash >>> 20) ^ (hash >>> 12)));
		System.out.println("100 ^ 0 = " + (100 ^ 0));
		hash ^= (hash >>> 20) ^ (hash >>> 12);
		System.out.println("Result :: "+ hash);
		System.out.println(hash ^ (hash >>> 7) ^ (hash >>> 4));
	}

}
