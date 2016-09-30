package algorithms;

public class Edge implements Comparable<Edge>{
	private int weight;
	private String label;
	private Vertex one, two;
	
	public Edge(Vertex one, Vertex two, String label, int weight) {
		this.one = one;
		this.two = two;
		this.label = label;
		this.weight = weight;
	}
	public int getWeight() {
		return this.weight;
	}
	public String getLabel() {
		return this.label;
	}
	public Vertex getNeighbor(Vertex current) {
		if( !(current.equals(one) || current.equals(two))) {
			return null;
		} else
			return (current.equals(one))? two: one; 
	}
	public Vertex getOne() {
		return this.one;
	}
	public int compareTo(Edge other) {
		return this.weight - other.weight;
	}
	public boolean equals (Edge other) {
		if(!(other instanceof Edge)) 
			return false;
		return other.one.equals(this.one) && other.two.equals(this.two);
	}
	

}
