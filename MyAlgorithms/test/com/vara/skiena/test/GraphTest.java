/**
 * 
 */
package com.vara.skiena.test;

import java.io.IOException;

import com.vara.algorithm.util.BreadthFirstSearchPaths;
import com.vara.algorithm.util.DepthFirstSearchPaths;
import com.vara.core.Graph;
import com.vara.core.Paths;

/**
 * @author vpsrini
 *
 */
public class GraphTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Graph G = new Graph("testgraph.txt");
			G.display();
			System.out.println("No of Edges :: "+G.getEdges());
			
			Paths gp = new BreadthFirstSearchPaths(G, 0);
			
			System.out.println("Has Path To (6) :: " + gp.hasPathTo(6));
			
			for(int pv : gp.pathTo(6)){
				System.out.println(pv +"\t");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
