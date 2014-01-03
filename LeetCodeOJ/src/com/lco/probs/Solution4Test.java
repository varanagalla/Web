/**
 * 
 */
package com.lco.probs;

/**
 * @author vpsrini
 *
 */
public class Solution4Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ListNode head = new ListNode(-1);
		addLinkNodes(head, new int[]{2,7,3,2,6});
		
		
		Solution4 sln3 = new Solution4();
		System.out.println("Before Sort :: (See Below)");
		sln3.display(head.next);
		System.out.println();
		
		head = sln3.insertionSortList(head.next);
		System.out.println("After sort :: (See Below)");
		sln3.display(head);
		
	}
	
	static void addLinkNodes(ListNode head, int[] elements){
		ListNode c = head;
		for(int element : elements){
			c.next = new ListNode(element);
			c = c.next;
		}
	}

}
