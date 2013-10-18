/**
 * 
 */
package com.cci.stacks.and.queues.test;

import com.cci.stacks.and.queues.MinStack;
import com.cci.stacks.and.queues.SetOfStacks;

/**
 * @author vpsrini
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Problem1 - MinStack.
		MinStack minStack = new MinStack();
		minStack.push(10);
		minStack.push(9);
		minStack.push(2);
		minStack.push(6);
		minStack.push(1);
		
		minStack.display();
		System.out.println("Min : " + minStack.min());
		System.out.println(minStack.pop());
		minStack.display();
		System.out.println("Now Min : "+minStack.min());
		System.out.println(minStack.pop());
		minStack.display();
		System.out.println("Now Min : "+minStack.min());
		System.out.println(minStack.pop());
		minStack.display();
		System.out.println("Now Min : "+minStack.min());
		
		//Problem2 - SetOfStacks
		SetOfStacks<Integer> setOfStacks = new SetOfStacks<Integer>();
		for(int i=50; i>0; i--){
			setOfStacks.push(i);
		}
		
		System.out.println(setOfStacks.pop());
		System.out.println(setOfStacks.pop());
		System.out.println(setOfStacks.pop());
		System.out.println(setOfStacks.pop());
		System.out.println(setOfStacks.pop());
		System.out.println(setOfStacks.pop());
		System.out.println(setOfStacks.pop());
		System.out.println(setOfStacks.pop());
		
		setOfStacks.display();
		
	}

}
