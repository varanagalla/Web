/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * @author vpsrini
 *
 */
public class QuickUnion extends UnionFind{
	
	
	public QuickUnion(int nElem){
		
		this.initialize(nElem);
	}
	
	/**
	 * If both of them have the same root they are connected.
	 */
	@Override
	public boolean isConnected(int p, int q) {
		return root(p) == root(q);
	}
	
	/**
	 * Replace root of p with root of q. Only 1 element changes every time.
	 */
	@Override
	public void union(int p, int q) {
		if(!this.isConnected(p, q)){
			vals[root(p)] = root(q);		
			this.displayUnionOp(p, q);
		}
	}
	/*
	 * Finds the root.got it;
	 */
	protected int root(int val){
		int i = val;
		while(i != vals[i]){
			i = vals[i];
		}
		return i;
	}
}
