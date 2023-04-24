package exercise2;

public class Worker extends Employee {
	
	public Worker(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return super.toString() + " -> Worker";
	}
}