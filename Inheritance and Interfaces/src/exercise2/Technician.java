package exercise2;

public class Technician extends Worker {
	
	public Technician(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return super.toString() + " -> Technician";
	}
}