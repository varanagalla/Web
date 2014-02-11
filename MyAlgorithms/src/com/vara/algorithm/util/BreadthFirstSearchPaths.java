/**
 * 
 */
package com.vara.algorithm.util;

import java.util.LinkedList;
import java.util.Queue;

import com.vara.core.Graph;
import com.vara.core.Paths;

/**
 * @author vpsrini
 *
 */
public class BreadthFirstSearchPaths extends Paths {

	public BreadthFirstSearchPaths(Graph G, int source){
		this.source = source;
		this.isMarked = new boolean[G.getVertices()];
		this.edgeTo = new Integer[G.getVertices()];
		this.BFS(G, source);
	}
	
	private void BFS(Graph G, int vertex){
		Queue<Integer> queue = new LinkedList<Integer>();
		this.isMarked[vertex] = true;
		queue.add(vertex);
		
		while(!queue.isEmpty()){
			int curVertex = queue.poll();
			for(int adjVertex : G.adj(curVertex)){
				if(!isMarked[adjVertex]){
					isMarked[adjVertex] = true;
					edgeTo[adjVertex] = curVertex;
					queue.add(adjVertex);
				}
			}
		}
	}
	
}
