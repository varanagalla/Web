/**
 * 
 */
package com.vara.core;

/**
 * @author vpsrini
 *
 */
public class VaraQueue {
	
	private int[] queueArray;
	private int front;
	private int rear;
	private int nElem;
	private int maxSize;
	
	public VaraQueue(int size){
		this.front = 0;
		this.rear = -1;
		this.nElem = 0;
		this.maxSize = size;
	}
	
	public void add(int value){
		if(this.isFull()){
			throw new RuntimeException("Queue is full.");
		}
		if(this.rear == (this.maxSize - 1)){
			this.rear = -1;
		}
		this.queueArray[++rear] = value;
		this.nElem++;
	}
	
	public int remove(){
		if(this.isEmpty()){
			throw new RuntimeException("Queue is empty as of now.");
		}
		int val = this.queueArray[front++];
		if(this.front == this.maxSize){
			this.front = 0;
		}
		this.nElem--;
		return val;
	}
	
	public int peek(){
		return this.queueArray[front];
	}
	
	public boolean isEmpty(){
		return nElem == 0;
	}
	
	public boolean isFull(){
		return nElem == maxSize;
	}
}
