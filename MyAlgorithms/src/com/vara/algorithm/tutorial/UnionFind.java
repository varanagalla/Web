/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * @author vpsrini
 *
 */
public abstract class UnionFind {
	protected int[] vals;
	
	public abstract boolean isConnected(int p, int q);
	
	public abstract void union(int p, int q);
	
	protected void initialize(int nElem){
		this.vals = new int[nElem];
		int i = 0;
		while(i < nElem){
			this.vals[i] = i;
			i++;
		}
	}
	
	protected void displayUnionOp(int p, int q){
		System.out.println("**********************************************************************************************");
		System.out.print("union("+p+","+q+") :: ");
		for(int i : vals){
			System.out.print("\t" + i);
		}System.out.println();
		System.out.println("**********************************************************************************************");
		System.out.println();
	
	}
}
