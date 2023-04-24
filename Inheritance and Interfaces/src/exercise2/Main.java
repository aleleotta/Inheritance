package exercise2;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Employee E1 = new Employee("Rafa");
		Director D1 = new Director("Mario");
		Worker OP1 = new Worker("Mario");
		Official OF1 = new Official("Luis");
		Technician T1 = new Technician("Pablo");
		System.out.println(E1);
		System.out.println(D1);
		System.out.println(OP1);
		System.out.println(OF1);
		System.out.println(T1);
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