/**
 * 
 */
package com.cci.stacks.and.queues.test;

import com.cci.core.Stack;
import com.cci.stacks.and.queues.MinStack;
import com.cci.stacks.and.queues.MyQueue;
import com.cci.stacks.and.queues.Problem6;
import com.cci.stacks.and.queues.SetOfStacks;
import com.cci.stacks.and.queues.TowerOfHanoi;

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
		
		//Problem3 - Tower of Hanoi
		TowerOfHanoi tw = new TowerOfHanoi(10);
		tw.execSolution();
		
		//Problem4 = TwoStackQueue.
		MyQueue<Integer> myQueue = new MyQueue<Integer>();
		myQueue.enqueue(10);
		myQueue.enqueue(2);
		myQueue.enqueue(19);
		myQueue.enqueue(73);
		myQueue.enqueue(1);
		
		System.out.println("HEAD --> ");
		
		while(!myQueue.isEmpty()){
			System.out.println(myQueue.dequeue());
		}
		System.out.println(" --> TAIL");
		
		//Problem6 - Stack Sort
		Stack<Integer> stack = new Stack<Integer>(new Integer[]{4,3,2,1});
		Problem6 problem6 = new Problem6(stack);
		stack.display();
		problem6.execSolution();
		
		
	}

}
