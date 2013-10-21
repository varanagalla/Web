/**
 * 
 */
package com.cci.core;

import com.cci.exception.ElementNotFoundException;

/**
 * @author vpsrini
 *
 */
public class LinkedBinarySearchTree<T extends Comparable<T>> extends
		LinkedBinaryTree<T> implements BinarySearchTree<T> {
	
	public LinkedBinarySearchTree(){
		super();
	}


	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see com.cci.core.BinarySearchTree#add(java.lang.Object)
	 */
	@Override
	public void add(T element) {
		if(this.root != null){
			((BSTNode<T>)this.root).add(element);
		}else{
			this.root = new BSTNode<T>(element);
		}
	}

	/* (non-Javadoc)
	 * @see com.cci.core.BinarySearchTree#findMin()
	 */
	@Override
	public T findMin() {
		if(this.root.left == null){
			return this.root.element;
		}
		BSTNode<T> leftNode = (BSTNode<T>)this.root.left;
		while(leftNode.left != null){
			leftNode = (BSTNode<T>)leftNode.left;
		}
		return leftNode.element;
		
	}

	/* (non-Javadoc)
	 * @see com.cci.core.BinarySearchTree#findMax()
	 */
	@Override
	public T findMax() {
		if(this.root.right == null){
			return this.root.element;
		}
		BSTNode<T> rightNode = (BSTNode<T>)this.root.right;
		while(rightNode.right != null){
			rightNode = (BSTNode<T>)rightNode.right;
		}
		return rightNode.element;
	}

	/* (non-Javadoc)
	 * @see com.cci.core.BinarySearchTree#remove(java.lang.Object)
	 */
	@Override
	public T remove(T target) {
		BSTNode<T> node = ((BSTNode<T>)this.root).find(target);
		if(node == null){
			throw new ElementNotFoundException("No such element found.");
		}
		this.root = ((BSTNode<T>)this.root).remove(target);
		return node.getElement();
	}

}
