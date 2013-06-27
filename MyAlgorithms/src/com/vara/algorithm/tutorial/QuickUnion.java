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

	@Override
	public boolean isConnected(int p, int q) {
		return root(p) == root(q);
	}

	@Override
	public void union(int p, int q) {
		vals[root(p)] = root(q);		
		this.displayUnionOp(p, q);
	}
	
	private int root(int val){
		int i = val;
		while(i != vals[i]){
			i = vals[i];
		}
		return i;
	}
}
