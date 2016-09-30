package algorithms;

import java.util.ArrayList;
import java.util.HashMap;

class Graph {	
	private HashMap<String, Vertex> vertices; //adjecency list, vertex label and its adjectent vertices
	private HashMap<Integer, Edge> edges;
	
	public Graph() {
		this.vertices = new HashMap<String, Vertex>();
		this.edges = new HashMap<Integer, Edge>();
	}
	public Graph(ArrayList<Vertex> vertices) { //accepts initial vertices
		this.vertices = new HashMap<String, Vertex>();
		this.edges = new HashMap<Integer, Edge>();
		
		for(Vertex v: this.vertices) {
			this.vertices.put(v.getLabel(), v);
		}
	}
	public boolean addEdge(Vertex one, Vertex two, int weight) {
		if(one.equals(two))
			return false;
		
		Edge e = new Edge(one, two, weight)
	}
	
}