/**
 * 
 */
package com.cci.linkedlists;

import com.cci.core.LinkedList;
import com.cci.core.LinkedListIterator;
import com.cci.core.Node;
import com.cci.core.Problem;

/**
 * Problem: Write code to partition a linked list around a value x, such that
 * 			all nodes less than x come before all nodes greater than x.
 * @author vpsrini
 *
 */
public class Problem4 extends Problem {
	
	private LinkedList<Integer> source = null;
	private Integer pivot = null;
	private Node<Integer> result = null;
	
	public Problem4(LinkedList<Integer> source, int value){
		this.source = source;
		this.pivot = value;
	}
	
	/* (non-Javadoc)
	 * @see com.cci.core.Problem#solve()
	 */
	@Override
	public void solve() {
		LinkedListIterator<Integer> iterator = new LinkedListIterator<Integer>(source);
		Node<Integer> node = iterator.next();
		int val = 0;
		Node<Integer> before = null;
		Node<Integer> after = null;
		Node<Integer> next = null;
		Node<Integer> pivotNode = null;
		while(node != null){		
			next = iterator.next();
			val = node.get();
			if(val < pivot){
				node.next = before;
				before = node;
			}else if(val == pivot){
				pivotNode = node;
			}
			else{
				node.next = after;
				after = node;
			}
			node = next;
		}
		
		if(before == null){
			if(pivotNode == null){
				source.getHead().next = after;
			}else{
				source.getHead().next = pivotNode;
				pivotNode.next = after;
			}
			return;
		}
		
		source.getHead().next = before;
		
		while(before.next != null){
			before = before.next;
		}
		
		before.next = pivotNode;
		pivotNode.next = after;
	}

	/* (non-Javadoc)
	 * @see com.cci.core.Problem#showResults()
	 */
	@Override
	public void showResults() {
		source.display();
	}

}
