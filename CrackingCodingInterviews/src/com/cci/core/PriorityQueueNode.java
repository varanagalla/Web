/**
 * 
 */
package com.cci.core;

/**
 * @author vpsrini
 *
 */
public class PriorityQueueNode<T> implements Comparable<PriorityQueueNode<T>> {
	
	private static int nextorder = 0;
	private int priority;
	private int order;
	private T element;
	
	public PriorityQueueNode(T element, int priority){
		this.element = element;
		this.priority = priority;
		this.order = nextorder;
		nextorder++;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(PriorityQueueNode<T> o) {
		int result;
		if(this.priority < o.getPriority()){
			result = -1;
		}else if(this.priority > o.getPriority()){
			result = 1;
		}else if(this.order > o.getOrder()){
			result = -1;
		}else{
			result = 1;
		}
		return result;
	}

	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	/**
	 * @return the order
	 */
	public int getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(int order) {
		this.order = order;
	}

	/**
	 * @return the element
	 */
	public T getElement() {
		return element;
	}

	/**
	 * @param element the element to set
	 */
	public void setElement(T element) {
		this.element = element;
	}
	
	public String toString(){
		String temp = (element.toString()) + priority + order;
		return temp;
	}
}
