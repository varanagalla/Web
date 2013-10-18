/**
 * 
 */
package com.cci.linkedlists;

import com.cci.core.LinkedList;
import com.cci.core.Node;
import com.cci.core.Problem;
import com.cci.core.Stack;

/**
 * Problem: Implement a function to check if a linked list is a palindrome.
 * @author vpsrini
 *
 */
public class Problem6 extends Problem {
	
	private LinkedList<String> source = null;
	private boolean result = false;
	
	public Problem6(LinkedList<String> source){
		this.source = source;
	}

	/* (non-Javadoc)
	 * @see com.cci.core.Problem#solve()
	 */
	@Override
	public void solve() {
		Node<String> ptr1 = source.getHead();
		Node<String> ptr2 = source.getHead();
		
		Stack<String> firstHalf = new Stack<String>();
		
		while(ptr2 != null && ptr2.next != null){
			ptr2 = ptr2.next.next;
			ptr1 = ptr1.next;
			firstHalf.push(ptr1.get());
		}
		
		if(ptr2 != null){
			ptr1 = ptr1.next;
		}
		
		while(ptr1 != null){
			if(!ptr1.get().equals(firstHalf.pop())){
				result = false;
				return;
			}
			ptr1 = ptr1.next;
		}
		result = true;
	}

	/* (non-Javadoc)
	 * @see com.cci.core.Problem#showResults()
	 */
	@Override
	public void showResults() {
		source.display();
		System.out.println("Is this Palindrome? " + result);
	}

}
