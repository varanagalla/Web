/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * @author vpsrini
 *
 */
public class WeightedQuickUnionWithPathCompression extends WeightedQuickUnion {

	public WeightedQuickUnionWithPathCompression(int nElem) {
		super(nElem);
	}
	
	@Override
	protected int root(int val){
		int i = val;
		while(i != vals[i]){
			vals[i] = vals[vals[i]];
			i = vals[i];
		}
		return i;
	}

}
