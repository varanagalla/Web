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
			System.out.print(arr[i] + "\t");
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
		//Marker loop.
		for(int out = 1; out < nElem; out++){
			temp = arr[out];
			in = out;
			//Make room for the entry.
			while(in > 0 && arr[in-1] >= temp){
				arr[in] = arr[in-1];
				--in;
			}
			arr[in] = temp;
		}
	}
	
	/*
	 * Applies Merge sort algorithm to sort the elements in array. (O(NlogN))
	 */
	protected void applyMergeSort(){
		int lb = 0;
		int ub = nElem - 1;
		int[] workArray = new int[nElem];
		this.recMergeSort(workArray, lb, ub);
	}
	
	private void recMergeSort(int[] workArray, int lb, int ub){
		if(lb == ub){
			return;
		}
		else{
			int mid = (lb + ub)/2;
			this.recMergeSort(workArray, lb, mid);
			this.recMergeSort(workArray, (mid + 1), ub);
			this.merge(workArray, lb, (mid + 1), ub);
		}
	}
	
	private void merge(int[] workArray, int lowerPtr, int highPtr, int ub){
		int lb = lowerPtr;
		int mid = highPtr - 1;
		int index = 0;
		int noOfElements = ub - lb + 1;
		while(lowerPtr <= mid && highPtr <= ub){
			if(arr[lowerPtr] < arr[highPtr]){
				workArray[index++] = arr[lowerPtr++];
			}
			else{
				workArray[index++] = arr[highPtr++];
			}
			
		}
		
		//ArrayB is empty.
		while(lowerPtr <= mid){
			workArray[index++] = arr[lowerPtr++];
		}
		
		//ArrayA is empty.
		while(highPtr <= ub){
			workArray[index ++] = arr[highPtr++];
		}
		
		//Modify original array.
		for(int j=0; j<noOfElements;j++){
			arr[lb + j] = workArray[j];
		}
		
	}
	
	protected void applyShellSort(){
		int outer = 0;
		int inner = 0;
		int h = 1;
		int temp;
		
		//Knuth's formula for Gap Sequence.
		while(h <= nElem/3){
			h = h*3 + 1;
		}
		
		while(h > 0){
			for(outer = h; outer < nElem;outer++){
				temp = arr[outer];
				inner = outer;
				while(inner > (h-1) && arr[inner-h] >= temp){
					arr[inner] = arr[inner-h];
					inner-= h;
				}
				arr[inner] = temp;
			}
			h = (h-1)/3;
		}
	}
	
	protected void applyQuickSort(){
		this.recQuickSort(0, nElem -1);
	}
	
	private void recQuickSort(int left, int right){
		int pivot = arr[right];
		
		//Base case.
		if(right-left <= 0){
			return;
		}
		else{
			int partition = this.partitionIt(left, right, pivot);
			recQuickSort(left, partition-1);
			recQuickSort(partition+1, right);
		}
		
	}
	
	private int partitionIt(int left,int right, int pivot){
		int leftPtr = left -1;
		int rightPtr = right;
		
		while(true){
			while(arr[++leftPtr] < pivot){
				//Do nothing.
			}
			
			while(rightPtr > 0  && arr[--rightPtr] > pivot){
				//Do nothing;
			}
			
			if(leftPtr >= rightPtr){
				break;
			}else{
				swapUs(leftPtr, rightPtr);
			}
		}
		swapUs(leftPtr, right);
		return leftPtr;
	}

}
