/**
 * 
 */
package com.cci.core;

/**
 * @author vpsrini
 *
 */
public class BTNode<T> {
	
	protected T element;
	protected BTNode<T> left, right;
	
	public BTNode(T element){
		this.element = element;
		this.left = this.right = null;
	}
	
	public T getElement(){
		return element;
	}
	
	public void setElement(T element){
		this.element = element;
	}

	/**
	 * @return the left
	 */
	public BTNode<T> getLeft() {
		return left;
	}

	/**
	 * @param left the left to set
	 */
	public void setLeft(BTNode<T> left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public BTNode<T> getRight() {
		return right;
	}

	/**
	 * @param right the right to set
	 */
	public void setRight(BTNode<T> right) {
		this.right = right;
	}
	
	/**
	 * 
	 * @param target
	 * @return
	 */
	public BTNode<T> find(T target){
		BTNode<T> result = null;
		if(target.equals(this.element)){
			result = this;
		}else{
			if(left != null){
				result = left.find(target);
			}
			if(result == null && right != null){
				result = right.find(target);
			}
		}
		return result;
	}
	
	/**
	 * Return the number of nodes in this sub tree.
	 * @return
	 */
	public int count(){
		int result = 1;
		
		if(left != null){
			result += left.count();
		}
		if(right != null){
			result += right.count();
		}
		
		return result;
	}
	
	public void inorder(ArrayIterator<T> iter){
		//Traverse the left subtree.
		if(left != null){
			left.inorder(iter);
		}
		//Traverse the node.
		iter.add(this.element);
		//Traverse the right subtree.
		if(right != null){
			right.inorder(iter);
		}
	}
	
	public void preorder(ArrayIterator<T> iter){
		//Traverse the node.
		iter.add(element);
		//Traverse the left subtree.
		if(left != null){
			left.preorder(iter);
		}
		//Traverse the right subtree.
		if(right != null){
			right.preorder(iter);
		}
	}
	
	public void postorder(ArrayIterator<T> iter){
		//Traverse the left subtree.
		if(left != null){
			left.postorder(iter);
		}
		//Traverse the right subtree.
		if(right != null){
			right.postorder(iter);
		}
		//Traverse the node.
		iter.add(this.element);
	}
	
	public int height(BTNode<T> node){
		if(node == null){
			return 0;
		}	
		return 1 + Math.max(height(node.left), height(node.right));
		
	}
}
