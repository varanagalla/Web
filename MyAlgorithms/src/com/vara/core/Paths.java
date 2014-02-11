/**
 * 
 */
package com.vara.core;

import java.util.Stack;

/**
 * @author vpsrini
 *
 */
public abstract class Paths {
	
	protected int source;
	
	protected Integer[] edgeTo;
	
	protected boolean[] isMarked;
	
	
	public boolean hasPathTo(int vertex) {
		return isMarked[vertex];
	}

	
	public Iterable<Integer> pathTo(int vertex) {
		if(!hasPathTo(vertex)){
			return null;
		}
		Stack<Integer> pathToVertex = new Stack<Integer>();
		int x = vertex;
		while(x != source){
			pathToVertex.push(x);
			x = edgeTo[x];
		}
		pathToVertex.push(source);
		return pathToVertex;
	}
}
