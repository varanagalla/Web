/**
 * 
 */
package com.vara.skiena.sort;

/**
 * @author vpsrini
 *
 */
public class InsertionRecursiveSort<T extends Comparable<T>> extends RecursiveSort<T> {
	
	public InsertionRecursiveSort(T[] source){
		this.source = source;
	}

	@Override
	public void apply() {
		this.sort(0, this.source.length - 1);
	}
	
	private void sort(int start, int end){
		if(end == start){
			return;
		}
		//Get start index for unsorted part.
		int unsorted_index = start + 1;
		T val = this.source[unsorted_index];
		//Shift elements to the right and get the index in the sorted part.
		int shift_to_index = this.shift(unsorted_index, val);
		//Place the element in sorted part.
		if(unsorted_index != shift_to_index){
			this.source[shift_to_index] = val;
		}		
		//Repeat the same for the rest.
		this.sort(start+1, end);
	}
	
	private int shift(int unsorted, T val){
		if(unsorted <= 0 || this.less(this.source[unsorted - 1], val)){
			return unsorted;
		}
		this.source[unsorted] = this.source[unsorted-1];
		return this.shift(unsorted - 1, val);
	}

}
