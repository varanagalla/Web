/**
 * 
 */
package com.vara.main;

import com.vara.core.StackX;

/**
 * @author vpsrini
 *
 */
public class StackXTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StackX stack = new StackX(10);
		stack.push(2);
		stack.push(10);
		stack.push(9);
		stack.push(12);
		stack.push(1);
		
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
	}

}
