/**
 * 
 */
package com.vara.algorithm.util;

import com.vara.core.Graph;
import com.vara.core.Paths;

/**
 * @author vpsrini
 *
 */
public class DepthFirstSearchPaths extends Paths {
	
	public DepthFirstSearchPaths(Graph G, int source){
		this.source = source;
		this.isMarked = new boolean[G.getVertices()];
		this.edgeTo = new Integer[G.getVertices()];
		this.DFS(G, source);
	}
	
	private void DFS(Graph G, int vertex){
		this.isMarked[vertex] = true;
		for(int adjVertex : G.adj(vertex)){
			if(!isMarked[adjVertex]){
				DFS(G, adjVertex);
				edgeTo[adjVertex] = vertex;
			}
		}
	}

}
