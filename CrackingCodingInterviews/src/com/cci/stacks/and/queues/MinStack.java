/**
 * 
 */
package com.cci.stacks.and.queues;

import com.cci.core.IStack;
import com.cci.core.Stack;

/**
 * Problem: How would you design a stack which, in addition to push and pop, also has a function min
 * 		    which returns the minimum element? Push, pop and min should all operate on O(1) time.	
 * @author vpsrini
 *
 */
public class MinStack extends Stack<Integer> implements IStack<Integer>{
	
	private Stack<Integer> minStack = new Stack<Integer>();
	
	public MinStack(){
		super();
	}
	
	public Integer min(){
		return minStack.peek();
	}
	
	@Override
	public void push(Integer element){
		if(super.isEmpty()){
			minStack.push(element);
		}else if(element < minStack.peek()){
			minStack.push(element);
		}
		super.push(element);
	}
	
	@Override
	public Integer pop(){
		Integer element = super.pop();
		if(element == minStack.peek()){
			minStack.pop();
		}
		return element;
	}
	
}
