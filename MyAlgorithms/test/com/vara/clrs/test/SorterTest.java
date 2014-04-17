/**
 * 
 */
package com.vara.clrs.test;

import com.vara.clrs.sort.Sorter;

/**
 * @author vnagall
 *
 */
public class SorterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] source = new int[] {100,2,7,99,-1};
		Sorter sorter = new Sorter();
		System.out.println("Before Sorting the Array :: ");
		sorter.dispaly(source);
		System.out.println();
		sorter.applyInsertionSort(source);
		System.out.println("After Sorting the Array :: ");
		sorter.dispaly(source);
	}
	
	

}
