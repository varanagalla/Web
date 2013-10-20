/**
 * 
 */
package com.cci.core;

import java.util.Iterator;

/**
 * @author vpsrini
 *
 */
public interface IBinaryTree<T> extends Iterable<T> {
	
	
	/**
	 * This method returns the root element.
	 * @return
	 */
	public T getRootElement();
	
	/**
	 * This method returns left subtree of the root.
	 * @return
	 */
	public IBinaryTree<T> getLeft();
	
	/**
	 * This method returns the right subtree of the root.
	 * @return
	 */
	public IBinaryTree<T> getRight();
	
	/**
	 * Returns true if the binary tree contains an element that matches the specified element 
	 * and false otherwise.
	 * @param target
	 * @return
	 */
	public boolean contains(T target);
	
	/**
	 * Returns a reference to the element in the tree matching the specified target.
	 * @param target
	 * @return
	 */
	public T find(T target);
	
	/**
	 * Returns true if the binary tree contains no elements, and false otherwise.
	 * @return
	 */
	public boolean isEmpty();
	
	/**
	 * Returns the number of elements in this binary tree.
	 * @return
	 */
	public int size();
	
	/**
	 * Returns the string representation of the binary tree.
	 * @return
	 */
	public String toString();
	
	/**
	 * Returns a pre-order traversal of a binary tree. 
	 * @return
	 */
	public Iterator<T> preOrder();
	
	/**
	 * Returns a in-order traversal of a binary tree.
	 * @return
	 */
	public Iterator<T> inOrder();
	
	/**
	 * Returns a post-order traversal of a binary tree.
	 * @return
	 */
	public Iterator<T> postOrder();
	
	/**
	 * Returns a level-order traversal of a binary tree.
	 * @return
	 */
	public Iterator<T> levelOrder();
	
}
