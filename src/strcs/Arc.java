package strcs;

public class Arc {

	int destination;
	double weigth;
	
	public Arc(int destination)
	{
		this.destination = destination;
	}
	
	public Arc(int destination, double weight)
	{
		this.destination = destination;
		this.weigth = weight;
	}
	
	
	public boolean equals(Object n)
	{
	 Arc a = (Arc)n;
	 return destination == a.destination;
	}

	public int getDestination() {
		return destination;
	}

	public void setDestination(int destination) {
		this.destination = destination;
	}
	
}
