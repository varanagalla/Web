/**
 * 
 */
package com.cci.stacks.and.queues;

import com.cci.core.Problem;
import com.cci.core.Stack;

/**
 * Problem: Classic Tower of Hanoi problem.
 * 			Write a program to move the disks from the first tower to the last using stacks.
 * @author vpsrini
 *
 */
public class TowerOfHanoi extends Problem {
	
	private int noOfDisks = 0;
	private Stack<Integer> result = null;
	
	public TowerOfHanoi(int noOfDisks){
		this.noOfDisks = noOfDisks;
	}

	/* (non-Javadoc)
	 * @see com.cci.core.Problem#solve()
	 */
	@Override
	public void solve() {
		Tower[] towers = new Tower[3];
		for(int i=0; i < 3; i++){
			towers[i]= new Tower(i);
		}
		for(int i=noOfDisks; i > 0; i--){
			towers[0].add(i);
		}
		towers[0].moveDisks(noOfDisks, towers[2], towers[1]);
		result = towers[2].disks;
	}
	
	

	/* (non-Javadoc)
	 * @see com.cci.core.Problem#showResults()
	 */
	@Override
	public void showResults() {
		result.display();
	}
	
	private class Tower{
		private Stack<Integer> disks = null;
		private int index;
		
		private Tower(int index){
			this.disks = new Stack<Integer>();
			this.index = index;
		}
		
		public void add(int diskNo){
			if(!disks.isEmpty() && disks.peek() <= diskNo){
				System.err.println("Disk placing error :: "+diskNo);
				return;
			}
			this.disks.push(diskNo);
		}
		
		private void moveTopTo(Tower destination){
			int topDisk = disks.pop();
			destination.add(topDisk);
			System.out.println("Disk "+topDisk+" moved from "+this.index + " to "+destination.index);
		}
		
		public void moveDisks(int n, Tower destination, Tower buffer){
			if(n > 0){
				//Move top (n-1) disks from this tower to buffer.
				this.moveDisks(n-1, buffer, destination);
				//Move top disk to destination tower.
				this.moveTopTo(destination);
				//Move (n-1) disks from buffer to destination,
				buffer.moveDisks(n-1, destination, this);
			}
		}
	}

}
