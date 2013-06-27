/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * @author vpsrini
 * Quick Find algorithm to solve dynamic connectivity problems.
 */
public class QuickFind extends UnionFind{
	
	private int nElem;
	
	public QuickFind(){
		
	}
	
	public QuickFind(int nElem){
		this.nElem = nElem;
		this.initialize(nElem);
	}
	
	//TODO
	/*public void initialize(int[] vals){
		this.vals = vals;
	}*/
	
	
	@Override
	public boolean isConnected(int p, int q){
		return vals[p] == vals[q];
	}
	
	@Override
	public void union(int p, int q){
		if(!this.isConnected(p, q)){
			int pVal = vals[p];
			int qVal = vals[q];
			for(int i=0;i < nElem ; i++){
				if(vals[i] == pVal){
					vals[i] = qVal;
				}
			}
			//displays operation output.
			this.displayUnionOp(p, q);
		}
	}
	

}
