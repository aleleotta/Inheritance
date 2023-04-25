package exercise3;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Product[] collection = new Product[0];
		Product productObj;
		Scanner sc = new Scanner(System.in);
		char option = 'Y';
		while(option == 'Y' || option == 'y') {
			String name = "";
			double price = 0;
			System.out.print("Introduce a name for the following product: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Introduce a price for the following product: ");
			while(price < 0) {
				price = sc.nextDouble();
				if(price < 0) {
					System.out.println("You can't introduce a negative price. Try again!");
				}
			}
			productObj = new Product(name, price);
			collection = Arrays.copyOf(collection, collection.length+1);
			collection[collection.length-1] = productObj;
			System.out.println("Would you like to insert another product? Y/N");
			option = sc.next().charAt(0);
		}
		sc.close();
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