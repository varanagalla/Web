/**
 * 
 */
package com.vara.core;

/**
 * @author vpsrini
 *
 */
public class VaraArrParent {
	
	protected int[] arr;
	
	protected final int defSize = 10;
	
	protected int nElem = 0;
	
	public VaraArrParent(){
		arr = new int[defSize];
	}
	
	public VaraArrParent(int size){
		arr = new int[size];
	}
	
	public synchronized void display(){
		for(int i = 0; i < nElem; i++){
			System.out.println(arr[i]);
		}
	}
	
	//Visualize array as stack.
	protected synchronized void pushElementsDown(int index){
		for(int i=nElem; i > index;i--){
			arr[i] = arr[i-1];
		}
	}
	
	protected synchronized void pullElementsUp(int index){
		for(int i = index; i < nElem;i++){
			arr[i] = arr[i + 1];
		}
	}
	/**
	 * Applies Bubble sort algorithm to sort the elements in array.
	 */
	protected void applyBubbleSort(){
		System.out.println("Applying Bubble sort....");
		for(int i = (nElem - 1); i >= 0; i--){
			for (int j = 0; j < i; j++){
				if(arr[j] > arr[j+1]){
					swapUs(j,j+1);
				}
			}
			
		}
	}
	
	private void swapUs(int index1, int index2){
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	/**
	 * Applies Selection sort algorithm to sort the elements in array.
	 */
	protected void applySelectionSort(){
		System.out.println("Applying selection sort....");
		int min = 0;
		for(int i=0; i<(nElem -1);i++){
			min = i;
			for(int j= (i+1);j<nElem;j++){
				if(arr[min] > arr[j]){
					min = j;
				}
			}
			swapUs(i, min);
		}
	}
	/**
	 * Applies Insertion sort algorithm to sort the elements in array.
	 */
	protected void applyInsertionSort(){
		System.out.println("Applying insertion sort.....");
		int temp = 0;
		int in = 0;
		for(int out = 1; out < nElem; out++){
			temp = arr[out];
			in = out;
			while(in > 0 && arr[in-1] >= temp){
				arr[in] = arr[in-1];
				--in;
			}
			arr[in] = temp;
		}
	}

}
