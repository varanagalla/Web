/**
 * 
 */
package com.vara.algorithm.tutorial;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author VaraPrasad_Nagalla
 *
 */
public abstract class Paths<T> {
	protected T[] edgeTo;
	protected boolean[] marked;
	
	@SuppressWarnings("unchecked")
	public Paths(Graph<T> graph, T vertex){
		this.edgeTo = (T[]) Array.newInstance(vertex.getClass(), graph.getV());
		this.marked = new boolean[graph.getV()];
		for(int i=0; i<marked.length;i++){
			this.marked[i] = false;
		}
	}
	
	public boolean hasPathTo(T vertex){
		return this.marked[vertex.hashCode()];
	}
	
	public Iterable<T> pathTo(T vertex){
		ArrayList<T> path = new ArrayList<T>();
		while(edgeTo[vertex.hashCode()].hashCode() > 0){
			path.add(vertex);
			vertex = edgeTo[vertex.hashCode()];
		}
		path.add(vertex);
		return path;
	}
	
	protected abstract void search(T vertex);
}
