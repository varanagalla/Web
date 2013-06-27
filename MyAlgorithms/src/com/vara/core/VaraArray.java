/**
 * 
 */
package com.vara.core;

/**
 * @author vpsrini
 *
 */
public class VaraArray extends VaraArrParent implements IVaraArray{

	public VaraArray(){
		super();
	}
	
	public VaraArray(int size){
		super(size);
	}
	
	@Override
	public int find(int value){
		int index = -1;
		int arrIndex = 0;
		for(int i : arr){
			if(i == value){
				index = arrIndex;
				break;
			}
			arrIndex++;
		}
		return index;
	}
	
	@Override
	public void insert(int value){
		arr[nElem] = value;
		nElem ++;
	}
	
	@Override
	public void delete(int value){
		int arrIndex = this.find(value);
		while(arrIndex >= 0){
			this.pullElementsUp(arrIndex);
			nElem--;
			arrIndex = this.find(value);
		}
		
	}

	@Override
	public void applySort() {
		//this.applyBubbleSort();
		//this.applySelectionSort();
		//this.applyInsertionSort();
		//this.applyMergeSort();
		//this.applyShellSort();
		this.applyQuickSort();
	}
	

}
