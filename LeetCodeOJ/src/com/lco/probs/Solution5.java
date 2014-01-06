/**
 * 
 */
package com.lco.probs;

/**
 * @author vpsrini
 *
 */
public class Solution5 {
	
	public int findOrderStat(int[] a1, int[] a2, int k){
		int result = Integer.MIN_VALUE;
		int begin = Math.max(0, k-a2.length);
		int end = Math.min(a1.length, k);
		
		while(begin < end){
			int mid = begin + (end - begin)/2;
			
			if((mid < a1.length) && (k-mid > 0) && a1[mid] < a2[k-mid-1]){
				begin = mid + 1;
			}else if(mid > 0 && (k-mid < a2.length) && a1[mid-1] < a2[k-mid]){
				end = mid;
			}else{
				begin = mid;
				break;
			}
		}
		
		if(begin == 0){
			result = a2[k-1];
		}else if(begin == k){
			result = a1[k-1];
		}else{
			result = Math.max(a1[begin - 1],a2[k - begin - 1]);
		}
		
		return result;
	}
}
