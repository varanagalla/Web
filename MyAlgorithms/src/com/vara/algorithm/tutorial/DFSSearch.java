/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * @author VaraPrasad_Nagalla
 *
 */
public class DFSSearch<T> extends Paths<T> {
	
	private Graph<T> myGraph;

	public DFSSearch(Graph<T> graph, T vertex) {
		super(graph,vertex);
		this.myGraph = graph;
		this.search(vertex);
	}

	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.Paths#search()
	 */
	@Override
	protected void search(T vertex) {
		this.marked[vertex.hashCode()] = true;
		Iterable<T> adjVertexBag = myGraph.adj(vertex);
		for(T adjVertex : adjVertexBag){
			if(!this.marked[adjVertex.hashCode()]){
				search(adjVertex);
				this.edgeTo[adjVertex.hashCode()] = vertex;
			}
		}
	}
	
	public void printEdges(){
		System.out.println("EdgeTo length :: "+edgeTo.length);
		for(T vertex : this.edgeTo){
			System.out.println(vertex);
		}
	}

}
