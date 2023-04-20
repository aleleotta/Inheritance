package exercise1;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		int hour = 0;
		int minute = 0;
		int second = 0;
		Hour time = new Hour();
		ExactHour time1 = new ExactHour();
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to set a specific time?");
		char set = sc.next().charAt(0);
		switch(set) {
		case 'Y', 'y':
			System.out.println("With seconds?");
			set = sc.next().charAt(0);
			switch(set) {
			case 'Y', 'y':
				System.out.print("Hours: ");
				hour = sc.nextInt();
				System.out.print("Minutes: ");
				minute = sc.nextInt();
				System.out.print("Seconds: ");
				second = sc.nextInt();
				time1 = new ExactHour(hour, minute, second);
				ExactHour.objectLinker(time1, time);
				break;
			case 'N', 'n':
				System.out.print("Hours: ");
				hour = sc.nextInt();
				System.out.print("Minutes: ");
				minute = sc.nextInt();
				time = new Hour(hour, minute);
				break;
			}
			break;
		case 'N', 'n':
			time = new Hour();
			time1 = new ExactHour();
			break;
		default:
			time = new Hour();
			time1 = new ExactHour();
			break;
		}
		int option = 0;
		while(option != 3) {
			System.out.print("\nMenu:\n\n1) Print\n2) Increase\n3) Terminate\n\nOption: ");
			option = sc.nextInt();
			switch(option) {
			case 1: //Print
				char option1;
				System.out.println("With seconds?");
				option1 = sc.next().charAt(0);
				if(option1 == 'Y' || option1 == 'y') {
					System.out.println(time1.toString());
				} else {
					System.out.println(time.toString());
				}
				break;
			case 2: //Increase
				System.out.println("Increase seconds?");
				option1 = sc.next().charAt(0);
				if(option1 == 'Y' || option1 == 'y') {
					time.increase();
					time1.increase();
					System.out.println(time1.toString());
				} else {
					time.increase();
					System.out.println(time.toString());
				}
				break;
			case 3: //Exit
				System.out.println("\n\nTerminating...\n\n\nProgram terminated!");
				break;
			default: //Error
				System.out.println("\nIntroduce a valid option!\n");
				break;
			}
		}
		sc.close();
	}
}

/*
Diseñar la clase Hora, que representa un instante de tiempo compuesto por la hora (de 0 a 23) y los minutos.
Dispone de los siguientes métodos:
	Hora(hora, minuto): construye un objeto con los datos pasados como parámetros.
	void inc(): incrementa la hora en un minuto.
	boolean setMinutos(valor): asigna un valor, si es válido, a los minutos.
	Devuelve true o false según haya sido posible modificar los minutos o no.
	boolean setHora(valor): asigna un valor, si está comprendido entre 0 y 23, a la hora.
	Devuelve true o false según haya sido posible cambiar la hora o no.
	String toString(): devuelve un String con la representación de la hora: hora:minutos.
A partir de la clase Hora, implementar la clase HoraExacta, que incluye en la hora los segundos.
Además de los métodos heredados de Hora dispondrá de:
	HoraExacta(hora, minuto, segundo): construye un objeto con los datos pasados como parámetros.
	setSegundo(valor): asigna, si está comprendido entre 0 y 59, el valor indicado a los segundos.
	inc(): incrementa la hora en un segundo. Hará uso del método inc() de la superclase.
*/