/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * @author la-vpsrini
 * This is a data structure which helps us implement the priority queue operations quickly an efficiently. 
 */
public class BinaryHeap implements IBinaryHeap{
	private int[] data;
	private int nElem;
	
	public BinaryHeap(){
		this.data = new int[2];
		//The array effectively starts at index 1 to compute the child node indexes effectively.
		this.nElem = 0;
	}
	
	public BinaryHeap(int[] data){
		this.data = data;
		this.nElem = data.length;
	}
	
	public void insert(int value){
		this.ensureCapacity();
		this.data[++nElem] = value;
		this.swim(nElem);
	}
	
	public int popMax(){
		int max =  data[1];
		this.exchange(1, this.nElem--);
		sink(1);
		this.data[this.nElem + 1] = 0;
		return max;
	}
	
	public int max(){
		return data[1];
	}
	
	public int size(){
		return this.nElem;
	}
	
	public boolean isEmpty(){
		return this.nElem == 0;
	}
	
	private void ensureCapacity(){
		if(this.nElem + 1 == this.data.length){
			this.resize((this.data.length * 2) + 1);
		}
	}
	
	private void resize(int size){
		int[] copy = new int[size];
		int i = 1;
		int copySize = Math.min(size, this.data.length);
		
		while(i < copySize){
			copy[i] = data[i];
			i++;
		}
		this.data = copy;
	}
	
	/**
	 * This is a bottom-up heapify technique.
	 * Child's key becomes larger key than its parent's key.
	 * Node promoted to level of competence.
	 * @param k
	 */
	private void swim(int k){
		//As long as we not at root and parent < child.
		while(k>1 && (data[k/2] < data[k])){
			//Replace parent with child. Because child is greater than its parent.
			this.exchange(k, k/2);
			k = k/2;
		}
	}
	
	/**
	 * This is a top down heapify technique.
	 * Parent's key becomes smaller than one (or both) of it's children.
	 * Exchange key in parent with key in larger child.
	 * Repeat until heap order restored.
	 * @param k
	 */
	private void sink(int k){
		//Deep dive into binary tree.
		while(2*k <= this.nElem){
			int childInd = 2*k;
			//Pick larger child.
			if(childInd < this.nElem && data[childInd] < data[childInd + 1]){
				childInd ++;
			}
			//check for violation, if violated exchange it else we are done.
			if(!(data[k] < data[childInd])){
				break;
			}
			this.exchange(k, childInd);
			//proceed.
			k = childInd;			
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

	@Override
	public void sort() {
		
	}
	
	
}
