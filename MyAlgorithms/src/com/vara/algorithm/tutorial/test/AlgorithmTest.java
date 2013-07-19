/**
 * 
 */
package com.vara.algorithm.tutorial.test;

import com.vara.algorithm.tutorial.ISortingAlgorithm;
import com.vara.algorithm.tutorial.SortingAlgorithmImpl;

/**
 * @author la-vpsrini
 *
 */
public class AlgorithmTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] data = new int[]{9,8,7,6,5,4,3,2,1,0};
		ISortingAlgorithm sortAlgo = new SortingAlgorithmImpl(data);
		
		sortAlgo.applyMergeSort();
		
		sortAlgo.display();
	}

}
