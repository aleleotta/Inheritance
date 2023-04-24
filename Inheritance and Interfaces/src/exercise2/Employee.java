package exercise2;

public class Employee {
	private String name = "";
	
	public Employee() {}
	
	public Employee(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Name: " + name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

/*
(Es recomendable ver el enunciado)
Codifica la siguiente jerarquía de clases java representada por este diagrama UML:

La clase base es la clase Empleado. Esta clase contiene:
Un atributo privado nombre de tipo String.
Un constructor por defecto.
Un constructor con parámetros que inicializa el nombre con el String que recibe.
Método set y get para el atributo nombre.
Un método toString() que devuelve el String: "Empleado " + nombre.
El resto de clases sólo deben sobrescribir el método toString() en cada una de ellas y
declarar el constructor adecuado de forma que cuando se ejecuten las siguientes instruccione:
*/