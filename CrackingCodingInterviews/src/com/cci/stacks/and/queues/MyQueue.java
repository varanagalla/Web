/**
 * 
 */
package com.cci.stacks.and.queues;

import com.cci.core.IQueue;
import com.cci.core.Stack;

/**
 * Problem: Implement a MyQueue class which implements a queue with two stacks.
 * @author vpsrini
 *
 */
public class MyQueue<T> implements IQueue<T> {

	private Stack<T> enqueStack = null;
	private Stack<T> dequeStack = null;
	
	public MyQueue(){
		this.enqueStack = new Stack<T>();
		this.dequeStack = new Stack<T>();
	}
	
	@Override
	public void enqueue(T element) {
		this.enqueStack.push(element);
	}

	@Override
	public T dequeue() {
		if(this.isEmpty()){
			return null;
		}
		if(dequeStack.isEmpty()){
			while(!enqueStack.isEmpty()){
				dequeStack.push(enqueStack.pop());
			}
		}
		return dequeStack.pop();
	}

	@Override
	public int length() {
		return this.enqueStack.length() + this.dequeStack.length();
	}

	@Override
	public void display() {
		
	}

	@Override
	public boolean isEmpty() {
		return enqueStack.isEmpty() && dequeStack.isEmpty();
	}

}
