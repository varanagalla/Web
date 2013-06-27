/**
 * 
 */
package com.vara.algorithm.tutorial.test;

import com.vara.algorithm.tutorial.QuickUnion;
import com.vara.algorithm.tutorial.UnionFind;

/**
 * @author vpsrini
 *
 */
public class UnionFindTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UnionFind uf = new QuickUnion(10);//new QuickFind(10);
		uf.union(4, 3);
		uf.union(3, 8);
		uf.union(6, 5);
		uf.union(9, 4);
		uf.union(2, 1);
		uf.union(8, 9);
		uf.union(5, 0);
		uf.union(7, 2);
		uf.union(6, 1);
		uf.union(7, 3);
	}

}
