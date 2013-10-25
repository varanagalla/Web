/**
 * 
 */
package com.vara.skiena.sort;

/**
 * @author vpsrini
 *
 */
public abstract class RecursiveSort<T extends Comparable<T>> {
	
	protected T[] source;
	
	public abstract void apply();
	
	protected void swap(int index1, int index2){
		T temp = null;
		temp = source[index1];
		source[index1] = source[index2];
		source[index2] = temp;
	}
	
	protected boolean less(T element1, T element2){
		return (element1.compareTo(element2) < 0);
	}
	
	protected boolean greater(T element1, T element2){
		return (element1.compareTo(element2) > 0);
	}
	
	protected boolean equal(T element1, T element2){
		return (element1.compareTo(element2) == 0);
	}
	
	public void display(){
		System.out.print("[");
		StringBuilder builder = new StringBuilder(source.length);
		for(T element : source){
			builder.append(element).append(",");
		}
		builder.append("\b").append("]");
		System.out.print(builder.toString());
	}

}
