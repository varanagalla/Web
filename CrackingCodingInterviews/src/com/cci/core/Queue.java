/**
 * 
 */
package com.cci.core;

/**
 * @author vpsrini
 *
 */
public class Queue<T> implements IQueue<T>{
	
	private int head = 0;
	private int tail = -1;
	private Object[] elements = null;
	
	
	public Queue(){
		this(1);
	}
	
	public Queue(int initialCapacity){
		this.elements = new Object[initialCapacity];
	}
	
	public Queue(T[] elements){
		for(T element : elements){
			this.enqueue(element);
		}
	}
	
	public void enqueue(T element){
		this.ensureCapacity();
		this.elements[++tail] = element;
	}
	
	@SuppressWarnings("unchecked")
	public T dequeue(){
		this.shrinkCapacity();
		return (T) elements[head++];
	}
	
	public boolean isEmpty(){
		return head > tail;
	}
	
	public void display(){
		System.out.print("HEAD --> ");
		for (int i=head; i<=tail; i++){
			System.out.print(elements[i] + " --> ");
		}
		System.out.println("END");
	}
	
	public int length(){
		return (tail-head) + 1;
	}
	
	private void ensureCapacity(){
		if(length() >= elements.length){
			int size = 2*length() + 1;
			Object[] extendedArray = new Object[size];
			System.arraycopy(elements, 0, extendedArray, 0, length());
			this.elements = extendedArray;
			System.out.println("Queue size extended to : "+size);
		}
	}
	
	private void shrinkCapacity(){
		if(length() < elements.length/2){
			int size = elements.length/2;
			Object[] shrinkedArray = new Object[size];
			System.arraycopy(elements, head, shrinkedArray, 0, length());
			this.elements = shrinkedArray;
			this.tail -= head;
			this.head = 0;
			System.out.println("Queue size shrinked to : "+size);
		}
	}
	

}
