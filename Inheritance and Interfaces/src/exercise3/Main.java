package exercise3;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Product[] collection = new Product[0];
		Expirable expProduct;
		NotExpirable notExpProduct;
		Scanner sc = new Scanner(System.in);
		char option = 'Y';
		while(option == 'Y' || option == 'y') {
			String name = "";
			double price = -1;
			char expirable = 'Z';
			System.out.print("Introduce a name for the following product: ");
			name = sc.next();
			while(price < 0) {
				System.out.print("Introduce a price for the following product: ");
				price = sc.nextDouble();
				sc.nextLine();
				if(price < 0) {
					System.out.println("You can't introduce a negative price. Try again!");
				}
			}
			while(expirable != 'Y' && expirable != 'y' && expirable != 'N' && expirable != 'n') {
				System.out.println("Is the following product expirable? Y/N");
				expirable = sc.next().charAt(0);
			}
			if(expirable == 'Y' || expirable == 'y') {
				int expireDays = 0;
				int amount = 0;
				System.out.print("Introduce expiration days left: ");
				while(expireDays <= 0) {
					expireDays = sc.nextInt();
				}
				System.out.print("Introduce amount of units: ");
				amount = sc.nextInt();
				expProduct = new Expirable(name, price, expireDays);
				expProduct.setPrice(expProduct.calculate(amount) * amount);
				collection = Arrays.copyOf(collection, collection.length+1);
				collection[collection.length-1] = expProduct;
			} else if(expirable == 'N' || expirable == 'n') {
				String type = "";
				System.out.print("Specify type of not expirable product: ");
				sc.nextLine();
				type = sc.nextLine();
				notExpProduct = new NotExpirable(name, type, price);
				collection = Arrays.copyOf(collection, collection.length+1);
				collection[collection.length-1] = notExpProduct;
			}
			System.out.println("Would you like to insert another product? Y/N");
			option = sc.next().charAt(0);
		}
		System.out.println("Would you like to see the list of all products? Y/N");
		option = sc.next().charAt(0);
		if(option == 'Y' || option == 'y') {
			int i = 1;
			for(Product product: collection) {
				System.out.println("\nProduct " + i + ":" + product.toString());
				i++;
			}
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