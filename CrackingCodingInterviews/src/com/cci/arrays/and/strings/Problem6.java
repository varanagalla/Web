/**
 * 
 */
package com.cci.arrays.and.strings;

import com.cci.core.Problem;

/**
 * Problem: Given an image represented by an NxN matrix, where each pixel in the 
 * 			image is 4 bytes, write a method to rotate the image by 90 degrees.
 * 			can you do this in place?
 * @author vpsrini
 *
 */
public class Problem6 extends Problem {
	
	private int[][] source = null;
	private int dimension = 0;
	public Problem6(int[][] source, int n){
		this.source = source;
		this.dimension = n;
	}

	/* (non-Javadoc)
	 * @see com.cci.core.Problem#solve()
	 */
	@Override
	public void solve() {
		int last = 0;
		int offset = 0;
		int top = 0;
		for(int i=0; i < dimension/2; ++i){
			last = dimension - 1 - i;
			for(int j=i; j < last; ++j){
				offset = j - i;
				//Take top value into temporary top.
				top = source[i][j];
				
				//left -> top
				source[i][j] = source[last-offset][i];
				
				//bottom -> left
				source[last-offset][i] = source[last][last-offset];
				
				//right -> bottom
				source[last][last-offset] = source[j][last];
				
				//top -> right
				source[j][last] = top;				
			}
		}

	}

	/* (non-Javadoc)
	 * @see com.cci.core.Problem#showResults()
	 */
	@Override
	public void showResults() {
		for(int i=0; i < dimension; i++){
			for(int j=0; j < dimension; j++){
				System.out.print(source[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
