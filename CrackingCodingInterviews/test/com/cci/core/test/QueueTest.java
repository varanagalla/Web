/**
 * 
 */
package com.cci.core.test;

import com.cci.core.IQueue;
import com.cci.core.LinkedQueue;
import com.cci.core.Queue;

/**
 * @author vpsrini
 *
 */
public class QueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IQueue<Integer> myQueue = new LinkedQueue<Integer>();//Queue<Integer>();
		myQueue.enqueue(10);
		myQueue.enqueue(1);
		myQueue.enqueue(23);
		myQueue.enqueue(7);
		myQueue.enqueue(5);
		
		myQueue.display();
		
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.dequeue());
		//System.out.println(myQueue.dequeue());
		
		myQueue.display();
		
		IQueue<Integer> myAnotherQueue = new LinkedQueue<Integer>();//Queue<Integer>(3);
		for(int i=0; i<50; i++){
			myAnotherQueue.enqueue(i);
		}
		myAnotherQueue.display();
	}

}
