/**
 * 
 */
package com.vara.algorithm.tutorial.test;

import com.vara.algorithm.tutorial.IBinaryHeap;
import com.vara.algorithm.tutorial.ModifiedBinaryHeap;

/**
 * @author la-vpsrini
 *
 */
public class HeapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IBinaryHeap heap = new ModifiedBinaryHeap();
		
		heap.insert(9);
		heap.insert(10);
		heap.insert(11);
		heap.insert(15);
		heap.insert(25);
		heap.insert(12);
		heap.insert(13);
		
		heap.sort();
		
		heap.display();
		
		System.out.println(heap.size());
		
		while(!heap.isEmpty()){
			System.out.println("Max :: "+heap.popMax() +"," + "Size :: "+heap.size());
			heap.display();
		}
		
	}

}
