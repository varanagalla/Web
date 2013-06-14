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
		
		if(this.nDisks == 1){
			System.out.println("Disk 1 moved from "+ from + " to "+to);
		}
		else{
			//Move top (n-1) disks from S(source) to I(intermediate). 
			this.moveDisks((topNDisks-1), from, to, inter);
			System.out.println("Disk "+ topNDisks + " moved from "+ from + " to "+inter );
			this.moveDisks((topNDisks-1), inter, from, to);
		}
	}
}
