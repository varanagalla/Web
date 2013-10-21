/**
 * 
 */
package com.cci.core;

/**
 * @author vpsrini
 *
 */
public interface MaxHeap<T extends Comparable<T>> extends IBinaryTree<T> {
	
	/**
	 * Adds the specified element to heap.
	 * @param element
	 */
	public void add(T element);
	
	/**
	 * Returns a reference to the element with the highest value in the heap. 
	 * @return
	 */
	public T getmax();
	
	/**
	 * Removes and returns the element with the highest value in the 
	 * heap. 
	 * @return
	 */
	public T removeMax();
	
}
