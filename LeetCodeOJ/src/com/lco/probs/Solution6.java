/**
 * 
 */
package com.lco.probs;

/**
 * @author vpsrini
 *
 */
public class Solution6 {
	
	public int findTopIndex(int[] arr, int k){
		
		if(k >= arr.length){
			return 0;
		}		
		int p = -1;
		int low = 0;
		int hi = arr.length - 1;
		p = this.partition(arr, low, hi);
		
		
		while(k != (hi - p)+1){
			if(k > (hi - p)+1){
				p = this.partition(arr, low, p-1);
			}else{
				p = this.partition(arr, p+1, hi);
			}
		}
		return p;
	}
	
	private int partition(int[] arr, int low, int hi){
		int pivot = hi;
		int fh = low;
		
		for(int i=low; i<hi; i++){
			if(arr[i] < arr[pivot]){
				this.swap(arr,i,fh);
				fh++;
			}
		}
		this.swap(arr, fh, pivot);
		return fh;
	}
	
	private void swap(int[] arr, int a, int b){
		if(a != b){
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
	}

}
