/**
 * 
 */
package com.cci.core;

/**
 * @author vpsrini
 *
 */
public class LinkedMaxHeap<T extends Comparable<T>> extends LinkedBinaryTree<T>
		implements MaxHeap<T> {

	private HeapNode<T> last = null;
	
	public LinkedMaxHeap(){
		super();
		last = null;
	}
	
	public LinkedMaxHeap(T element){
		root = new HeapNode<T>(element);
		last = (HeapNode<T>)root;
	}
	
	/* (non-Javadoc)
	 * @see com.cci.core.MaxHeap#add(java.lang.Comparable)
	 */
	@Override
	public void add(T element) {
		HeapNode<T> node = new HeapNode<T>(element);
		HeapNode<T> newParent = null;
		
		if(root == null){
			root = node;
		}else{
			newParent = ((HeapNode<T>)root).getParentAdd(last);
			if(newParent.left == null){
				newParent.left = node;
			}else{
				newParent.right = node;
			}
		}
		node.setParent(newParent);
		last = node;
		((HeapNode<T>)root).heapifyAdd(last);
	}

	/* (non-Javadoc)
	 * @see com.cci.core.MaxHeap#getmax()
	 */
	@Override
	public T getmax() {
		T element = null;
		if(root != null){
			element = root.getElement();
		}
		return element;
	}

	/* (non-Javadoc)
	 * @see com.cci.core.MaxHeap#removeMax()
	 */
	@Override
	public T removeMax() {
		if(root == null){
			throw new RuntimeException("Tree is empty.");
		}
		T maxElement = root.getElement();
		if(root.count() == 1){
			root = last = null;
		}else{
			HeapNode<T> newLast = ((HeapNode<T>)root).getNewLastNode(last);
			if(last.parent.left == last){
				last.parent.left = null;
			}else{
				last.parent.right = null;
			}
			root.setElement(last.element);
			last = newLast;
			((HeapNode<T>)root).heapifyRemove((HeapNode<T>)root);
		}
		return maxElement;
	}

}
