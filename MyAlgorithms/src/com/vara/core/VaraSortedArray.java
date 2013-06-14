/**
 * 
 */
package com.vara.core;


/**
 * @author vpsrini
 *
 */
public class VaraSortedArray extends VaraArrParent implements IVaraArray{

	public VaraSortedArray(){
		super();
	}
	
	public VaraSortedArray(int size){
		super(size);
	}
	
	@Override
	public int find(int value) {
		int index = this.binarySearch(value);
		/*int i = 0;
		while(i < nElem){
			if(arr[i] == value){
				index = i;
				break;
			}
			i++;
		}*/
		return index;
	}

	@Override
	public void insert(int value) {
		if(arr.length == nElem){
			throw new RuntimeException("Array is full");
		}
		int index = this.getIndex(value);
		this.pushElementsDown(index);
		arr[index] = value;
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
	
	private int getIndex(int value){
		int index = 0;
		for(index =0; index<nElem;index++){
			if(arr[index] > value){
				break;
			}
		}
		return index;
	}
	
	private int binarySearch(int value){
		int lb = 0;
		int ub = nElem - 1;
		int index = -1;
		int tempInd = 0;
		while(lb < ub){
			tempInd = ((lb+ub)/2) + 1;
			
			//Too high.
			if(arr[tempInd] > value){
				ub = tempInd;
			}
			//Too low.
			else if(arr[tempInd] < value){
				lb = tempInd;
			}
			//Correct
			else if(arr[tempInd] == value){
				index = tempInd;
				break;
			}
			
		}
		return index;
	}

	@Override
	public void applySort() {
		this.applyBubbleSort();
	}

}
