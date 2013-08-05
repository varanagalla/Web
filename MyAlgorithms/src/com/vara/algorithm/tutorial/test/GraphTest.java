/**
 * 
 */
package com.vara.algorithm.tutorial.test;

import com.vara.algorithm.tutorial.BFSSearch;
import com.vara.algorithm.tutorial.DFSSearch;
import com.vara.algorithm.tutorial.Graph;

/**
 * @author VaraPrasad_Nagalla
 *
 */
public class GraphTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Graph<Integer> graph = new Graph<Integer>(7);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 6);
		graph.addEdge(0, 5);
		graph.addEdge(3, 4);
		graph.addEdge(3, 5);
		graph.addEdge(4, 5);
		graph.addEdge(4, 6);
		
		Iterable<Integer> adjVertex = graph.adj(4);
		for(Integer vertex : adjVertex){
			System.out.println("Vertext :: "+vertex);
		}
		
		DFSSearch<Integer> dfsSearchDemo = new DFSSearch<Integer>(graph, 0);
		
		//dfsSearchDemo.printEdges();
		
		if(dfsSearchDemo.hasPathTo(3)){
			Iterable<Integer> pathKeys =  dfsSearchDemo.pathTo(3);
			for(Integer pathKey : pathKeys){
				System.out.print(pathKey + "<---");
			}
		}
		
		System.out.println();
		System.out.println("*********BFS********************");
		
		BFSSearch bfsDemo = new BFSSearch(graph, 0);
		
		if(bfsDemo.hasPathTo(3)){
			Iterable<Integer> pathKeys =  bfsDemo.pathTo(3);
			for(Integer pathKey : pathKeys){
				System.out.print(pathKey + "<---");
			}
		}
		
		//bfsDemo.printEdges();
		
		
		
	}

}
