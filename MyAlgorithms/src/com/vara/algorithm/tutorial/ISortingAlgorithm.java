/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * @author la-vpsrini
 *
 */
public interface ISortingAlgorithm {
	/**
	 * Applies selection sort over the underlying data elements. But this would a bad choice 
	 * because amortized cost of this sort is ~N^2/2 always. See the implementation class for more details.
	 */
	void applySelectionSort();
	
	/**
	 * Applies insertion sort over the underlying data elements. This sorting technique works well for smaller arrays( thousands)
	 * But not recommended for big arrays in which case the amortized cost would become Quadratic (~N2/4).
	 * Works best on partially sorted array elements.
	 */
	void applyInsertionSort();
	
	/**
	 * Applies Shell sort over the underlying data elements. This sorting technique is an improved insertion sort.
	 * This one uses Knuth's algorithm to choose the index to check back. 
	 */
	void applyShellSort();
	
	/**
	 * Most sophisticated traditional algorithm.
	 */
	void applyMergeSort();
	void display();
}
