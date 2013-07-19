/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * @author la-vpsrini
 *
 */
public class ModifiedBinaryHeap implements IBinaryHeap{
	private int[] data;
	private int nElem;
	
	public ModifiedBinaryHeap(){
		this.data = new int[1];
		this.nElem = 0;
	}
	
	public void insert(int value){
		this.ensureCapacity();
		this.data[nElem++] = value;
		this.swim(nElem - 1);
	}
	
	public int popMax(){
		int max =  data[0];
		this.exchange(0, this.nElem--);
		sink(0);
		this.data[this.nElem + 1] = 0;
		return max;
	}
	
	public int max(){
		return data[0];
	}
	
	public int size(){
		return this.nElem;
	}
	
	private void swim(int k){
		int parInd = k/2;
		if( k > 0 && k % 2 == 0){
			parInd--;
		}
		while(k >= 0  && (data[parInd] < data[k])){
			this.exchange(k, parInd);
			k = parInd;
			parInd = k/2;
		}
	}
	
	private void sink(int k){
		while(2*k + 1 <= this.nElem){
			int childInd = 2*k + 1;
			if(childInd < this.nElem && (data[childInd] < data[childInd + 1])){
				childInd ++;
			}
			if(!(data[k] < data[childInd])){
				break;
			}
			this.exchange(k, childInd);
			k = childInd;
		}
	}
	
	
	private void ensureCapacity(){
		if(this.nElem == this.data.length){
			this.resize(this.data.length * 2);
		}
	}
	
	private void resize(int size){
		int[] copy = new int[size];
		int i = 0;
		int copySize = Math.min(size, this.data.length);
		
		while(i < copySize){
			copy[i] = data[i];
			i++;
		}
		this.data = copy;
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

	@Override
	public boolean isEmpty() {
		return this.nElem == 0;
	}

	@Override
	public void sort() {
		while(this.nElem > 0){
			this.exchange(0, this.nElem--);
			this.sink(0);
		}
		
	}
	
	
}
