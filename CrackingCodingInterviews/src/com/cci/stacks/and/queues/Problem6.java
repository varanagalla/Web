/**
 * 
 */
package com.cci.stacks.and.queues;

import com.cci.core.Problem;
import com.cci.core.Stack;

/**
 * Problem: Write a program to sort a Stack in ascending order (with biggest items on top).
 * 		    You may use at most one additional stack to hold items.
 * @author vpsrini
 *
 */
public class Problem6 extends Problem {
	
	Stack<Integer> sorted = null;
	Stack<Integer> source = null;
	public Problem6(Stack<Integer> stack){
		this.source = stack;
		sorted = new Stack<Integer>(stack.length());
	}
	
	/* (non-Javadoc)
	 * @see com.cci.core.Problem#solve()
	 */
	@Override
	public void solve() {
		int tmp = 0;
		while(!source.isEmpty()){
			tmp = source.pop();
			while(!sorted.isEmpty() && sorted.peek() > tmp){
				source.push(sorted.pop());
			}
			sorted.push(tmp);
		}
	}

	/* (non-Javadoc)
	 * @see com.cci.core.Problem#showResults()
	 */
	@Override
	public void showResults() {
		sorted.display();
	}

}
