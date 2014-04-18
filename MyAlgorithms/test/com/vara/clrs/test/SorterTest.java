/**
 * 
 */
package com.vara.clrs.test;

import com.vara.clrs.Sorter;
import com.vara.clrs.Utils;

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
		int[] source = new int[]{3,26,41,52,9,38,49,57};
				//new int[] {100,2,7,99,-1};
		Sorter sorter = new Sorter();
		System.out.println("Before Sorting the Array :: ");
		Utils.dispaly(source);
		System.out.println();
		//sorter.applyInsertionSort(source);
		sorter.merge(source, 0, 3, 7);
		System.out.println("After Sorting the Array :: ");
		Utils.dispaly(source);
	}
	
	

}
