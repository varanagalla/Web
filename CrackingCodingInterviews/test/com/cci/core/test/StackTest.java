/**
 * 
 */
package com.cci.core.test;

import com.cci.core.IStack;
import com.cci.core.LinkedStack;
import com.cci.core.Stack;

/**
 * @author vpsrini
 *
 */
public class StackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IStack<Integer> myStack = new LinkedStack<Integer>();//Stack<Integer>();
		myStack.push(10);
		myStack.push(2);
		myStack.push(5);
		myStack.push(15);
		myStack.push(23);
		myStack.display();
		
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		
		System.out.println(myStack.peek());
		
		myStack.display();
		
		IStack<Integer> myAnotherStack = new LinkedStack<Integer>();//Stack<Integer>(3);
		for(int i=0; i<50; i++){
			myAnotherStack.push(i+1);
		}
		myAnotherStack.display();
		
		
		
	}

}
