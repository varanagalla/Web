/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * @author la-vpsrini
 *
 */
public class StackSorter {
	
	public static IStack sort(IStack targetStack){
		IStack bufferStack = new ArrayStack();
		
		while(!targetStack.isEmpty()){
			int temp = targetStack.pop();
			while(!bufferStack.isEmpty() && bufferStack.peek() > temp){
				targetStack.push(bufferStack.pop());
			}
			bufferStack.push(temp);
		}
		
		return bufferStack;
	}

}
