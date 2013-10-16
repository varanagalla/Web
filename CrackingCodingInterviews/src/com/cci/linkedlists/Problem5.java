/**
 * 
 */
package com.cci.linkedlists;

import com.cci.core.LinkedList;
import com.cci.core.Node;
import com.cci.core.Problem;

/**
 * @author vpsrini
 *
 */
public class Problem5 extends Problem {
	
	private LinkedList<Integer> augend;
	private LinkedList<Integer> addend;
	private LinkedList<Integer> result;
	private int mode;
	
	public Problem5(LinkedList<Integer> augend, LinkedList<Integer> addend, int mode){
		this.augend = augend;
		this.addend = addend;
		this.mode = mode;
		this.result = new LinkedList<Integer>();
	}

	/* (non-Javadoc)
	 * @see com.cci.core.Problem#solve()
	 */
	@Override
	public void solve() {
		Node<Integer> l1 = augend.getHead().next;
		Node<Integer> l2 = addend.getHead().next;
		PartialSum psum = null;
		Node<Integer> resultHead = result.getHead();
		int carry = 0;
		if(mode == 1){
			while(l1 != null || l2 != null ){
				psum = this.getSum(l1, l2,carry);
				resultHead.next = psum.sum;
				resultHead = psum.sum;
				carry = psum.carry;
				l1 = (l1 != null)? l1.next : null;
				l2 = (l2 != null) ? l2.next : null;
			}
		}else{
			//TODO solve  followup problem. 
		}
		
		
		
	}

	/* (non-Javadoc)
	 * @see com.cci.core.Problem#showResults()
	 */
	@Override
	public void showResults() {
		result.display();
	}
	
	
	private class PartialSum{
		Node<Integer> sum = null;
		int carry = 0;	
		
		public PartialSum(int sum){
			this.sum = new Node<Integer>(sum%10);
			this.carry = sum/10;
		}
		
	}
	
	private PartialSum getSum(Node<Integer> auNode, Node<Integer> adNode, int carry){
		int augend = (auNode == null || auNode.get() == null) ? 0 : auNode.get();
		int addend = (adNode == null || adNode.get() == null) ? 0 : adNode.get();
		
		int value = augend + addend + carry;
		
		PartialSum pSum = new PartialSum(value);
		
		return pSum;
	}

}
