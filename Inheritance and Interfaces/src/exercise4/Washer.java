package exercise4;

public class Washer extends Electronic {
	private double weight = 5;
	
	public Washer() {}
	
	public Washer(double price, double weight) {
		super(price, weight);
		this.weight = weight;
	}

	public Washer(double price, double weight, char energyConsumption) {
		super(price, weight, energyConsumption);
		this.weight = weight;
	}
	
}