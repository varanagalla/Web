/**
 * 
 */
package com.vara.algorithm.tutorial.test;

import com.vara.algorithm.tutorial.LSDSort;

/**
 * @author vpsrini
 *
 */
public class LSDSortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] source = new String[]{
				"4PGC938",
				"2IYE230",
				"3CIO720",
				"1ICK750",
				"1OHV845",
				"4JZY524",
				"1ICK750",
				"3CIO720",
				"1OHV845",
				"1OHV845",
				"2RLA629",
				"2RLA629",
				"3ATW723"
		};
		LSDSort lsd = new LSDSort(source);
		lsd.performSort();
		
		for(String s : source){
			System.out.println(s);
		}
	}

}
