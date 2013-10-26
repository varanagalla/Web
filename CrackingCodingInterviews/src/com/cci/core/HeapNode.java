/**
 * 
 */
package com.cci.core;

/**
 * @author vpsrini
 *
 */
public class HeapNode<T extends Comparable<T>> extends BTNode<T> {

	HeapNode<T> parent;
	
	public HeapNode(T element) {
		super(element);
		this.parent = null;
	}

	/**
	 * @return the parent
	 */
	public HeapNode<T> getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(HeapNode<T> parent) {
		this.parent = parent;
	}
	
	/**
	 * Returns the node that will be the parent of the new node.
	 * @param last
	 * @return
	 */
	public HeapNode<T> getParentAdd(HeapNode<T> last){
		HeapNode<T> result = last;
		//Assign result to parent as long as the last element
		//is not already left child of its parent.
		while(result.parent != null && result.parent.left != result){
			result = result.parent;
		}
		//Go up to the root in search of the right parent.
		if(result.parent != null){
			//When you are just below the root level, check for the right subtree.
			//if there is no right subtree, root will be parent.
			if(result.parent.right == null){
				result = result.parent;
			}else{
				//If there is a right subtree,return the last left leaf.
				result = (HeapNode<T>)result.parent.right;
				while(result.left != null){
					result = (HeapNode<T>)result.left;
				}
			}
		//If you hit the root go to the last left leaf.	
		}else{
			while(result.left != null){
				result = (HeapNode<T>)result.left;
			}
		}
		return result;
	}
	
	/**
	 * Moves a newly added leaf up to the tree as far as appropriate to 
	 * reestablish the heap.
	 * @param last
	 */
	public void heapifyAdd(HeapNode<T> last){
		T temp;
		HeapNode<T> current = last;
		
		while(current.parent != null && 
				(current.element.compareTo(current.parent.element) > 0)){
			temp = current.element;
			current.element = current.parent.element;
			current.parent.element = temp;
			current = current.parent;
		}
		
	}
	
	/**
	 * Returns the node that will be the new last node after a remove.
	 * @return
	 */
	public HeapNode<T> getNewLastNode(HeapNode<T> last){
		HeapNode<T> result = last;
		while((result.parent != null) && (result.parent.left == result)){
			result = result.parent;
		}
		if(result.parent != null){
			result = (HeapNode<T>)result.parent.left;
		}	
		while(result.right != null){
			result = (HeapNode<T>)result.right;
		}
		return result;
	}
	
	/**
	 * Reorders the heap after removing the root element.
	 * @param root
	 */
	public void heapifyRemove(HeapNode<T> root){
		T temp;
		HeapNode<T> current = root;
		HeapNode<T> lChild = largerChild(root);
		
		while(lChild != null && lChild.element.compareTo(current.element) > 0){
			temp = current.element;
			current.element = lChild.element;
			lChild.element = temp;
			
			current = lChild;
			lChild = largerChild(current);
		}
		
	}
	/**
	 * Returns the larger of the two children of the specified node.
	 * @param node
	 * @return
	 */
	public HeapNode<T> largerChild(HeapNode<T> node){
		HeapNode<T> lChild = null;
		if(node.left == null && node.right == null){
			lChild = null;
		}else if(node.left == null){
			lChild = (HeapNode<T>)node.right;
		}else if(node.right == null){
			lChild = (HeapNode<T>)node.left;
		}else if(node.left.element.compareTo(node.right.element) > 0){
			lChild = (HeapNode<T>)node.left;
		}else{
			lChild = (HeapNode<T>)node.right;
		}
		return lChild;
	}

}
