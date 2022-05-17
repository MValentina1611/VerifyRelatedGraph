package strcs;

public interface Graph<E> {

	public void addVertex(E vertex);
	public E getVertex(int num);
	public void addEdge(int vi, int vf);
	public int edgeCost(int vi, int vf);
	
	
	
}
