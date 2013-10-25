/**
 * 
 */
package com.vara.skiena.sort;

/**
 * @author vpsrini
 *
 */
public class SelectionRecursiveSort<T extends Comparable<T>> extends RecursiveSort<T> {
	
	public SelectionRecursiveSort(T[] source){
		this.source = source;
	}

	@Override
	public void apply() {
		this.sort(0, this.source.length - 1);
	}
	
	private void sort(int start, int end){
		if(start > end){
			return;
		}
		int min = start;
		//Get the minimum index out of rest of the array.
		min = this.getMin(start+1, min, end);
		if(start != min){
			//swap minimum element with start.
			this.swap(start, min);
		}
		//Repeat the same for the rest.
		this.sort(start + 1, end);	
	}
	
	private int getMin(int start, int min, int end){
		if(start > end){
			return min;
		}
		min = (this.less(this.source[start], this.source[min])) ? start :min;
		return getMin(start+1, min, end);
	}

}
