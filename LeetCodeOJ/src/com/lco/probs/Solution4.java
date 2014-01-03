/**
 * 
 */
package com.lco.probs;

/**
 * Sort a linked list using insertion sort.
 * @author vpsrini
 *
 */

public class Solution4 {
	
	public ListNode insertionSortList(ListNode head) {
		
		if(head == null || head.next == null){
			return head;
		}
		ListNode current = head.next;
		//avoid cycle.
		head.next = null;
		ListNode nextCur = null;
		ListNode preNode = null;
		ListNode postNode = null;
		while(current != null){
			nextCur = current.next;
			//Roll over the small element as head.
			if(current.val < head.val){
				current.next = head;
				head = current;
			}else{
				preNode = head; 
				postNode = head.next;
				//Fit the element in right place.
				while(postNode != null && (postNode.val < current.val)){
					preNode = postNode;
					postNode = postNode.next;
				}
				current.next = postNode;
				preNode.next = current;
			}
			current = nextCur;
		}
		return head;
    }
	
	public void display(ListNode head){
		while(head != null){
			System.out.print(head.val);
			System.out.print("\t");
			head = head.next;
		}
	}
}
