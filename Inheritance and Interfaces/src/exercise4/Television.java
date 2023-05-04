package exercise4;

public class Television extends Electronic {
	private int resolution = 20;
	private boolean tuner = false;
	
	public Television() {}
	
	public Television(double price, double weight) {
		super(price, weight);
		this.weight = weight;
	}
	
	public Television(double price, double weight, char energyConsumption, int resolution, boolean tuner) {
		super(price, weight, energyConsumption);
		this.resolution = resolution;
		this.tuner = tuner;
	}
	
}