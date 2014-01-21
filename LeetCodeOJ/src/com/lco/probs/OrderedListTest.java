/**
 * 
 */
package com.lco.probs;

/**
 * @author vpsrini
 *
 */
public class OrderedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListNode head = new ListNode(-1);
		LinkedListUtil.addLinkNodes(head, new int[]{2,7,3,8,1,0,-1,-6});
		
		
		OrderedList ol = new OrderedList();
		
		ol.display(head.next);
		System.out.println();
		
		ol.zipList(head.next);
		ol.display(head.next);
		System.out.println();
		
		//head = ol.reverse(head.next);
		
		//ol.display(head);
		
	}
	
	
	

}
