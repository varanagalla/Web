/**
 * 
 */
package com.cci.core;

import java.util.Iterator;

/**
 * @author vpsrini
 *
 */
public class ArrayIterator<T> implements Iterator<T>{

	Object[] array = null;
	private int ci = 0;
	private int iIndex = 0;
	
	public ArrayIterator(){
		this(1);
	}
	
	public ArrayIterator(int initCapacity){
		this.array = new Object[initCapacity];
		this.ci = 0;
	}
	
	public void add(T element){
		this.ensureCapacity();
		array[ci++] = element;
	}

	@Override
	public boolean hasNext() {
		return iIndex < ci;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T next() {
		return (T) array[iIndex++];
	}

	@Override
	public void remove() {
		array[iIndex] = null;
		ci--;
		this.shrinkCapacity();
	}
	
	public void reset(){
		this.iIndex = 0;
	}
	
	private void ensureCapacity(){
		if(ci >= array.length){
			Object[] extendedArray = new Object[2 * array.length + 1];
			System.arraycopy(array, 0, extendedArray, 0, ci);
			this.array = extendedArray;
		}
	}
	
	private void shrinkCapacity(){
		if(ci < array.length/2){
			Object[] shrinkdedArray = new Object[array.length/2];
			System.arraycopy(array, 0, shrinkdedArray, 0, ci);
			this.array = shrinkdedArray;
		}
	}
	

}
