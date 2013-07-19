/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * @author la-vpsrini
 *
 */
public interface IBinaryHeap {
	void insert(int item);
	int popMax();
	int size();
	int max();
	void display();
	boolean isEmpty();
	void sort();
}
