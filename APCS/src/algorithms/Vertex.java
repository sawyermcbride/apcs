package algorithms;

import java.util.ArrayList;

public class Vertex {
	//adjecency list
	ArrayList<Edge> neighborhood;
	private String label;
	
	public Vertex(String label) {
		this.label = label;
		this.neighborhood = new ArrayList<Edge>();
	}
	public void addNeighbor(Edge e) {
		if(this.neighborhood.contains(e))
			return;
		this.neighborhood.add(e);
	}
	public String getLabel() {
		return this.label;
	}
	public boolean containsNeighbor(Edge e) {
		return this.neighborhood.contains(e);
	}
	public Edge getNeighbor(int i) {
		return this.neighborhood.get(i);
	}
	public void removeNeighbor(Edge e) {
		this.neighborhood.remove(e);
	}
	
}