package exercise3;

public class NotExpirable extends Product {
	private String type = "";
	
	public NotExpirable(String name, double price) {
		super(name, price);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n\tType: " + this.type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
