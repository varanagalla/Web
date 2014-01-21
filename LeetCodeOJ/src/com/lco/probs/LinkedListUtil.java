/**
 * 
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
public class LinkedListUtil {
	static void addLinkNodes(ListNode head, int[] elements){
		ListNode c = head;
		for(int element : elements){
			c.next = new ListNode(element);
			c = c.next;
		}
		c.next = head;
	}
	static void display(ListNode head){
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
}
