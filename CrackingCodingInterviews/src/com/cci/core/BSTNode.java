/**
 * 
 */
package com.cci.core;

/**
 * @author vpsrini
 *
 */
public class BSTNode<T extends Comparable<T>> extends BTNode<T> {

	public BSTNode(T element) {
		super(element);
	}
	
	/**
	 * 
	 * @param element
	 */
	public void add(T element){
		
		int compare = element.compareTo(this.element);
		
		if(compare < 0){
			if(left == null){
				this.left = new BSTNode<T>(element);
			}else{
				((BSTNode<T>)this.left).add(element);
			}
		}else{
			if(right == null){
				this.right = new BSTNode<T>(element);
			}else{
				((BSTNode<T>) this.right).add(element);
			}
		}
	}
	
	/**
	 * 
	 */
	public BSTNode<T> find(T target){
		BSTNode<T> found = null;
		int compare = target.compareTo(this.element);
		if(compare == 0){
			found = this;
		}
		else if(compare < 0){
			if(left != null){
				found = ((BSTNode<T>)this.left).find(target);
			}
		}else{
			if(right != null){
				found =  ((BSTNode<T>)this.right).find(target);
			}
		}
		return found;
	}
	
	/**
	 * Removes the specified target from this subtree. Returns a reference to the revised tree.
	 * @param target
	 * @return
	 */
	public BSTNode<T> remove(T target){
		
		BSTNode<T> removed = null;
		int compare = target.compareTo(this.element);
		if(compare == 0){
			if(this.left == null && this.right == null){
				removed = null;
			}else if(this.left != null && this.right == null){
				removed = (BSTNode<T>)this.left;
			}else if(this.left == null && this.right != null){
				removed = (BSTNode<T>)this.right;
			}else{
				removed = this.getSuccessor();
				removed.left = left;
				removed.right = right;
			}
		}else{
			if(compare < 0){
				this.left = ((BSTNode<T>)this.left).remove(target);
			}else{
				this.right = ((BSTNode<T>)this.right).remove(target);
			}
		}	
		return removed;
	}
	/**
	 * This method gets the inorder successor of the current element and
	 * removed the successor from its original location in the tree.
	 * @return
	 */
	protected BSTNode<T> getSuccessor(){
		BSTNode<T> successor = (BSTNode<T>)this.right;
		while(successor.left != null){
			successor = (BSTNode<T>)successor.left;
		}
		//Removes the successor from its original location in the tree.
		((BSTNode<T>)this.right).remove(successor.getElement());
		return successor;
	}

}
