/**
 * Sort a linked list in O(n log n) time using constant space complexity.
 */
package com.lco.probs;

/**
 * @author vpsrini
 *
 */

class ListNode {
	 int val;
	 ListNode next;
	 ListNode(int x) {
		 val = x;
		 next = null;
	 }

}

public class Solution3 {

	public ListNode sortList(ListNode head) {
		
		if(head == null || head.next == null){
			return head;
		}
		
		ListNode ps = head;
		ListNode pf = head.next;
		
		while(pf != null && pf.next != null){
			ps = ps.next;
			pf = pf.next.next;
		}
		ListNode second = ps.next;
		ps.next = null;
		
		ListNode leftPart = this.sortList(head);
		
		ListNode rightPart = this.sortList(second);
		
		return merge(leftPart, rightPart);
		
    }
	
	
	private ListNode merge(ListNode p, ListNode k){
		ListNode head = new ListNode(-1);
		ListNode l = head;
		
		while(p != null && k != null){
			if(p.val < k.val){
				l.next = p;
				p = p.next;
			}else{
				l.next = k;
				k = k.next;
			}
			l = l.next;
		}
		
		if(p != null){
			l.next = p;
		}
		
		if(k != null){
			l.next = k;
		}
		
		return head.next;
	}
	
	public void display(ListNode head){
		while(head != null){
			System.out.print(head.val);
			System.out.print("\t");
			head = head.next;
		}
	}

}
