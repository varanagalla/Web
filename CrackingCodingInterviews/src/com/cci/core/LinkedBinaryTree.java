/**
 * 
 */
package com.cci.core;

import java.util.Iterator;

import com.cci.exception.ElementNotFoundException;

/**
 * @author vpsrini
 *
 */
public class LinkedBinaryTree<T> implements IBinaryTree<T> {
	
	protected BTNode<T> root;
	
	public LinkedBinaryTree(){
		this.root = null;
	}
	
	public LinkedBinaryTree(T element){
		this.root = new BTNode<T>(element);
	}
	
	public LinkedBinaryTree(T element, LinkedBinaryTree<T> left, 
									   LinkedBinaryTree<T> right){
		this.root = new BTNode<T>(element);
		if(left != null){
			this.root.setLeft(left.root);
		}
		if(right != null){
			this.root.setRight(right.root);
		}
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<T> iterator() {
		return this.inOrder();
	}

	/* (non-Javadoc)
	 * @see com.cci.core.IBinaryTree#getRootElement()
	 */
	@Override
	public T getRootElement() {
		if(root == null){
			throw new RuntimeException("The tree is empty.");
		}
		return root.getElement();
	}

	/* (non-Javadoc)
	 * @see com.cci.core.IBinaryTree#getLeft()
	 */
	@Override
	public IBinaryTree<T> getLeft() {
		if(root == null){
			throw new RuntimeException("The tree is empty.");
		}
		LinkedBinaryTree<T> lst = new LinkedBinaryTree<T>();
		lst.root = root.getLeft();
		return lst;
	}

	/* (non-Javadoc)
	 * @see com.cci.core.IBinaryTree#getRight()
	 */
	@Override
	public IBinaryTree<T> getRight() {
		if(root == null){
			throw new RuntimeException("The tree is empty.");
		}
		LinkedBinaryTree<T> rst = new LinkedBinaryTree<T>();
		rst.root = root.getRight();
		return rst;
	}

	/* (non-Javadoc)
	 * @see com.cci.core.IBinaryTree#contains(java.lang.Object)
	 */
	@Override
	public boolean contains(T target) {
		return this.find(target) != null;
	}

	/* (non-Javadoc)
	 * @see com.cci.core.IBinaryTree#find(java.lang.Object)
	 */
	@Override
	public T find(T target) {
		if(root == null){
			throw new RuntimeException("The tree is empty.");
		}
		BTNode<T> node = root.find(target);
		if(node == null){
			throw new ElementNotFoundException("No such element found.");
		}
		return node.getElement();
	}

	/* (non-Javadoc)
	 * @see com.cci.core.IBinaryTree#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return this.size() == 0;
	}

	/* (non-Javadoc)
	 * @see com.cci.core.IBinaryTree#size()
	 */
	@Override
	public int size() {
		int size = 0;
		if(root != null){
			size = root.count();
		}
		return size;
	}

	/* (non-Javadoc)
	 * @see com.cci.core.IBinaryTree#preOrder()
	 */
	@Override
	public Iterator<T> preOrder() {
		ArrayIterator<T> iter = new ArrayIterator<T>();
		if(root != null){
			root.preorder(iter);
		}
		return iter;
	}

	/* (non-Javadoc)
	 * @see com.cci.core.IBinaryTree#inOrder()
	 */
	@Override
	public Iterator<T> inOrder() {
		ArrayIterator<T> iter = new ArrayIterator<T>();
		if(root != null){
			root.inorder(iter);
		}
		return iter;
	}

	/* (non-Javadoc)
	 * @see com.cci.core.IBinaryTree#postOrder()
	 */
	@Override
	public Iterator<T> postOrder() {
		ArrayIterator<T> iter = new ArrayIterator<T>();
		if(root != null){
			root.postorder(iter);
		}
		return iter;
	}

	/* (non-Javadoc)
	 * @see com.cci.core.IBinaryTree#levelOrder()
	 */
	@Override
	public Iterator<T> levelOrder() {
		ArrayIterator<T> iter = new ArrayIterator<T>();
		if(root != null){
			IQueue<BTNode<T>> queue = new LinkedQueue<BTNode<T>>();
			queue.enqueue(root);
			BTNode<T> elem = null;
			while(!queue.isEmpty()){
				elem = queue.dequeue();
				iter.add(elem.element);
				if(elem.getLeft() != null){
					queue.enqueue(elem.getLeft());
				}
				if(elem.getRight() != null){
					queue.enqueue(elem.getRight());
				}
			}
		}
		return iter;
	}

}
