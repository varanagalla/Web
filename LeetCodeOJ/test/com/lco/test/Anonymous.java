/**
 * 
 */
package com.lco.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author vpsrini
 *
 */
public class Anonymous {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
                new BufferedReader(new InputStreamReader(System.in));

		String input;
		
		System.out.println("Enter text :: ");
		System.out.print(">");

		input = br.readLine();
		
		if(input.matches("-?\\d+")){
			System.out.println("This is a number.");
		}else{
			System.out.println("This is not a number.");
		}
	}

}
