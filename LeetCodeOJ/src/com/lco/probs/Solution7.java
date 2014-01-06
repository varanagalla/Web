/**
 * 
 */
package com.lco.probs;

/**
 * Simultaneous min and max with 3*N/2 - 1 comparisons.
 * @author vpsrini
 *
 */
public class Solution7 {
	public void findMinMax(int[] arr){
		if(arr == null || arr.length == 0){
			return;
		}
		int[] lowArr = new int[arr.length/2 + 1];
		int[] highArr = new int[arr.length/2 + 1];
		int iLow = 0;
		int iHigh = 0;
		int i = 0;
		for(i=0; i < arr.length; i++){
			if(i == arr.length - 1){
				break;
			}
			else if(arr[i] < arr[i+1]){
				lowArr[iLow++] = arr[i];
				highArr[iHigh++] = arr[++i];
			}else{
				highArr[iHigh++] = arr[i];
				lowArr[iLow++] = arr[++i];
			}
		}
		
		
		int min = this.findMin(lowArr, iLow);
		int max = this.findMax(highArr,  iHigh);
		
		min = (i < arr.length && arr[i] < min) ? arr[i] : min;
		max = (i < arr.length && arr[i] > max) ? arr[i] : max;
		
		System.out.println("Min :: " + min );
		System.out.println("Max :: " + max);
	}
	
	private int findMin(int[] arr, int bound){
		int min = arr[0];
		for(int i=1; i < bound; i++){
			if(arr[i] <  min){
				min = arr[i];
			}
		}
		return min;
	}
	
	private int findMax(int[] arr, int bound){
		int max = arr[0];
		for(int i=1; i < bound; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}
}
