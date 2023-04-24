package exercise2;

public class Director extends Employee {
	
	public Director(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return super.toString() + " -> Director";
	}
}
