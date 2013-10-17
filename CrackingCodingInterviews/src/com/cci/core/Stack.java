/**
 * 
 */
package com.cci.core;

/**
 * @author vpsrini
 *
 */
public class Stack<T> {
	
	private Object[] elements = null;
	private int top = -1;
	
	public Stack(){
		this(1);
	}
	
	public Stack(int initialSize){
		this.elements = new Object[initialSize];
	}
	
	public Stack(T[] elements){
		this.elements = new Object[1];
		for(T element : elements){
			this.push(element);
		}
	}
	
	public void push(T element){
		this.ensureCapacity();
		this.elements[++top] = element;
	}
	
	@SuppressWarnings("unchecked")
	public T pop(){
		T element = null;
		element = (T) this.elements[top--];
		this.shrinkCapacity();
		return element;
	}
	
	@SuppressWarnings("unchecked")
	public T peek(){
		return (T) elements[top];
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public int length(){
		return top + 1;
	}
	
	public void display(){
		System.out.print("TOP <--");
		for(int i = top ; i >= 0 ; i--){
			System.out.print(elements[i] + "<--");
		}
		System.out.println("END");
	}
	
	private synchronized void ensureCapacity(){
		if((length()) >= elements.length){
			int size = 2*length() + 1;
			Object[] extendedElements = new Object[size];
			System.arraycopy(elements, 0, extendedElements, 0, elements.length);
			this.elements = extendedElements;
			System.out.println("Stack capacity extended to "+size);
		}
	}
	
	private synchronized void shrinkCapacity(){
		if(length() < elements.length/2){
			int size = elements.length/2;
			Object[] shrinkedArray = new Object[size];
			System.arraycopy(elements, 0, shrinkedArray, 0, length());
			this.elements = shrinkedArray;
			System.out.println("Stack capacity shrinked to "+size);
		}
	}

}
