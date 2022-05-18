package strcs;

public class Edge<E> {

	private Vertex<E> vO;
	private Vertex<E> vF;
	private int cost;
	
	public Edge(Vertex<E> vO, Vertex<E> vF, int cost)
	{
		this.vO = vO;
		this.vF = vF;
		this.cost = cost;
	}
	
	
	
	
}