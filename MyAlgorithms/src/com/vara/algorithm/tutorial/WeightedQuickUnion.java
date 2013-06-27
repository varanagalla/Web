/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * @author vpsrini
 * Find(isConnected) and Union takes lgN (**to the base 2) times only.
 */
public class WeightedQuickUnion extends QuickUnion {
	
	private int[] sizeArray;
	
	public WeightedQuickUnion(int nElem){
		super(nElem);
		this.sizeArray = new int[nElem];
		for(int i=0; i<nElem;i++){
			this.sizeArray[i] = 1;
		}
	}

	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.UnionFind#union(int, int)
	 */
	@Override
	public void union(int p, int q) {
		if(!this.isConnected(p, q)){
			
			int rootP = root(p);
			int rootQ = root(q);
			
			//If tree size of root(p) > that of root(q) -> tree(q) goes into tree(p). 
			if(sizeArray[rootP] >= sizeArray[rootQ]){
				this.vals[rootQ] = rootP;
				sizeArray[rootP] += sizeArray[rootQ];
			}else{
				this.vals[rootP] = rootQ;
				sizeArray[rootQ] += sizeArray[rootP];
			}
			
			this.displayUnionOp(p, q);
		}
	}

}
