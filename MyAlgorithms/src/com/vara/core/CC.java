/**
 * 
 */
package com.vara.core;

/**
 * @author vpsrini
 *
 */
public class CC {
	
	private boolean[] isMarked;
	private int count=0;
	private int[] id;
	
	public CC(Graph G){
		this.isMarked = new boolean[G.getVertices()];
		this.id = new int[G.getVertices()];
		
		for(int v=0; v < G.getVertices(); v++){
			if(!this.isMarked[v]){
				//apply DFS here on the unmarked vertex.
				this.DFS(G, v);
				count++;
			}
		}
	}
	
	private void DFS(Graph G, int vertex){
		this.isMarked[vertex] = true;
		this.id[vertex] = count;
		for(int adjVertex : G.adj(vertex)){
			if(!this.isMarked[adjVertex]){
				this.DFS(G, adjVertex);
			}
		}
	}
	
	
	public int getCount(){
		return count;
	}
	
	public int getId(int vertex){
		return id[vertex];
	}
	
	public boolean connected(int v, int w){
		return id[v] == id[w];
	}

}
