/**
 * 
 */
package com.cci.core;

/**
 * @author vpsrini
 *
 */
public class PriorityQueue<T> extends LinkedMaxHeap<PriorityQueueNode<T>> {
	
	public PriorityQueue(){
		super();
	}
	
	/**
	 * Adds a specified element to the priority queue.
	 * @param element
	 * @param priority
	 */
	public void addElement(T element, int priority){
		PriorityQueueNode<T> node = new PriorityQueueNode<T>(element, priority);
		super.add(node);
	}
	
	/**
	 * Removes the next highest priority element from this queue and returns
	 * a reference to it.
	 * @return
	 */
	public T removeNext(){
		PriorityQueueNode<T> node = (PriorityQueueNode<T>)super.removeMax();
		return node.getElement();
	}

}
