/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * @author vpsrini
 *
 */
public class Alphabet {
	
	//Represents Built-In Alphabets.
	public static final Alphabet BINARY = new Alphabet("01"); 
	public static final Alphabet DNA = new Alphabet("");
	public static final Alphabet OCTAL = new Alphabet("");
	public static final Alphabet DECIMAL = new Alphabet("");
	public static final Alphabet HEXADECIMAL = new Alphabet("");
	public static final Alphabet PROTEIN = new Alphabet("");
	public static final Alphabet LOWERCASE = new Alphabet("");
	public static final Alphabet UPPERCASE = new Alphabet("");
	public static final Alphabet BASE64 = new Alphabet("");
	public static final Alphabet ASCII = new Alphabet("");
	public static final Alphabet EXTENDED_ASCII = new Alphabet("");
	public static final Alphabet UNICODE16 = new Alphabet("");
	
	private char[] alpha = null;
	private int[] inverse = null;
	private int R = 0;
	
	/**
	 * This constructor creates a new Alphabet from chars in String s.
	 * @param s
	 */
	public Alphabet(String s){
		this.alpha = s.toCharArray();
		this.R = s.length();
		this.inverse = new int[Character.MAX_VALUE];
		
		for(int i=0; i < inverse.length; i++){
			this.inverse[i] = -1;
		}
		
		for(int i=0; i < R; i++){
			this.inverse[alpha[i]] = i; 
		}
		
		
	}
	
	/**
	 * This method converts given index to corresponding alphabet character.
	 * @param index
	 * @return
	 */
	public char toChar(int index){
		return this.alpha[index];
	}
	
	/**
	 * This method converts given character c to an index between 0 to R-1.
	 * @param c
	 * @return
	 */
	public int toIndex(char c){
		return inverse[c];
	}
	
	/**
	 * This method checks the presence of character c in the alphabet.
	 * @param c
	 * @return
	 */
	public boolean contains(char c){
		return inverse[c] != -1;
	}
	
	/**
	 * This method gives the radix (number of characters in the alphabet) of the Alphabet.
	 * @return
	 */
	public int R(){
		return R;
	}
	
	/**
	 * This method gives the number of bit to represent an index.
	 * @return
	 */
	public int lgR(){
		int lgR = 0;
		for(int i = R-1; i >= 1; i /= 2){
			lgR ++;
		}
		
		return lgR;
	}
	
	/**
	 * This method converts String s to base-R integer.(Between 0 to R-1)
	 * @param s
	 * @return
	 */
	public int[] toIndices(String s){
		//char[] alpha = s.toCharArray();
		int len = s.length();
		int[] indices = new int[len];
		for(int c=0; c < len; c++){
			indices[c] =  toIndex(s.charAt(c));
		}
		return indices;
	}
	
	/**
	 * This method converts base-R integer to String over this alphabet.
	 * @param indices
	 * @return
	 */
	public String toChars(int[] indices){
		StringBuilder s = new StringBuilder(indices.length);
		for(int i : indices){
			s.append(toChar(i));
		}
		return s.toString();
	}
	

}
