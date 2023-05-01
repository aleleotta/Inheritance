package exercise5;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
	}
}

/*
Realizar un programa para calcular el área de varios polígonos (triángulos y rectángulos).
El programa debe ser capaz de almacenar en un array varios triángulos y rectángulos, y, al final,
mostrar el área y los datos de cada uno.
Para ello se tendrá lo siguiente:
	Una superclase llamada Polígono. Esta clase será abstracta.
	Una subclase llamada Rectángulo.
	Una subclase llamada Triángulo.
Para ello utiliza el siguiente diagrama de clases: (Ver el enunciado.)

En Poligono el único método abstracto es area(), porque es el único que no podemos calcular si no sabemos qué tipo de polígono es.
En el método toString se debe devolver una cadena con el número de lados.
Define también un constructor con parámetros y un método get para el atributo numeroLados.
Define para las clases Rectangulo y Triangulo constructores sin parámetros y con parámetros.
Añade también los getter y setter de Rectangulo y Triangulo.
En los métodos toString se debe mostrar el tipo de Polígono que es, Rectángulo o Triángulo, y los valores de cada lado.
No usar el toString que genera por defecto el entorno de desarrollo.
En el caso de Triangulo, para calcular su área partiendo de la longitud de sus tres lados tienes que usar la fórmula de Herón.
Investiga por Internet cómo aplicar esta fórmula.
En la clase principal se debe mostrar el siguiente menú:
1. Introducir triángulo.
2. Introducir rectángulo.
3. Mostrar contenido del array.
En caso de que se introduzca la opción 1, se le solicitarán al usuario los datos necesarios para crear un triángulo y lo introducirá en el array.
En caso de que se introduzca la opción 2, se le solicitarán al usuario los datos necesarios para crear un rectántulo y lo introducirá en el array.
En caso de que se introduzca la opción 3, se debe mostrar la información contenida en el array,  además del valor del área de cada una de las figuras almacenadas.
Utiliza funciones para implementar cada una de las opciones.
*/