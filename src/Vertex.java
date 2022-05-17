import java.util.ArrayList;

public class Vertex<E> {

	private E element;
	private int num;
	private ArrayList<E> adjacency;
	
	public Vertex(E element) {
		
		this.element = element;
		this.adjacency = new ArrayList<E>();

	}

}
