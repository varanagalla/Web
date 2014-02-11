/**
 * 
 */
package com.vara.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author vpsrini
 *
 */
public class Graph {
	private int edges;
	private int vertices;
	private List<Integer>[] adj;
	
	public Graph(int vertices){
		this.initializeGraph(vertices);
	}
	
	public Graph(String fileName) throws IOException{
		BufferedReader br = null;
		try{
			File inFile = new File(fileName);
			if(!inFile.exists() || !inFile.isFile()){
				System.err.println("FATAL!!! Given file does not exist or not a valid file.");
			}
			
			br = new BufferedReader(new InputStreamReader(new FileInputStream(inFile)));
			String line = br.readLine();
			this.vertices = Integer.parseInt(line);
			this.initializeGraph(vertices);
			while((line=br.readLine()) != null){
				String[] vertex = line.trim().split(" ");
				if(vertex.length > 1){
					this.addEdge(Integer.parseInt(vertex[0]), Integer.parseInt(vertex[1]));
				}
			}
		}
		finally{
			if(br != null){
				br.close();
			}
		}
		
	}
	
	@SuppressWarnings("unchecked")
	private void initializeGraph(int vertices){
		this.vertices = vertices;
		this.edges = 0;
		this.adj = (ArrayList<Integer>[])new ArrayList[vertices];
		for(int vi=0; vi < vertices; vi++){
			adj[vi] = new ArrayList<Integer>();
		}
	}
	
	public void addEdge(int sv, int dv){
		adj[sv].add(dv);
		adj[dv].add(sv);
		this.edges++;
	}
	
	public void display(){
		for(int vi=0; vi<this.vertices; vi++){
			if(!adj[vi].isEmpty()){
				for(Integer adjv : adj[vi]){
					System.out.println( vi + "-" + adjv);
				}
			}
		}
	}
	
	/**
	 * @return the edges
	 */
	public int getEdges() {
		return edges;
	}

	/**
	 * @return the vertices
	 */
	public int getVertices() {
		return vertices;
	}

	public Iterable<Integer> adj(int vertex){
		return adj[vertex];
	}
	
	
}
