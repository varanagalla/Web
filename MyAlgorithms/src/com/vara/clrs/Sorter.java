/**
 * 
 */
package com.vara.clrs;

/**
 * @author vnagall
 *
 */
public class Sorter {

		public void applyInsertionSort(int[] source){
			this.sortMeByInsertionSort(source, 0, source.length - 1);
		}
		
		private void sortMeByInsertionSort(int[] source, int start, int end){
			//Divide until you have 2 elements in array.
			if((end - 1) > start){
				sortMeByInsertionSort(source, start, end-1);
			}
			//Fit A[n] in A[1 .. n-1] elements.
			int j = end-1;
			int key = source[end];
			while (j >=0 && source[j] > key){
				source[j+1] = source[j];
				j--;
			}
			source[j+1] = key;
			
		}
		
		
		public void merge(int[] source, int start, int mid, int end){
			
			int[] left = new int[mid- start + 1];
			int[] right = new int[end-mid];
			
			//Copy start->mid in left array.
			for (int l=0; l < left.length; l++){
				left[l] = source[start+l];
			}
			//Copy (mid+1)->end in right array.
			for (int r=0; r < right.length; r++){
				right[r] = source[mid+1+r];
			}
			
			int i=0, j = 0, k=0;
			
			while (i < left.length && j < right.length){
				if(left[i] < right[j]){
					source[k++] = left[i++];
				}else{
					source[k++] = right[j++];
				}
			}
			//Left over left part (Right array is shorter.)
			if(i < left.length){
				for(;i<left.length;){
					source[k++] = left[i++];
				}
			}
			//Left over right part (Left array is shorter.)
			if(j < right.length){
				for(;j < right.length;){
					source[k++] = right[j++];
				}
			}
			
		}
}
