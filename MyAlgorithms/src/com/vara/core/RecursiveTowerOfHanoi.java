/**
 * 
 */
package com.vara.core;

/**
 * @author vpsrini
 *
 */
public class RecursiveTowerOfHanoi extends TowerOfHanoi{
	private char fromTower;
	private char toTower;
	private char interTower;
	private int nDisks;
	
	public RecursiveTowerOfHanoi(int nDisks, char from, char inter, char to){
		this.nDisks = nDisks;
		this.fromTower = from;
		this.interTower = inter;
		this.toTower = to;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.vara.core.TowerOfHanoi#solve()
	 */
	@Override
	public void solve(){
		this.moveDisks(nDisks, fromTower, interTower, toTower);
	}
	
	private void moveDisks(int topNDisks, char from, char inter, char to){
		//2.Move remaining disks from S(source) to D(destination).
		if(topNDisks == 1){
			System.out.println("Disk 1 moved from "+ from + " to "+to);
		}
		else{
			//1.Move subtree consisting top (n-1) disks from S(source) to I(intermediate). 
			this.moveDisks((topNDisks-1), from, to, inter);
			System.out.println("Disk "+ topNDisks + " moved from "+ from + " to "+to );
			//3.Move subtree from I(intermediate) to D(destination).
			this.moveDisks((topNDisks-1), inter, from, to);
		}
	}
}
