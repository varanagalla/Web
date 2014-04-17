/**
 * 
 */
package com.vara.clrs.sort;

/**
 * @author vnagall
 *
 */
public class Sorter {

		public void applyInsertionSort(int[] source){
			this.sortMeByInsertionSort(source, 0, source.length - 1);
		}
		
		private void sortMeByInsertionSort(int[] source, int start, int end){
			if((end - 1) > start){
				sortMeByInsertionSort(source, start, end-1);
			}
			int j = end-1;
			int key = source[end];
			while (j >=0 && source[j] > key){
				source[j+1] = source[j];
				j--;
			}
			source[j+1] = key;
			
		}
		
		public void dispaly(int[] source){
			for (int elem : source){
				System.out.print(elem + "\t");
			}
		}
}
