/**
 * 
 */
package com.cci.linkedlists;

import com.cci.core.LinkedList;
import com.cci.core.Node;
import com.cci.core.Problem;

/**
 * Implement an algorithm to find the kth to last element of a singly linked list.
 * @author vpsrini
 *
 */
public class Problem2 extends Problem {
	
	private LinkedList<String> source = null;
	private int K = 0;
	private String result = null;
	
	public Problem2(LinkedList<String> source, int K){
		this.source = source;
		this.K = K;
	}

	/* (non-Javadoc)
	 * @see com.cci.core.Problem#solve()
	 */
	@Override
	public void solve() {
		if(!source.isEmpty()){
			Node<String> ptr1 = source.getHead().next;
			Node<String> ptr2 = source.getHead().next;
			int i = 0;
			while(i < K){
				if(ptr2.next == null){
					System.err.println("K "+K+" cannot be greater than or equal to size of linked list " + (i+1));
					throw new RuntimeException("Reached end of the linked list.");
				}
				ptr2 = ptr2.next;
				i++;
			}
			
			while(ptr2.next != null){
				ptr1 = ptr1.next;
				ptr2 = ptr2.next;
			}
			
			result = ptr1.get();
			
		}
		
		
	}

	/* (non-Javadoc)
	 * @see com.cci.core.Problem#showResults()
	 */
	@Override
	public void showResults() {
		source.display();
		System.out.println("K(" + K + ")th to last element for the given linked list :: "+result);
	}

}
