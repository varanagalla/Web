/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * @author la-vpsrini
 *
 */
public class IQ1 {
	public void solveQueueWithTwoStacks(){
		IQueue queue = new DualStackQueue();
		
		queue.enQueue(0);
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.enQueue(5);
		queue.enQueue(6);
		queue.enQueue(7);
		queue.enQueue(8);
		queue.enQueue(9);
		
		while(!queue.isEmpty()){
			System.out.print(queue.deQueue() + "\t");
		}
	}
	
	
	public void solveStackWithMax(){
		StackWithMax stackWMax = new StackWithMax();
		stackWMax.push(9);
		stackWMax.push(19);
		stackWMax.push(1);
		stackWMax.push(8);
		stackWMax.push(6);
		stackWMax.push(19);
		stackWMax.push(5);
		stackWMax.push(0);
		stackWMax.push(7);
		stackWMax.push(19);
		stackWMax.push(3);
		
		
		
		while(!stackWMax.isEmpty()){
			System.out.print(stackWMax.pop() + "\t");
			System.out.println("Max of elements available :: "+stackWMax.getMax());
		}
		
		stackWMax.push(9);
		stackWMax.push(2);
		stackWMax.push(19);
		stackWMax.push(1);
		
		while(!stackWMax.isEmpty()){
			System.out.print(stackWMax.pop() + "\t");
			System.out.println("Max of elements available :: "+stackWMax.getMax());
		}
	}
	
	public void solveStackSort(){
		StackWithMax stackWMax = new StackWithMax();
		stackWMax.push(9);
		stackWMax.push(19);
		stackWMax.push(1);
		stackWMax.push(8);
		stackWMax.push(6);
		stackWMax.push(19);
		stackWMax.push(5);
		stackWMax.push(0);
		stackWMax.push(7);
		stackWMax.push(19);
		stackWMax.push(3);
		
		IStack stack = StackSorter.sort(stackWMax);
		
		while(!stack.isEmpty()){
			System.out.print(stack.pop() + "\t");
		}
	}
}
