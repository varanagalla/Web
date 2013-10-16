/**
 * 
 */
package com.cci.core;

/**
 * @author vpsrini
 *
 */
public class LinkedListIterator<T> {
		
		LinkedList<T> linklist = null;
		Node<T> currentNode = null;
		
		public LinkedListIterator(LinkedList<T> linkedList){
			this.linklist = linkedList;
			this.currentNode = linkedList.getHead();
		}
		
		public boolean hasNext(){
			return (currentNode.next != null);
		}
		
		public Node<T> next(){
			currentNode = currentNode.next;
			return currentNode;
		}
		
		public Node<T> remove(){
			linklist.remove(currentNode.get());
			return currentNode;
		}
	
}
