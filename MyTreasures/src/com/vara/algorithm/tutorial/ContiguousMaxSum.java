/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * This class finds the contiguous maximum sum subsequence from an integer array
 * using Dynamic Programming Algorithm.
 * @author vpsrini
 *
 */

public class ContiguousMaxSum {
	
	private int[] sourceArray = null;
	
	public ContiguousMaxSum(int[] sourceArray){
		this.sourceArray = sourceArray;
	}
	
	public /*int[]*/ void getSequence(){
		
		int max = 0;
		int max_to_node = 0;
		int begin_index = 0, begin_index_temp=0, end_index = 0;
		int index = 0;
		//int[] subArray = new int[sourceArray.length];
		
		for ( int value : sourceArray ){
			max_to_node = max(value, (max_to_node + value));
			//System.out.println(max_to_node);
			//When max sum becomes negative restart the beginning.
			if(max_to_node < 0){
				begin_index_temp = index + 1;
			}
			
			//When max changes fix end index, and restart the beginning. 
			if(max < max_to_node){
				max = max_to_node;
				begin_index = begin_index_temp;
				end_index = index;
			}
			
			index += 1;
		}
		
		//System.out.println("Begin index: "+begin_index + " End index: "+end_index);
		//Display subsequence now.
		System.out.print("[");
		for(index = begin_index; index <= end_index;  index ++){
			System.out.print(sourceArray[index]);
			if(index < end_index){
				System.out.print(",");
			}
		}
		System.out.print("]");
		//System.arraycopy(sourceArray, begin_index, subArray, 0, (end_index-begin_index) + 1);
		//return subArray;
	}
	
	private int max(int x, int y){
		return (x < y) ? y : x;
	}
	
}




