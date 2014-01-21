/**
 * 
 */
package com.lco.probs;

/**
 * @author vpsrini
 *
 */
public class LinkedListCycleTest {
	public static void main(String[] args){
		ListNode head = new ListNode(-1);
		LinkedListUtil.addLinkNodes(head, new int[]{1,2});//{2,7,3,8,1,0,-1,-6});
		//LinkedListUtil.display(head);
		LinkedListCycle lc = new LinkedListCycle();
		System.out.println(lc.detectCycle(head.next).val);
	}
	
}
