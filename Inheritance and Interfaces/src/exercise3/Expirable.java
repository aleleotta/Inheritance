package exercise3;

public class Expirable extends Product {
	private int ExpireDays = 0;
	
	public Expirable(String name, double price) {
		super(name, price);
	}

	public int getExpireDays() {
		return ExpireDays;
	}

	public void setExpireDays(int expireDays) {
		ExpireDays = expireDays;
	}
	
}
