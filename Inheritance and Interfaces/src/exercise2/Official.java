package exercise2;

public class Official extends Worker {
	
	public Official(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return super.toString() + " -> Official";
	}
}
