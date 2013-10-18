/**
 * 
 */
package com.cci.stacks.and.queues;

import com.cci.core.IStack;
import com.cci.core.LinkedStack;

/**
 * @author vpsrini
 *
 */
public class SetOfStacks<T> implements IStack<T> {
	
	Object[] setOfStacks = null;
	private int threshold = 5;
	
	//current stack index.
	private int csi = 0;
	
	public SetOfStacks(){
		this(1);
	}
	
	public SetOfStacks(int initCap){
		setOfStacks = new Object[initCap];
		setOfStacks[0] = new LinkedStack<T>();//Stack<T>();
	}

	@SuppressWarnings("unchecked")
	@Override
	public void push(T element) {
		this.ensureCapacity();
		((IStack<T>)setOfStacks[csi]).push(element);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T pop() {
		T element = ((IStack<T>)setOfStacks[csi]).pop();
		this.shrinkCapacity();
		return element;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T peek() {
		return ((IStack<T>)setOfStacks[csi]).peek();
	}

	@Override
	public boolean isEmpty() {
		return length() == 0;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void display() {
		System.out.println("MAIN - HEAD --> ");
		for(int i=csi; i>=0; i-- ){
			((IStack<T>)setOfStacks[i]).display();
		}
		System.out.println("MAIN - END");
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public int length() {
		int size = 0;
		for(Object object : setOfStacks){
			size += ((IStack<T>)object).length();
		}
		return size;
	}
	
	@SuppressWarnings("unchecked")
	private void ensureCapacity(){
		int size = ((IStack<T>)setOfStacks[csi]).length();
		if(size == threshold){
			++csi;
			Object[] extendedStack = new Object[csi + 1];
			System.arraycopy(setOfStacks, 0, extendedStack, 0, csi);
			extendedStack[csi] = new LinkedStack<T>();//Stack<T>();
			this.setOfStacks = extendedStack;
		}
	}
	
	@SuppressWarnings("unchecked")
	private void shrinkCapacity(){
		int size = ((IStack<T>)setOfStacks[csi]).length();
		if(size == 0 && csi > 0){
			setOfStacks[csi] = null;
			--csi;
		}
		
	}

}
