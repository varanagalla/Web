/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * @author VaraPrasad_Nagalla
 *
 */
public class BFSSearch extends Paths<Integer> {

	private Graph<Integer> myGraph;
	public BFSSearch(Graph<Integer> graph, Integer vertex) {
		super(graph, vertex);
		myGraph = graph;
		search(vertex);
	}

	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.Paths#search(java.lang.Object)
	 */
	@Override
	protected void search(Integer vertex) {
		ArrayQueue queue = new ArrayQueue();
		this.marked[vertex.hashCode()] = true;
		queue.enQueue(vertex.hashCode());
		
		while(!queue.isEmpty()){
			int vertexId = queue.deQueue();
			Iterable<Integer> pathKeys = myGraph.adj(vertexId);
			for(Integer pathKey : pathKeys){
				if(!this.marked[pathKey.hashCode()]){
					queue.enQueue(pathKey.hashCode());
					this.marked[pathKey.hashCode()] = true;
					this.edgeTo[pathKey.hashCode()] = vertexId;
				}
			}
		}
	}
	
	public void printEdges(){
		System.out.println("EdgeTo length :: "+edgeTo.length);
		for(Integer vertex : this.edgeTo){
			System.out.println(vertex);
		}
	}

}
