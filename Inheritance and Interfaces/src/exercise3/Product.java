package exercise3;

public class Product {
	private String name = "";
	private double price = 0;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double calculate(int productAmount) {
		double result = 0;
		result = this.price * productAmount;
		return result;
	}
	
	@Override
	public String toString() {
		return "\n\tName: " + this.name
				+ "\n\tPrice: " + this.price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}

/*
Nos piden hacer un programa que gestione una serie de productos. Los productos tienen los siguientes atributos:
	Nombre
	Precio
Tenemos dos tipos de productos:
	Perecedero: tiene un atributo llamado días a caducar.
	No perecedero: tiene un atributo llamado tipo.

Crea sus constructores, getters, setters y toString para todas las clases.

Tendremos una función llamada calcular, que devuelve un tipo double, y que según la clase hará una cosa u otra.
A esta función le pasaremos un número que será la cantidad de productos:
a) En Producto, simplemente sería multiplicar el precio por la cantidad de productos pasados y devolverá el resultado.
b) En Perecedero, además de lo que hace producto, el precio se reducirá según los días a caducar:
		Si le queda 1 día para caducar, se reducirá 4 veces el precio final.
		Si le quedan 2 días para caducar, se reducirá 3 veces el precio final.
		Si le quedan 3 días para caducar, se reducirá a la mitad de su precio final.
	En NoPerecedero, hace lo mismo que en producto.
c) Crea una clase ejecutable y crea un array de productos (array de objetos).

Crea productos de distinto tipo y muestra el precio total de vender 5 productos de cada uno. 
*/