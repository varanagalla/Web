/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * @author la-vpsrini
 *
 */
public class ArrayStack implements IStack {

	protected int[] data;
	protected int pointer;
	public ArrayStack(){
		this.data = new int[1];
		this.pointer = -1;
	}
	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.IStack#push(int)
	 */
	@Override
	public void push(int item) {
		if((this.pointer + 1) == this.data.length){
			this.resize(this.data.length * 2);
		}
		this.data[++pointer] = item;
	}

	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.IStack#pop()
	 */
	@Override
	public int pop() {
		if(!this.isEmpty()){
			if(this.pointer < this.data.length/4){
				this.resize(this.data.length/2);
			}
			return this.data[pointer--];
		}
		return -1;
		
	}

	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.IStack#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return pointer == -1;
	}
	
	private void resize(int size){
		int[] copy = new int[size];
		int i = 0;
		int copySize = Math.min(size, this.data.length);
		
		while(i < copySize){
			copy[i] = data[i];
			i++;
		}
		this.data = copy;
	}
	@Override
	public int peek() {
		if(this.isEmpty()){
			return -1;
		}
		return data[pointer];
	}
	
	
	
}
