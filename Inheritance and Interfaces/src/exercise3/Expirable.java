package exercise3;

public class Expirable extends Product {
	private int expireDays = 0;
	
	public Expirable(String name, double price, int expireDays) {
		super(name, price);
		this.expireDays = expireDays;
	}
	
	@Override
	public double calculate(int productAmount) {
		double result = 0;
		if(expireDays == 3) {
			result = super.calculate(productAmount) / 2;
		} else if(expireDays == 2) {
			result = super.calculate(productAmount) / 3;
		} else if(expireDays == 1) {
			result = super.calculate(productAmount) / 4;
		}
		return result;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n\tDays left until expiration: " + this.expireDays;
	}

	public int getExpireDays() {
		return expireDays;
	}

	public boolean setExpireDays(int expireDays) {
		boolean check = false;
		if(expireDays <= 0) {
			this.expireDays = expireDays;
			check = true;
		}
		return check;
	}
	
}
