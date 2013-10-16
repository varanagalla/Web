/**
 * 
 */
package com.cci.linkedlists;

import com.cci.core.LinkedList;
import com.cci.core.LinkedListIterator;
import com.cci.core.Node;
import com.cci.core.Problem;

/**
 * Problem: Implement an algorithm to delete a node in the middle of a singly linked list,
 * 			given only access to that node.
 * @author vpsrini
 *
 */
public class Problem3 extends Problem {

	private LinkedList<String> source = null;
	private String nodeVal = null;
	
	public Problem3(LinkedList<String> source, String value){
		this.source = source;
		this.nodeVal = value;
		
	}
	/* (non-Javadoc)
	 * @see com.cci.core.Problem#solve()
	 */
	@Override
	public void solve() {
		LinkedListIterator<String> iterator = new LinkedListIterator<String>(source);
		Node<String> currentNode = null;
		while(iterator.hasNext()){
			currentNode = iterator.next();
			if(currentNode.get().equals(nodeVal)){
				currentNode.set(currentNode.next.get());
				currentNode.next = currentNode.next.next;
				break;
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.cci.core.Problem#showResults()
	 */
	@Override
	public void showResults() {
		source.display();
	}
	

}
