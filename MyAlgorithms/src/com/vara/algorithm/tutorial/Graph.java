/**
 * 
 */
package com.vara.algorithm.tutorial;

import java.util.ArrayList;

/**
 * @author VaraPrasad_Nagalla
 * @param <T>
 *
 */
public class Graph<T> {
	private ArrayList<T>[] vertices;
	private int noOfEdges;
	
	@SuppressWarnings("unchecked")
	public Graph(int v){
		vertices = (ArrayList<T>[])new ArrayList[v];
		for(int i=0; i<v; i++){
			vertices[i] = new ArrayList<T>();
		}
	}
	
	
	public void addEdge(T vertex1, T vertex2){
		this.vertices[vertex1.hashCode()].add(vertex2);
		this.vertices[vertex2.hashCode()].add(vertex1);
		this.noOfEdges++;
	}
	
	public int getE(){
		return noOfEdges;
	}
	
	public int getV(){
		return vertices.length;
	}
	
	public Iterable<T> adj(T vertex){
		return vertices[vertex.hashCode()];
	}
	
	public Iterable<T> adj(int vertex){
		return vertices[vertex];
	}
	
	
}
