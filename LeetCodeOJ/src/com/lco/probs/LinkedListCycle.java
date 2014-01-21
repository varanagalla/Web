/**
 * 
 */
package com.lco.probs;

/**
 * @author vpsrini
 *
 */
public class LinkedListCycle {
	public boolean hasCycle(ListNode head){
		if(head == null || head.next == null){
			return false;
		}
		ListNode slow = head;
		ListNode fast = head.next;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				return true;
			}
		}
		return false;
	}
	
	public ListNode detectCycle(ListNode head){
		if(head == null || head.next == null){
			return null;
		}
		ListNode slow = head;
		ListNode fast = head.next;
		int cycle_length = 0;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				do{
					++cycle_length;
					fast = fast.next;
				}while(slow != fast);
				
				slow = head; fast = head;
				while(cycle_length > 0){
					fast = fast.next;
					cycle_length--;
				}
				while(slow != fast){
					slow = slow.next;
					fast = fast.next;
				}
				return slow;
			}
		}
		return null;
	}
}
