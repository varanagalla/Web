/**
 * 
 */
package com.lco.probs;

/**
 * @author vpsrini
 *
 */



public class OrderedList {
	
	public void zipList(ListNode head){
		ListNode slow = head;
		ListNode pre_slow = null;
		if(head == null || head.next == null){
			return;
		}
		ListNode fast = head.next;
		while(fast != null && fast.next != null){
			pre_slow = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		//For even number of nodes.
		if(fast != null){
			pre_slow = slow;
			slow = slow.next;
		}
		//Splits the lists into two.
		pre_slow.next = null;
		
		ListNode revHead = this.reverse(slow);
		
		ListNode current = head;
		
		//Zig Zag link.
		while(current != null && revHead != null){
			current = this.connect_a_b_advance_a(current, revHead);
			if(current != null){
				revHead = this.connect_a_b_advance_a(revHead, current);
			}
		}
	}
	
	private ListNode reverse(ListNode head){
		if(head == null || head.next == null){
			return head;
		}
		
		ListNode current = null;
		ListNode temp = null;
		while(head != null){
			temp = head.next;
			head.next = current;
			current = head;
			head = temp;
		}
		return current;
	}
	
	public void display(ListNode head){
		ListNode current = head;
		System.out.println("HEAD -->");
		while(current != null){
			System.out.print(current.val);
			if(current.next != null){
				System.out.print("-->");
			}
			current = current.next;
		}
	}
	
	private ListNode connect_a_b_advance_a(ListNode a, ListNode b){
		ListNode temp = a.next;
		a.next = b;
		return temp;
	}
}
