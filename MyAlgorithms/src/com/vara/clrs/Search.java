/**
 * 
 */
package com.vara.clrs;

/**
 * @author vnagall
 *
 */
public class Search {
	
	public int linearSearch(int[] source, int target){
		int t_ind = -1;
		int no_of_checks = 0;
		for(int i=0; i < source.length; i++){
			no_of_checks++;
			if(source[i] == target){
				t_ind = i;
				break;
			}
			
		}
		System.out.println("Total checks[Linear Search] :: "+no_of_checks);
		return t_ind;
	}
	
	public int binarySearch(int[] source, int target){
		int t_ind = -1;
		int start = 0;
		int end = source.length - 1;
		int no_of_checks = 0;
		int mid_ind = -1;
		while (start <= end  && end >= 0){
			mid_ind = (start + end)/2;
			no_of_checks++;
			if(source[mid_ind] == target){
				t_ind = mid_ind;
				break;
			}else if(source[mid_ind] < target){
				start = mid_ind+1;
			}else{
				end = mid_ind-1;
			}
		}
		System.out.println("Mid Index :: "+mid_ind);
		System.out.println("Total Checks[Binary Search] :: "+no_of_checks);
		return t_ind;
	}
}
