/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * @author la-vpsrini
 *
 */
public class SortingAlgorithmImpl implements ISortingAlgorithm {
	
	private int[] data;
	private int nElem;
	private int[] aux;
	
	public SortingAlgorithmImpl(int[] data){
		this.data = data;
		this.nElem = data.length;
	}

	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.ISortingAlgorithm#applySelectionSort()
	 */
	@Override
	public void applySelectionSort() {
		int minIndex = 0;
		for(int i=0; i < nElem; i++){
			minIndex = i;
			//Find the minimum element from rest of the elements.
			for(int j = i; j < nElem;j++){
				if(data[minIndex] > data[j]){
					minIndex = j;
				}
			}
			//If the item pointed by vertical bar is greater than that of minimum found above
			//Exchange them.
			if(data[i] > data[minIndex]){
				this.exchange(i, minIndex);
			}
		}

	}

	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.ISortingAlgorithm#applyInsertionSort()
	 */
	@Override
	public void applyInsertionSort() {
		for(int i=0; i < nElem; i++){
			for(int j=i; j > 0; j--){
				//Exchange the elements if the current one is smaller than previous one.
				if(data[j] < data[j-1]){
					this.exchange(j, (j-1));
				}
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.ISortingAlgorithm#applyShellSort()
	 */
	@Override
	public void applyShellSort() {
		
		int h = 1;
		
		while(h < nElem/3){
			h = 3*h + 1;
		}
		
		while(h >= 1){
			for(int i=h;i<nElem;i++){
				for(int j=i; j >= h; j-=h){
					if(data[j] < data[j-h]){
						exchange(j,j-h);
					}
				}
				
			}
			h = h/3;
		}
		
	}

	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.ISortingAlgorithm#applyMergeSort()
	 */
	@Override
	public void applyMergeSort() {
		this.aux = new int[data.length];
		this.mergeSort(data, 0, nElem-1);
	}
	
	
	private void mergeSort(int[] data, int lo, int hi){
		if(hi == lo){
			return;
		}else{
			int mid = (hi + lo)/2;
			this.mergeSort(data, lo, mid);
			this.mergeSort(data, (mid+1), hi);
			this.mergeSortedArrays(data, lo, mid, hi);
		}
	}
	
	private void mergeSortedArrays(int[] data, int lo, int mid, int hi){
		//first part -> lo to (mid+1).
		//second part -> (mid+1) to hi.
		//First part hi, and second part lo.
		int higher = (mid + 1);
		int lower=lo;
		
		//pre-populate auxillary array with data array.
		for(int k=lo; k<= hi; k++){
			this.aux[k] = data[k];
		}
		
		for(int i=lo; i<=hi; i++){
			//It should be like circular
			//If you past the mid -> go to the second part
			//If you past the hi -> come back to the lower part.
			
			//First part is smaller than second part.
			if(lower > mid){
				data[i] = aux[higher++];
			}
			//Second part is smaller than first part.
			else if(higher > hi){
				data[i] = aux[lower++];
			}
			//Real comparison,
			else if(aux[higher] < aux[lo]){
				data[i] = aux[higher++];
			}
			//Already sorted.
			else{
				data[i] = aux[lower++];
			}
		}
	}
					
	private void exchange(int i,int j){
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	
	public void display(){
		System.out.println("*****************************************************************************************");
		for(int i : data){
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println("*****************************************************************************************");
	}

}
