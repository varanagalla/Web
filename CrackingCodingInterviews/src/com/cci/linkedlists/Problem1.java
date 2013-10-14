/**
 * 
 */
package com.cci.linkedlists;

import java.util.Hashtable;

import com.cci.core.LinkedList;
import com.cci.core.LinkedListIterator;
import com.cci.core.Node;
import com.cci.core.Problem;

/**
 * Problem : Write code to remove duplicates from an unsorted linkedlist.
 * 			 How would you solve this problem if temporary buffer is not allowed?
 * @author vpsrini
 *
 */
public class Problem1 extends Problem{
	
	private LinkedList source = null;
	private boolean bufferAllowed = false;
	
	public Problem1(LinkedList source, boolean isBufferAllowed){
		this.source = source;
		this.bufferAllowed = isBufferAllowed;
	}

	@Override
	public void solve() {
		
		//With Buffer
		if(bufferAllowed){
			Hashtable<String, Node> hashTable = new Hashtable<String, Node>();
			LinkedListIterator<LinkedList> iterator = new LinkedListIterator<LinkedList>(source);
			while(iterator.hasNext()){
				Node node = iterator.next();
				if(hashTable.containsKey(node.get())){
					iterator.remove();
				}else{
					hashTable.put(node.get(), node);
				}
			}
		}		
		//WithoutBuffer
		else{
			Node ptr1 = source.getHead();
			while(ptr1.next != null){
				Node n = ptr1.next;
				Node ptr2 = n.next;
				while(ptr2 != null){
					if(n.get().equals(ptr2.get())){
						source.remove(ptr2.get());
					}
					ptr2 = ptr2.next;
				}
				ptr1 = n;
			}
		}
	}

	@Override
	public void showResults() {
		source.display();
		
	}

}
