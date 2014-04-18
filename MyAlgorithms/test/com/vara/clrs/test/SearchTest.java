/**
 * 
 */
package com.vara.clrs.test;

import com.vara.clrs.Search;

/**
 * @author vnagall
 *
 */
public class SearchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] source = new int[] {1,2,7,8,23};
		Search search = new Search();
		int r_ind = search.binarySearch(source, 7);
		if(r_ind < 0){
			System.out.println("No element found.");
		}else{
			System.out.println("Element found @ "+r_ind);
		}
	}

}
