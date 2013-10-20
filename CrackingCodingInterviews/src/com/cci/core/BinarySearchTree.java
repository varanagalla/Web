/**
 * 
 */
package com.cci.core;

/**
 * @author vpsrini
 *
 */
public interface BinarySearchTree<T> extends Comparable<T>, IBinaryTree<T> {
	
	public void add(T element);
	
	public T find(T target);
	
	public T findMin();
	
	public T findMax();
	
	public T remove(T target);

}
