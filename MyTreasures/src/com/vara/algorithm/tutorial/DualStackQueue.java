/**
 * 
 */
package com.vara.algorithm.tutorial;


/**
 * @author la-vpsrini
 *
 */
public class DualStackQueue implements IQueue {

	private IStack pushStack;
	private IStack popStack;
	
	public DualStackQueue(){
		this.pushStack = new ArrayStack();
		this.popStack = new ArrayStack();
	}
	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.IQueue#enQueue(int)
	 */
	@Override
	public void enQueue(int item) {
		this.pushStack.push(item);
	}

	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.IQueue#deQueue()
	 */
	@Override
	public int deQueue() {
		if(popStack.isEmpty() && !pushStack.isEmpty()){
			while(!pushStack.isEmpty()){
				popStack.push(pushStack.pop());
			}
		}else if(this.isEmpty()){
			throw new RuntimeException("Queue is empty");
		}
		return popStack.pop();
	}

	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.IQueue#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (pushStack.isEmpty() && popStack.isEmpty());
	}

}
