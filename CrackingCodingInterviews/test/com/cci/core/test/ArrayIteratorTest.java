/**
 * 
 */
package com.cci.core.test;

import com.cci.core.ArrayIterator;

/**
 * @author vpsrini
 *
 */
public class ArrayIteratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayIterator<Integer> iter = new ArrayIterator<Integer>();
		for(int i=1; i<=10; i++){
			iter.add(i);
		}
		
		while(iter.hasNext()){
			System.out.print(iter.next() + "\t");
		}
	}

}
