package exercise4;

public class Electronic {
	protected double price = 0;
	protected char energyConsumption = 'Z';
	protected double weight = 0;
	protected enum color {
		WHITE, BLACK, RED, BLUE, GRAY
	}
	
	public Electronic() {}
	
	public Electronic(double price, double weight) {
		if(price > 0 && weight > 0) {
			this.price = price;
			this.weight = weight;
		}
	}
	
	public Electronic(double price, double weight, char energyConsumption) {
		if(price > 0 && weight > 0 && (energyConsumption == 'A' || energyConsumption == 'B' || energyConsumption == 'C'
				|| energyConsumption == 'D' || energyConsumption == 'E' || energyConsumption == 'F')) {
			this.price = price;
			this.weight = weight;
			this.energyConsumption = energyConsumption;
		}
	}
	
	public void checkEnergyConsumption() {}
	
	public void checkColor() {}
	
	public double finalPrice() {
		double finalPrice = 0;
		return finalPrice;
	}

	public double getPrice() {
		return price;
	}

	public char getEnergyConsumption() {
		return energyConsumption;
	}

	public double getWeight() {
		return weight;
	}
	
}

/*
Crearemos una superclase llamada Electrodomestico con las siguientes características:
Sus atributos son precio base, color, consumo energético (letras entre A y F) y peso. Indica que se podrán heredar. 
Los colores disponibles son blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en minúsculas.
Por defecto, el color será blanco, el consumo energético será F, el precioBase es de 100 € y el peso de 5 kg. 
Los constructores que se implementarán son: 
	Un constructor por defecto.
	Un constructor con el precio y peso. El resto de atributos tomarán los valores por defecto. 
	Un constructor con todos los atributos. 
Los métodos que implementará son:
	Métodos get de todos los atributos. 
	comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta. Si no es correcta, usará la letra por defecto. Se invocará al crear el objeto y no será visible. 	
	comprobarColor(String color): comprueba que el color es correcto, si no lo es usa el color por defecto. Se invocará al crear el objeto y no será visible.	
	precioFinal(): según el consumo energético, aumentará su precio base, y según su tamaño, también aumentará su precio base. Esta es la lista de precios:
	(Ver el enunciado.)

Crearemos una subclase llamada Lavadora con las siguientes características:
	Su atributo es carga, además de los atributos heredados. 
	Por defecto, la carga es de 5 kg.
Los constructores que se implementarán serán: 	
	Un constructor por defecto. 		
	Un constructor con el precio y peso. El resto de atributos tomarán el valor por defecto. 
	Un constructor con la carga y el resto de atributos heredados. 
	Recuerda que debes llamar al constructor de la clase padre. 
Los métodos que se implementara serán: 
	Método get de carga.
	precioFinal(): si tiene una carga mayor de 30 kg, aumentará el precio 50 €, si no es así, no se incrementará el precio.
	Llama al método padre y añade el código necesario. Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio. 		

Crearemos una subclase llamada Television con las siguientes características:
	Sus atributos son resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos heredados. 	
	Por defecto, la resolución será de 20 pulgadas y el sintonizador será false. 	
Los constructores que se implementarán serán: 	
	Un constructor por defecto. 	
	Un constructor con el precio y peso. El resto por defecto. 	
	Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. 
	Recuerda que debes llamar al constructor de la clase padre. 
Los métodos que se implementarán son:
	Métodos get de resolución y sintonizador TDT. 	
	precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará 50 €. Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.  	

Ahora crea una clase ejecutable que realice lo siguiente:
	Crea un array de tipo Electrodomestico de 10 posiciones.
	Asigna a cada posición un objeto de las clases anteriores con los valores que desees. No hace falta pedir los datos por teclado, puedes ponerlos directamente en los constructores. Prueba todos y cada uno de los constructores de las distintas clases creadas: Electrodomestico, Lavadora y Television. Juego con distintos valores para la eficiencia energética y para el peso, para así probar todas las variaciones de precio.
	Ahora, recorre este array y ejecuta el método precioFinal() para cada posición del array. Imprime también el precio base del electrodoméstico en cuestión tras ejecutar precioFinal().
	Al final del todo, deberás mostrar el precio de cada clase, es decir, el precio de todas las televisiones por un lado, el de las lavadoras por otro y la suma de los Electrodomesticos. Recuerda el uso operador instanceof. 
	Por ejemplo, si tenemos un objeto de tipo Electrodomestico con un precio final de 300, una lavadora de 200 y una televisión de 500, el resultado final será de 1000 (300+200+500) para electrodomésticos, 200 para lavadora y 500 para televisión.
	*/