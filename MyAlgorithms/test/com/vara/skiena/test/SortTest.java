/**
 * 
 */
package com.vara.skiena.test;

import com.vara.skiena.sort.InsertionRecursiveSort;
import com.vara.skiena.sort.RecursiveSort;
import com.vara.skiena.sort.SelectionRecursiveSort;

/**
 * @author vpsrini
 *
 */
public class SortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] source = //new Integer[]{10, 20, 1, 0, 7};
				new Integer[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		RecursiveSort<Integer> sortAlgo = new InsertionRecursiveSort<Integer>(source);
		sortAlgo.apply();
		System.out.println("Insertion Sort Algo :: (See below)");
		sortAlgo.display();
		System.out.println();
		
		 source = new Integer[]{10, 20, 1, 0, 7};
					//new Integer[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		System.out.println("Selection Sort Algo :: (See below)");
		sortAlgo = new SelectionRecursiveSort<Integer>(source);
		sortAlgo.apply();
		sortAlgo.display();
		System.out.println();
	}

}
