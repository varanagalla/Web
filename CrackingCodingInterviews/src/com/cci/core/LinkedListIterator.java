/**
 * 
 */
package com.cci.core;

/**
 * @author vpsrini
 *
 */
public class LinkedListIterator<T extends LinkedList> {
	
		LinkedList linklist = null;
		Node currentNode = null;
		
		public LinkedListIterator(LinkedList linkList){
			this.linklist = linkList;
			this.currentNode = linkList.getHead();
		}
		
		public boolean hasNext(){
			return (currentNode.next != null);
		}
		
		public Node next(){
			currentNode = currentNode.next;
			return currentNode;
		}
		
		public Node remove(){
			linklist.remove(currentNode.get());
			return currentNode;
		}
	
}
