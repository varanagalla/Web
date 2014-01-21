/**
 * 
 */
package com.lco.probs;


/**
 * @author vpsrini
 *
 */
public class Solution3Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListNode head = new ListNode(-1);
		LinkedListUtil.addLinkNodes(head, new int[]{2,7,8,1,0,-1,-6});
		
		Solution3 sln3 = new Solution3();
		System.out.println("Before Sort :: (See Below)");
		sln3.display(head.next);
		System.out.println();
		
		head = sln3.sortList(head.next);
		System.out.println("After sort :: (See Below)");
		sln3.display(head);
		
	}
	
	

}
