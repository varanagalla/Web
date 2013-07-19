/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * @author la-vpsrini
 *
 */
public class StackWithMax extends ArrayStack implements IStack {
	
	private IStack maxStack;
	
	public StackWithMax(){
		super();
		this.maxStack = new ArrayStack();
	}
	
	@Override
	public void push(int item){
		super.push(item);
		if(this.maxStack.peek() <= item){
			this.maxStack.push(item);
		}
	}
	
	public int pop(){
		int item = super.pop();
		if(item == this.maxStack.peek()){
			this.maxStack.pop();
		}
		return item;
		
	}
	
	public int getMax() {
		return this.maxStack.peek();
	}
}
