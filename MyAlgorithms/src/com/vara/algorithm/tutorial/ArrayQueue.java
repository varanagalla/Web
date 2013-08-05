/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * @author VaraPrasad_Nagalla
 *
 */
public class ArrayQueue implements IQueue {
	
	private int[] elements;
	private int nElem;
	private int head;
	private int tail;
	
	public ArrayQueue(){
		this.elements = new int[1];
		this.nElem = 0;
		this.head = -1;
		this.tail = 0;
	}

	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.IQueue#enQueue(java.lang.String)
	 */
	@Override
	public void enQueue(int item) {
		if(this.elements.length == nElem + 1){
			resize(2 * this.elements.length);
			}
			
		this.elements[tail++] = item;
		nElem ++;
	}

	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.IQueue#deQueue()
	 */
	@Override
	public int deQueue() {
		if(this.nElem < (this.elements.length/4)){
			this.resize(this.elements.length * 2);
		}else if(this.isEmpty()){
			return -1;
		}
		nElem--;
		return this.elements[++head];
	}

	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.IQueue#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return this.nElem == 0;
	}
	
	private void resize(int size){
		int[] copy = new int[size];
		int i = 0;
		for(int val : elements){
			copy[i] = val;
			i++;
		}
		this.elements = copy;
	}

}
