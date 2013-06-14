/**
 * 
 */
package com.vara.core;

/**
 * @author vpsrini
 *
 */
public class StackX {
	
	private int top;
	private int maxSize;
	private int[] stackArray;
	
	public StackX(int maxSize){
		this.maxSize = maxSize;
		this.stackArray = new int[maxSize];
		this.top = -1;
	}
	
	
	public void push(int value){
		stackArray[++top] = value;
	}
	
	public int pop(){
		return stackArray[top--];
	}
	
	public int peek(){
		return stackArray[top];
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public boolean isFull(){
		return top == (maxSize - 1);
	}
	
}
