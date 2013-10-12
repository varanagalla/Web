/**
 * 
 */
package com.vara.algorithm.tutorial.test;

import com.vara.algorithm.tutorial.ContiguousMaxSum;

/**
 * @author vpsrini
 *
 */
public class ContiguousMaxSumTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] sourceArray = {5, 15, -30, 10, -5, 40, 10};
			//{5,15,-30,10,-7,-5,40,10};
		ContiguousMaxSum cms = new ContiguousMaxSum(sourceArray);
		cms.getSequence();
		/*int[] subArray = 
		int subArraySize = subArray.length;
		int index = 0;
		System.out.print("[");
		for(int val : subArray){
			System.out.print(val);
			if(index < (subArraySize - 1)){
				System.out.print(",");
			}
			index += 1;
		}
		System.out.print("]");*/
	}

}
