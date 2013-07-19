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
		if(hi <= lo){
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
	
	private int doPartition(int lo, int hi){
		
		int i=lo;
		int j=hi+1;
		int pivotInd = lo;
		while(true){
			
			//Make sure elements on left of pivot are smaller than pivot value.
			while(data[++i] < data[pivotInd]){
				//Precautionary measure taken to make sure 'i' do not pass 'hi' index.
				if(i == hi){
					break;
				}
			}
			
			//Make sure elements on right of pivot are greater than pivot value.
			while(data[--j] > data[pivotInd]){
				//Precautionary measure taken to make sure 'j' do not pass 'lo' index.
				if(j == lo){
					break;
				}
			}
			
			if(i>=j){
				break;
			}
			exchange(i, j);
		}
		//Exchange pivot element with right most element to the partition. 
		//Now left has smaller and right has greater values than pivot.
		exchange(pivotInd, j);
		return j;
	}

	@Override
	public void applyQuickSort() {
		//TODO shuffle the items here.
		this.quickSortItems2(0, nElem-1);
		
	}
	
	public void quickSortItems(int lo, int hi){
		if(hi <= lo){
			return;
		}
		int partition = this.doPartition(lo, hi);
		this.quickSortItems(lo, partition-1);
		this.quickSortItems(partition+1, hi);
	}
	
	public void dijkstraPartitionIt(int lo, int hi){
		int lt = lo;
		int pivot = data[lo];
		int i=lo+1	;
		int gt = hi;
		
		while(i<=gt){
			if(data[i] < pivot){
				this.exchange(lt++, i++);
			}else if(data[i] > pivot){
				this.exchange(i, gt--);
			}else{
				i++;
			}
		}
	}
	
	/**lo i                            lt                           gt                               hi
	 * |--|----------------------------|----------------------------|--------------------------------|
	 * |         <V                    |           =V               |                    >V          |
	 * |-------------------------------|----------------------------|--------------------------------|
	 * @param lo
	 * @param hi
	 */
	public void quickSortItems2(int lo, int hi){
		//TODO shuffle here randomly.
		
		//base case.
		if(hi <= lo){
			return;
		}
		
		int lt = lo;
		int pivot = data[lo];
		int i=lo+1	;
		int gt = hi;
		/*
		 * Dijkstra's 3-way partition algorithm.
		 */
		//scan i from left to right.
		while(i<=gt){
			//data[i] less than pivot then exchange lt,i and increment.
			if(data[i] < pivot){
				this.exchange(lt++, i++);
			//data[i] greater than pivot then exchange i, gt and decrement gt.
			}else if(data[i] > pivot){
				this.exchange(i, gt--);
			//else just increment i.
			}else{
				i++;
			}
		}
		//Dijkstra's 3-way partition algorithm.
		this.quickSortItems2(lo, lt-1);
		this.quickSortItems2(gt+1, hi);
	}

}
