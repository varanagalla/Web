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
				psum = this.getSum(l1, l2, carry);
				resultHead.next = psum.sum;
				resultHead = psum.sum;
				carry = psum.carry;
				l1 = (l1 != null)? l1.next : null;
				l2 = (l2 != null) ? l2.next : null;
			}
		}else{
			int len1 = augend.length();
			int len2 = addend.length();
			if(len2 < len1){
				addend.padMe(0, len1-len2);
			}else if(len1 < len2){
				augend.padMe(0, len2 - len1);
			}
			
			l1 = augend.getHead().next;
			l2 = addend.getHead().next;
			
			psum = getSum(l1,l2);
			if(psum.carry > 0){
				psum.sum = addSumNode(psum.sum, psum.carry);
			}
			resultHead.next = psum.sum;
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
		
		public PartialSum(){
			
		}
		
	}
	
	private PartialSum getSum(Node<Integer> auNode, Node<Integer> adNode, int carry){
		int augend = (auNode == null || auNode.get() == null) ? 0 : auNode.get();
		int addend = (adNode == null || adNode.get() == null) ? 0 : adNode.get();
		
		int value = augend + addend + carry;
		
		PartialSum pSum = new PartialSum(value);
		
		return pSum;
	}
	
	private PartialSum getSum(Node<Integer> auNode, Node<Integer> adNode){
		PartialSum psum = null;
		if(auNode == null && adNode == null){
			return new PartialSum();
		}
		
		psum = getSum(auNode.next, adNode.next);
		
		int sum = auNode.get() + adNode.get() + psum.carry;
		Node<Integer> sumNode = this.addSumNode(psum.sum, sum%10);
		psum.sum = sumNode;
		psum.carry = sum/10;
		return psum;
	}
	
	private Node<Integer> addSumNode(Node<Integer> head, int sum){
		Node<Integer> dataNode = new Node<Integer>(sum);
		dataNode.next = head;
		head = dataNode;
		return head;
	}
	
	

}
